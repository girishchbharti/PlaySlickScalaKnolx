
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:String)(implicit flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.51*/("""
"""),_display_(/*2.2*/main("About us",user)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
	
	"""),format.raw/*7.56*/("""
	"""),format.raw/*8.2*/("""<div class="row">
		<div class="col-md-12" style="padding-left:3%; padding-right:5%;">
			<br/>
			"""),_display_(/*11.5*/flash/*11.10*/.get("success").map/*11.29*/ { message =>_display_(Seq[Any](format.raw/*11.42*/("""
				"""),format.raw/*12.5*/("""<div class="alert alert-dismissable alert-success">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<strong>Message!</strong> """),_display_(/*14.33*/message),format.raw/*14.40*/("""
				"""),format.raw/*15.5*/("""</div>
			""")))}),format.raw/*16.5*/("""
		"""),format.raw/*17.3*/("""</div>
	</div>
	<div style="padding-left: 2%; padding-right:2%">
		"""),_display_(/*20.4*/aboutuscontent("About us")),format.raw/*20.30*/("""	
	"""),format.raw/*21.2*/("""</div>
""")))}))}
  }

  def render(user:String,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(user)(flash)

  def f:((String) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (user) => (flash) => apply(user)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:36:59 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/index.scala.html
                  HASH: 16daaac1ba809c692e17104373b127a95889f655
                  MATRIX: 524->1|661->50|688->52|717->73|755->74|786->300|814->302|940->402|954->407|982->426|1033->439|1065->444|1249->601|1277->608|1309->613|1350->624|1380->627|1474->695|1521->721|1551->724
                  LINES: 19->1|22->1|23->2|23->2|23->2|25->7|26->8|29->11|29->11|29->11|29->11|30->12|32->14|32->14|33->15|34->16|35->17|38->20|38->20|39->21
                  -- GENERATED --
              */
          