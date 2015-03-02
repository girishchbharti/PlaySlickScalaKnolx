package com.knoldus.models

import java.util.Date
import java.sql.{ Date => SqlDate }
import play.api.Play.current
import play.api.db.slick.Config.driver.simple._
import scala.slick.lifted.Tag
import java.sql.Timestamp


case class Knol(name: String, email: String, m_no: String, id: Option[Int] = Some(0))
case class KnolSession(topic: String, sdate: Date, knolId: Option[Int], id: Option[Int])
case class Knolx(id: Int, name: String, email: String, m_no: String, sId: Option[Int], topic: String, sdate: Date)

case class User(name: String, address: String, company: String, email: String, password: String,phone: String, 
    userType: Int, created: Date, updated: Date, id: Option[Int]=Some(0))
/**
 * ******************************
 * Helper for pagination        *
 * ******************************
 */
case class Page[A](items: Seq[A], page: Int, offset: Long, total: Long) {
  lazy val prev = Option(page - 1).filter(_ >= 0)
  lazy val next = Option(page + 1).filter(_ => (offset + items.size) < total)
}

/**
 * **********************************************************
 *  This class define mapping of Table query with KnolTable.*
 * **********************************************************
 */
class KnolTable(tag: Tag) extends Table[Knol](tag, "knol") {
  def name: Column[String] = column[String]("name", O.NotNull)
  def email: Column[String] = column[String]("email", O.NotNull)
  def m_no: Column[String] = column[String]("m_no", O.NotNull)
  def id: Column[Option[Int]] = column[Option[Int]]("id", O.PrimaryKey, O.AutoInc)
  def * = (name, email, m_no, id) <> (Knol.tupled, Knol.unapply)
}
/**
 * **************************************************************
 *  This class define mapping of Table query with session Table.*
 * **************************************************************
 */

class SessionTable(tag: Tag) extends Table[KnolSession](tag, "session") {

  //Mapper for mapping java.util.Date and sql.Date
  implicit val util2sqlDateMapper = MappedColumnType.base[java.util.Date, java.sql.Date](
    { utilDate => new java.sql.Date(utilDate.getTime()) },
    { sqlDate => new java.util.Date(sqlDate.getTime()) })

  //Creating object of table query form oprations  
  val knolTable = TableQuery[KnolTable]

  //mapping case class and postgres table attributes
  def topic: Column[String] = column[String]("topic", O.NotNull)
  def sdate: Column[Date] = column[Date]("sdate", O.NotNull)
  def knolId: Column[Option[Int]] = column[Option[Int]]("knolid", O.NotNull)
  def id: Column[Option[Int]] = column[Option[Int]]("id", O.PrimaryKey, O.AutoInc)
  def * = (topic, sdate, knolId, id) <> (KnolSession.tupled, KnolSession.unapply)
  def fk = foreignKey("knol_id_fk", knolId, knolTable)(_.id)
}
/**
 * ***************************************************************
 *  This class define mapping of Table query with knoluser Table.*
 * ***************************************************************
 */
class UserTable(tag: Tag) extends Table[User](tag, "knoluser") {

  implicit val util2sqlDateMapper = MappedColumnType.base[java.util.Date, java.sql.Date](
    { utilDate => new java.sql.Date(utilDate.getTime()) },
    { sqlDate => new java.util.Date(sqlDate.getTime()) })

  def name: Column[String] = column[String]("name", O.NotNull)
  def address: Column[String] = column[String]("address")
  def company: Column[String] = column[String]("company", O.NotNull)
  def email: Column[String] = column[String]("email", O.NotNull)
  def password: Column[String] = column[String]("password", O.NotNull)
  def phone: Column[String] = column[String]("phone")
  def userType: Column[Int] = column[Int]("userType")
  def created: Column[Date] = column[Date]("created")
  def updated: Column[Date] = column[Date]("updated")
  def id: Column[Option[Int]] = column[Option[Int]]("id", O.PrimaryKey, O.AutoInc)
  def * = (name, address, company, email, password, phone, userType, created, updated, id) <> (User.tupled, User.unapply)
}


object UserTable {
  //creating table query for UserTable
  val userTable = TableQuery[UserTable]
  
  //creating autoincremented id table query
  val userAutoIncrement = userTable returning userTable.map(_.id)

  /**
   * **************************************************
   * This function takes user object and create a new *
   * user into database.                              *
   * Input: user:User                                 *
   * Output: Number of records inserted.              *
   * **************************************************
   */
  def addUser(newuser: User)(implicit session: Session): Int = {
    userTable.insert(newuser)
  }

  /**
   * ******************************************************
   * This function takes email id and password and        *
   * validate login and return Some(1) if login successful*
   * or Some(0) if login fail.                            *
   * Input: email:String,password:String                  *
   * Output: Some(1) or Some(0).                          *
   * ******************************************************
   */
  def logInValidate(email: String, password: String)(implicit session: Session): Option[Int] = {
    val list = userTable.filter(_.email === email).list
      try {
        val user = list.head
        if(user.password == password)
          Some(1)
        else
          Some(0)
      } catch 
      {
        case ex: Exception => Some(0)
      }
  }
  
  /**
   * **************************************************
   * This function takes email:String and returns     *
   * corresponding user:User object.                  *
   * Input: email:String                              *
   * Output: userid:Some[User]                        *
   * **************************************************
   */
  def getuser(email:String)(implicit session:Session):Option[User] = {
    val list= userTable.filter(_.email === email).list
    val user=list.head
    Some(user)
  }
  
  /**
   * **************************************************
   * This function takes User object and return number* 
   * of user inserted.                                *
   * Input: user:User                                 *
   * Output:count:Int                                 *
   * **************************************************
   */
  def updateuser(user:User)(implicit session:Session):Int = {
    userTable.filter(_.id === user.id).update(user)
  }
  
  /**
   * **************************************************
   * This function takes emailid and returns          *
   * corresponding userid.                            * 
   * Input: page,pagesize,orderBy,filter              *
   * Output: Page[Knol].                              *
   * **************************************************
   **/
  def getid(email:String)(implicit session:Session):Some[Int]={
    val query = userTable.filter(_.email === email).list
    val id= query.head.id
    Some(id.get)
  }
}

object KnolTable {

  val knolTable = TableQuery[KnolTable]
  
  /**
   * **************************************************
   * This function takes knol object and insert record* 
   * in knol table in databse                         *
   * Input: page,pagesize,orderBy,filter              *
   * Output: Page[Knol].                              *
   * **************************************************
   */
  def add(knol: Knol)(implicit session: Session): Int = {
    knolTable.insert(knol)
  }
  
  /**
   * **************************************************
   * This function takes no arguments and return list *
   * of knols.                                        *
   * Input: None                                      *
   * Output: list:List[Knol]                          *
   * **************************************************
   */
  def showAllKnols()(implicit s: Session): List[Knol] = {
    knolTable.list(s)
  }

  /**
   * **************************************************
   * This function takes knol id and return knol      *
   * object.                                          *
   * Input: knolid:int                                *
   * Output: knol:Knol(Object)                        *
   * **************************************************
   */
  def getKnol(id: Int)(implicit s: Session): Knol = {
    val list = knolTable.list
    val knol = list.filter(knol => knol.id.get == id).head
    knol
  }
  
  /**
   * **************************************************
   * This function updates knol record in database.   *
   * Input: knol:Knol(Object           )              *
   * Output: Number of records updated.               *
   * **************************************************
   */
  def updateKnol(knol: Knol)(implicit session: Session): Int = {
    knolTable.filter(_.id === knol.id).update(knol)
  }
  
  /**
   * **************************************************
   * This function deletes knolder record from        *
   * database.                                        *
   * Input: knolid:Int                                *
   * Output: Number of records deleted.               *
   * **************************************************
   */
  def deleteknol(id: Int)(implicit session: Session) = {
    knolTable.filter(_.id === id).delete
  }
  
  /**
   * **************************************************
   * This function generate Knol list according to    *
   * pagination.                                      *
   * Input: page,pagesize,orderBy,filter              *
   * Output: Page[Knol].                              *
   * **************************************************
   */
  def list(page: Int = 0, pageSize: Int = 5, orderBy: Int = 1, filter: String = "%")(implicit session: Session): Page[Knol] = {
    val offset = pageSize * page
    val query = (
      for {
        knol <- knolTable
        if knol.name.toLowerCase like filter.toLowerCase()
      } yield (knol)).drop(offset).take(pageSize)

    val total = countknols(filter)
    val result = query.list
    Page(result, page, offset, total)
  }
  
  /**
   * **************************************************
   * This function returns total nuber of knolders    *
   * available in database based in filter.           *
   * Input: filter:String                             *
   * Output: total number of knolders.                *
   * **************************************************
   */
  def countknols(filter: String)(implicit s: Session): Int =
    Query(knolTable.filter(_.name.toLowerCase like filter.toLowerCase).length).first

}

object SessioTable {
  /**
   * **************************************************
   * Table Query for SessionTable is being generated  *
   * **************************************************
   */
  val sessionTable = TableQuery[SessionTable]

  /**
   * **************************************************
   * This function add a new record to knol table in  *
   * database.                                        *
   * Input: KnolSession Object                        *
   * Output: number of items inserted.                *
   * **************************************************
   */
  def add(knolsession: KnolSession)(implicit session: Session): Int = {
    sessionTable.insert(knolsession)
  }
  
  /**
   * **************************************************
   * This function delets a knol record from knol     *
   * table in database.                               *
   * Input: knolid                                    *
   * Output: number of items deleted.                 *
   * **************************************************
   */
  def delete(id: Int)(implicit session: Session) = {
    sessionTable.filter(_.id === id).delete
  }
  
  /**
   * **************************************************
   * This function update a knol in database          *
   * Input: KnolSession Object                        *
   * Output: number of items inserted.                *
   * **************************************************
   */
  def update(knolsession: KnolSession)(implicit session: Session) = {
    sessionTable.filter(_.id === knolsession.id).update(knolsession)
  }
  
  /**
   * **************************************************
   * This function generate Knol list according to    *
   * pagination.                                      *
   * Input: page,pagesize,orderBy,filter              *
   * Output: Page[Knol].                              *
   * **************************************************
   */
  def sessionlist(page: Int = 0, pageSize: Int = 5, orderBy: Int = 1, filter: String = "%")(implicit session: Session): Page[KnolSession] = {
    val offset = pageSize * page
    val query = (
      for {
        knolsession <- sessionTable
        if knolsession.topic.toLowerCase like filter.toLowerCase()
      } yield (knolsession)).drop(offset).take(pageSize)
    val total = countsession(filter)
    val result = query.list
    Page(result, page, offset, total)
  }
  
  /**
   * **************************************************
   * This function returns the total number of        *
   * sessions in database.                            *
   * Input: filter:String                             *
   * Output: total records:Int                        *
   * **************************************************
   */
  def countsession(filter: String)(implicit session: Session): Int = {
    Query(sessionTable.filter(_.topic.toLowerCase like filter.toLowerCase).length).first
  }
}