
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
object loginMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* login Template File */
  def apply/*2.2*/(title: String)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.31*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="UTF-8">
        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
		"""),_display_(/*10.4*/headlinks("css/javascripts/jquery")),format.raw/*10.39*/("""
	  """),format.raw/*11.4*/("""</head>
    <body style="background-color:gray;">
    	<div class="container" style="background-color:white;">
	       	<div class="row">
	       		<div class="col-md-12">
	       			"""),_display_(/*16.13*/headerlogin("header")),format.raw/*16.34*/("""
	       		"""),format.raw/*17.11*/("""</div>
	       	</div>
	       	<div class="row">
	       		<div class="col-md-3">
	       			"""),_display_(/*21.13*/leftlinkpanel("leftlinkpanel")),format.raw/*21.43*/("""
	       		"""),format.raw/*22.11*/("""</div>
	       		<div class="col-md-9">
	       			<div class="panel panel-default">
  						<div class="panel-body">
	       					"""),_display_(/*26.15*/content),format.raw/*26.22*/("""    				
						"""),format.raw/*27.7*/("""</div>
  					</div>
				</div>
	       	</div>
	       	"""),_display_(/*31.11*/footer("Footer")),format.raw/*31.27*/("""
		"""),format.raw/*32.3*/("""</div>
	</body>
</html>	"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:59:47 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/loginMain.scala.html
                  HASH: 5366e71a81749a1eee1f0a75def5d32e8df01ef0
                  MATRIX: 556->27|673->56|701->58|805->136|830->141|945->230|1001->265|1032->269|1243->453|1285->474|1324->485|1446->580|1497->610|1536->621|1695->753|1723->760|1765->775|1850->833|1887->849|1917->852
                  LINES: 19->2|22->2|24->4|28->8|28->8|30->10|30->10|31->11|36->16|36->16|37->17|41->21|41->21|42->22|46->26|46->26|47->27|51->31|51->31|52->32
                  -- GENERATED --
              */
          