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
/**
 * ******************************
 * Helper for pagination        *
 * ******************************
 */
case class Page[A](items: Seq[A], page: Int, offset: Long, total: Long) {
  lazy val prev = Option(page - 1).filter(_ >= 0)
  lazy val next = Option(page + 1).filter(_ => (offset + items.size) < total)
}

class KnolTable(tag: Tag) extends Table[Knol](tag, "knol") {
  def name: Column[String] = column[String]("name", O.NotNull)
  def email: Column[String] = column[String]("email", O.NotNull)
  def m_no: Column[String] = column[String]("m_no", O.NotNull)
  def id: Column[Option[Int]] = column[Option[Int]]("id", O.PrimaryKey, O.AutoInc)
  def * = (name, email, m_no, id) <> (Knol.tupled, Knol.unapply)
}

class SessionTable(tag: Tag) extends Table[KnolSession](tag, "session") {

  implicit val util2sqlDateMapper = MappedColumnType.base[java.util.Date, java.sql.Date](
    { utilDate => new java.sql.Date(utilDate.getTime()) },
    { sqlDate => new java.util.Date(sqlDate.getTime()) })

  val knolTable = TableQuery[KnolTable]

  def topic: Column[String] = column[String]("topic", O.NotNull)
  def sdate: Column[Date] = column[Date]("sdate", O.NotNull)
  def knolId: Column[Option[Int]] = column[Option[Int]]("knolid", O.NotNull)
  def id: Column[Option[Int]] = column[Option[Int]]("id", O.PrimaryKey, O.AutoInc)
  def * = (topic, sdate, knolId, id) <> (KnolSession.tupled, KnolSession.unapply)
  def fk = foreignKey("knol_id_fk", knolId, knolTable)(_.id)
}

object KnolTable {

  val knolTable = TableQuery[KnolTable]

  def add(knol: Knol)(implicit session: Session): Int = {
    knolTable.insert(knol)
  }
  
  def showAllKnols()(implicit s: Session): List[Knol] = {
    knolTable.list(s)
  }
  
  def getKnol(id: Int)(implicit s: Session): Knol = {
    val list = knolTable.list
    val knol = list.filter(knol => knol.id.get == id).head
    knol
  }
  
  def updateKnol(knol: Knol)(implicit session: Session): Int = {
    knolTable.filter(_.id === knol.id).update(knol)
  }
  
  def deleteknol(id: Int)(implicit session: Session) = {
    knolTable.filter(_.id === id).delete
  }
  
  def list(page: Int = 0, pageSize: Int = 5, orderBy: Int = 1, filter: String = "%")(implicit session: Session): Page[Knol] = {
    val offset = pageSize * page
    val query=(
    for{
      knol<-knolTable
      if knol.name.toLowerCase like filter.toLowerCase()
    } yield(knol)
    ).drop(offset).take(pageSize)    
    
    val total = count(filter)
    val result = query.list
    Page(result,page, offset,total)
  }
  
  def count(filter: String)(implicit s: Session): Int =
    Query(knolTable.filter(_.name.toLowerCase like filter.toLowerCase).length).first
    
    
}

object SessioTable {

}