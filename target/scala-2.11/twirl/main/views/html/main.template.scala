
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String, user: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="UTF-8">
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
		"""),_display_(/*9.4*/headlinks("css/javascript/jquery")),format.raw/*9.38*/("""
   """),format.raw/*10.4*/("""</head>
    <body style="background-color:gray;">
    <div class="container" style="background-color:white;">
    	"""),format.raw/*15.47*/("""
    	"""),_display_(/*16.7*/header(user)),format.raw/*16.19*/("""
    	"""),format.raw/*19.59*/("""
    	"""),format.raw/*20.6*/("""<div class="row">
    		<div class="col-md-3">
    			"""),_display_(/*22.9*/leftlinkpanel("Left link panel")),format.raw/*22.41*/("""
    		"""),format.raw/*23.7*/("""</div>
    		<div class="col-md-9">
    			<div class="panel panel-default">
  					<div class="panel-body">
	       				"""),_display_(/*27.14*/content),format.raw/*27.21*/("""    				
					"""),format.raw/*28.6*/("""</div>
  				</div>		
    		</div>
    	</div>

    	"""),format.raw/*35.40*/("""
    	"""),_display_(/*36.7*/footer("Footer")),format.raw/*36.23*/("""
    """),format.raw/*37.5*/("""</div>
    </body>
</html>"""))}
  }

  def render(title:String,user:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:36:59 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/main.scala.html
                  HASH: d082e9624a7c3839ecc42928094929ce4efbfbc1
                  MATRIX: 516->1|647->44|675->46|779->124|804->129|918->218|972->252|1003->256|1146->506|1179->513|1212->525|1246->702|1279->708|1360->763|1413->795|1447->802|1596->924|1624->931|1665->945|1746->1112|1779->1119|1816->1135|1848->1140
                  LINES: 19->1|22->1|24->3|28->7|28->7|30->9|30->9|31->10|34->15|35->16|35->16|36->19|37->20|39->22|39->22|40->23|44->27|44->27|45->28|50->35|51->36|51->36|52->37
                  -- GENERATED --
              */
          