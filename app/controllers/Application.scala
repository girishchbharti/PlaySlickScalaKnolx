package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.db.slick._
import play.api.Play.current
import views._
import com.knoldus.models._

object Application extends Controller {

  /**
   * **********************************************
   * This is a form object mapped with Knol class *
   * **********************************************
   */
  val knolForm = Form(
    mapping(
      "name" -> text,
      "email" -> text,
      "m_no" -> text,
      "id" -> optional(number))(Knol.apply)(Knol.unapply))

  /**
   * ***********************************************
   * This function display the home page.          *
   * Input: No arguments                           *
   * Output: Home Page                             *
   * ***********************************************
   */
  
  val KnolListHome = Redirect(routes.Application.list())
  
  def knolhome = {KnolListHome}
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
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
    Ok(views.html.showallknols("All Knols", KnolTable.showAllKnols()))
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
          Ok("Can not update knolder")
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
  
  def showallsessions():Action[AnyContent]=DBAction{implicit rs=>
    Ok("Session table will be here")  
  }
  
  def list(page: Int, orderBy: Int, filter: String) = DBAction { implicit request =>
    val pageData = KnolTable.list(page = page, orderBy = orderBy, filter = ("%" + filter + "%"))
    Ok(views.html.list(pageData, orderBy, filter))
  }
}