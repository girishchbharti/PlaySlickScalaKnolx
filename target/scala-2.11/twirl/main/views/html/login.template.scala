
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

/* login Template File */
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* login Template File */
  def apply/*2.2*/(title: String)(implicit loginflash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.58*/("""

"""),_display_(/*4.2*/loginMain("title")/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
	
	"""),format.raw/*6.2*/("""<div class="row">
		<div class="col-md-12">
				"""),_display_(/*8.6*/loginform("LogInform")),format.raw/*8.28*/("""	
				
    			"""),format.raw/*10.8*/("""<!-- Flash messages will be displayed here -->
    			"""),_display_(/*11.9*/loginflash/*11.19*/.get("regmsg").map/*11.37*/ { message =>_display_(Seq[Any](format.raw/*11.50*/("""
				"""),format.raw/*12.5*/("""<div class="alert alert-dismissable alert-success">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<strong>Message:</strong> """),_display_(/*14.33*/message),format.raw/*14.40*/("""
				"""),format.raw/*15.5*/("""</div>
				""")))}),format.raw/*16.6*/("""
	    """),format.raw/*17.6*/("""</div>       		
	</div>

""")))}))}
  }

  def render(title:String,loginflash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(loginflash)

  def f:((String) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (loginflash) => apply(title)(loginflash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:41:01 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/login.scala.html
                  HASH: 4e49437c42a058e05060695b4121ad81702f7d8b
                  MATRIX: 566->27|710->83|738->86|764->104|802->105|832->109|906->158|948->180|989->194|1070->249|1089->259|1116->277|1167->290|1199->295|1383->452|1411->459|1443->464|1485->476|1518->482
                  LINES: 19->2|22->2|24->4|24->4|24->4|26->6|28->8|28->8|30->10|31->11|31->11|31->11|31->11|32->12|34->14|34->14|35->15|36->16|37->17
                  -- GENERATED --
              */
          