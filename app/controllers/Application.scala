package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.db.slick._
import play.api.Play.current
import views._
import com.knoldus.models._
import java.util.Date
import org.joda.time.LocalDateTime
import com.knoldus.models.User
import play.api.mvc.Flash

object Application extends Controller {

  /**
   * **********************************************
   * This is a form object mapped with Knol class *
   * **********************************************
   */
  val knolForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "email" -> email,
      "m_no" -> text,
      "id" -> optional(number))(Knol.apply)(Knol.unapply))

  /**
   * **********************************************
   * This is used for log in validation           *
   * **********************************************
   */
  val logInForm = Form(
    tuple(
      "username" -> nonEmptyText,
      "password" -> nonEmptyText))
  /**
   * **********************************************
   * This form is used for user registration.     *
   * **********************************************
   */

  /**This data type is to be changed as it is long on database**/
  val regForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "address" -> text,
      "company" -> nonEmptyText,
      "email" -> nonEmptyText,
      "password" -> nonEmptyText,
      "phone" -> text,
      "userType" -> ignored(2: Int),
      "created" -> ignored(new Date()),
      "updated" -> ignored(new Date()),
      "id" -> ignored(Some(0): Option[Int]))(User.apply)(User.unapply))

  /**
   * ***********************************************
   * This function display the home page.          *
   * Input: No arguments                           *
   * Output: Home Page                             *
   * ***********************************************
   */
  def KnolListHome = Redirect(routes.Application.list())

  /**
   * ***********************************************
   * This function display the login page.         *
   * Input: No arguments                           *
   * Output: LogIn Page                            *
   * ***********************************************
   */
  def LogInHome = Redirect(routes.Application.login())

  /**
   * ***********************************************
   * Function provide list of all knolders.        *
   * ***********************************************
   */
  def knolhome = { KnolListHome }

  /**
   * ***********************************************
   * This function display the home page.          *
   * Input: No arguments                           *
   * Output: Home Page                             *
   * ***********************************************
   */
  def login = Action { implicit request =>
<<<<<<< HEAD
    Ok(views.html.login("LogIn"))
  }

  def aboutus:Action[AnyContent] = DBAction { implicit rs =>
    rs.session.get("user").map { user=>
      Ok(views.html.aboutus("About Us",user))  
    }.getOrElse(Ok(views.html.aboutus("About Us","Guest")))  
=======
    Ok(views.html.login("LogIn")).flashing("regmsg" -> "Please LogIn for accessing services")
>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
  }

  /**
   * ***********************************************
   * This function display the login page.        *
   * Input: No arguments                           *
   * Output: Login Page                            *
   * ***********************************************
   */
  def logout = Action { implicit request =>
    Ok(views.html.login("login")).withNewSession
  }

  /**
   * ***********************************************
   * This function is used to validate the         *
   * login form input.                             *
   * Input: email and password                     *
   * Output: logged in  Page                       *
   * ***********************************************
   */
  def validatelogin: Action[AnyContent] = DBAction { implicit rs =>
    logInForm.bindFromRequest.fold(
      formWihErrors => {
        LogInHome.flashing("regmsg" -> "Log In faliure! Please enter correct email id and password!")
      },
      form => {
        val email = form._1
        val pass = form._2
        val res = UserTable.logInValidate(email, pass)
        if (res.get == 1) {
          Ok(views.html.index(form._1)).withSession("username" -> email)
        } else {
          Ok(views.html.login("LogIn")).flashing("regmsg" -> "Error occured!Please Log in again with correct email and password!")
        }
      })
  }

  /**
   * ***********************************************
   * This function is calling the registration form*
   * Input: calling action                         *
   * Output: registration page                     *
   * ***********************************************
   */
  def register = Action { implicit request =>
    Ok(views.html.register("Register", regForm))
  }

  /**
   * ***********************************************
   * This function is used to register the user    *
   * Input: required details of user               *
   * Output: Registered                            *
   * ***********************************************
   */
  def registerNow: Action[AnyContent] = DBAction { implicit rs =>
    regForm.bindFromRequest.fold(
      formWithErrors => {
<<<<<<< HEAD
        LogInHome.flashing("regmsg" -> s"Form not filled correctly! Please fill required fields!")
=======
        Ok(views.html.login("Error"))
>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
      },
      form => {
        try {
          val user = User(form.name, form.address, form.company, form.email, form.password, form.phone, 2, new Date(), new Date(), Some(0))
          val count = UserTable.addUser(user)
          LogInHome.flashing("regmsg" -> s"Registration successfull! ${form.name} Now You can login through login panel")
        } catch {
          case ex: Exception => {
<<<<<<< HEAD
            LogInHome.flashing("regmsg" -> s"Exception found! Please contact to administrator!")
=======
            LogInHome
>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
          }
        }
      })
  }
<<<<<<< HEAD

=======
  
>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
  /**
   * ******************************************************
   * This function takes no arguments and provide update  *
   * form to users for profile update.                    *
   * Input: No arguments.                                 *
   * Output:Knol records.                                 *
   * ******************************************************
<<<<<<< HEAD
   */
=======
   */  
>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
  def myprofile(): Action[AnyContent] = DBAction { implicit rs =>
    rs.request.session.get("username").map { email =>
      val user = UserTable.getuser(email)
      user match {
<<<<<<< HEAD
        case user => Ok(views.html.myprofile("Profile",email,regForm.fill(user.get)))
        case None => Ok("Error")
=======
        case user => Ok(views.html.myprofile("Profile", regForm.fill(user.get)))
        case None => Ok("Error")

>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
      }
    }.getOrElse {
      Unauthorized("Oops, you are not connected")
    }

  }

  /**
   * ******************************************************
   * This action takes no arguments and update the user   *
   * profile.                                             *
   * Input: No arguments(user form implicitly).           *
   * Output:Update status and homepage.                   *
   * ******************************************************
   */
  def updateprofile(): Action[AnyContent] = DBAction { implicit rs =>
    rs.request.session.get("username").map { email =>
      regForm.bindFromRequest().fold(
        formWithErrors => {
          Ok(views.html.index("Home")).flashing("success" -> "Please try again! You have entered form with errors!")
        },
<<<<<<< HEAD
        user => {
          val id = UserTable.getid(email).get
          val userToUpdate: User = user.copy(id = Some(id), updated = new Date())
=======
        user =>{
          val id = UserTable.getid(email).get
          val userToUpdate: User = user.copy(id = Some(id))
>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
          UserTable.updateuser(userToUpdate)
          Ok("Successfull")
        })
    }.getOrElse(Ok("Session not found"))
  }

  /**
   * ************************************************************
   * This function takes no arguments and return home page with *
   * all accesses.                                              *
   * Input: No arguments.                                       *
   * Output:Home page.                                          *
   * ************************************************************
   */
  def index = Action { implicit request =>
    request.session.get("username").map { user =>
      Ok(views.html.index(user.toString()))
    }.getOrElse {
      Unauthorized("Oops, you are not connected")
    }
  }

  /**
   * ******************************************************
   * This function takes no arguments and return page with*
   * all Knol records from database.                      *
   * Input: No arguments.                                 *
   * Output:Knol records.                                 *
   * ******************************************************
   */
  def showallknols: Action[AnyContent] = DBAction { implicit rs =>
<<<<<<< HEAD
    rs.request.session.get("username").map { user =>
      Ok(views.html.showallknols(user, KnolTable.showAllKnols()))
    }.getOrElse(Ok("You are not logged in! Please login to continue..!!"))
=======
    Ok(views.html.showallknols("All Knols", KnolTable.showAllKnols()))
>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
  }

  /**
   * ******************************************************
   * This function takes no arguments and return add new  *
   * knol page to add new Knolder.                        *
   * Input: No arguments.                                 *
   * Output:Add new Knol page.                            *
   * ******************************************************
   */
  def addknolpage(): Action[AnyContent] = DBAction { implicit rs =>
    Ok(views.html.addknolform("ADD NEW KNOL:", knolForm))
  }

  /**
   * ******************************************************
   * This function takes no arguments explicitly but post *
   * form data to server and create a new Knolder record  *
   * in database and return to showallknols page with     *
   * update message.                                      *
   * Input: No arguments.                                 *
   * Output:Show all Knols page with message.             *
   * ******************************************************
   */
  def addknol(): Action[AnyContent] = DBAction { implicit rs =>
    knolForm.bindFromRequest.fold(
      formWithErrors => {
        Ok("Form not filled properly")
      },
      form => {
        val knol = Knol(form.name, form.email, form.m_no, form.id)
        if (KnolTable.add(knol) > 0)
          KnolListHome.flashing("success" -> s"Knolder ${form.name} has been added")
        else
          Ok("Can not add knolder")
      })
  }

  /**
   * ******************************************************
   * This function takes knolid and return edit knol      *
   * page with filled knol record to update Knolder info. *
   * Input: No arguments.                                 *
   * Output:Edit Knol page.                               *
   * ******************************************************
   */
  def editknol(id: Int): Action[AnyContent] = DBAction { implicit rs =>
    val knol = KnolTable.getKnol(id)
    Ok(views.html.editknolform("EDIT KNOL:", knolForm.fill(knol), id))
  }

  /**
   * **********************************************************
   * This function takes knolid and bind edit knol from to    *
   * fetch new data and update the knolder record in database.*                                    *
   * Input: knolid.                                           *
   * Output:Show all knols page with update message.          *
   * **********************************************************
   */
  def updateknol(id: Int): Action[AnyContent] = DBAction { implicit rs =>
    knolForm.bindFromRequest.fold(
      formWithErrors => {
        Ok("Form not filled properly")
      },
      form => {
        val knol = Knol(form.name, form.email, form.m_no, Some(id))
        if (KnolTable.updateKnol(knol) > 0)
          KnolListHome.flashing("success" -> s"Knolder ${form.name} has been updated")
        else
          KnolListHome.flashing("success" -> s"Knolder ${form.name} could not updated")
      })
  }

  /**
   * ******************************************************
   * This function takes knolid and return edit knol      *
   * page to update Knolder info.                         *
   * Input: knolid                                        *
   * Output:Show all knols page with update message.      *
   * ******************************************************
   */
  def deleteknol(id: Int): Action[AnyContent] = DBAction { implicit rs =>
    KnolTable.deleteknol(id)
    KnolListHome.flashing("success" -> s"Knolder has been deleted")
  }

<<<<<<< HEAD
  /**
   * **************************************************
   * This function takes no arguments and shows all   *
   * sessions available in database                   *
   * Input: None                                      *
   * Output: Page[knolSession].                       *
   * **************************************************
   */
=======
>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
  def showallsessions(): Action[AnyContent] = DBAction { implicit rs =>
    Ok("Session table will be here")
  }

<<<<<<< HEAD
  /**
   * **************************************************
   * This function generate Knol list according to    *
   * pagination.                                      *
   * Input: page,pagesize,orderBy,filter              *
   * Output: Page[Knol].                              *
   * **************************************************
   */
=======
>>>>>>> 631477d625cb916c71dbc67ec67d6093674f97dc
  def list(page: Int, orderBy: Int, filter: String) = DBAction { implicit request =>
    val pageData = KnolTable.list(page = page, orderBy = orderBy, filter = ("%" + filter + "%"))
    Ok(views.html.list(pageData, orderBy, filter))
  }
}