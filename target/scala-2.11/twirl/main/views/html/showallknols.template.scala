
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
import com.knoldus.models._
/**/
object showallknols extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[Knol],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(user:String,list:List[Knol]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*4.31*/("""

"""),_display_(/*6.2*/main("All Knolders",user)/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
	"""),format.raw/*7.2*/("""<div class="row" style="padding-left:2%; padding-right:2%;">
		<div class="col-md-6">
			<h5>Knolder Information:</h5>
		</div>
		<div class="col-md-6">
			<form class="form-inline">
  				<div class="form-group">
    				<input type="text" class="form-control txt-sm" id="exampleInputEmail3" placeholder="Search knolders">
  				</div>
  					<button type="submit" class="btn btn-primary btn-sm">Search</button>
				</form>
		</div>
	</div>
	<div class="row" style="padding: 2%; font: bold;">
			<div class="col-md-12">
				<table class="table table-striped table-hover" id="target">
					<thead style="background-color:Gray;">
    					<tr>
    						<th>KnolID</th>
      						<th>Name</th>
      						<th>Email ID</th>
      						<th>Phone</th>
      					</tr>
  					</thead>
					"""),_display_(/*31.7*/for(knol <- list) yield /*31.24*/ {_display_(Seq[Any](format.raw/*31.26*/("""
  						"""),format.raw/*32.9*/("""<tr>
  							<td>"""),_display_(/*33.15*/knol/*33.19*/.id),format.raw/*33.22*/("""</td><td><a href="#">"""),_display_(/*33.44*/knol/*33.48*/.name),format.raw/*33.53*/("""</a></td><td>"""),_display_(/*33.67*/knol/*33.71*/.email),format.raw/*33.77*/("""</td><td>"""),_display_(/*33.87*/knol/*33.91*/.m_no),format.raw/*33.96*/("""</td>
  						</tr>
					""")))}),format.raw/*35.7*/("""
				"""),format.raw/*36.5*/("""</table>
			</div>
		</div>
""")))}),format.raw/*39.2*/("""
"""))}
  }

  def render(user:String,list:List[Knol]): play.twirl.api.HtmlFormat.Appendable = apply(user,list)

  def f:((String,List[Knol]) => play.twirl.api.HtmlFormat.Appendable) = (user,list) => apply(user,list)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 13:48:10 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/showallknols.scala.html
                  HASH: 51d245036c60da45cdfd54e6b5549e80b487d606
                  MATRIX: 550->63|667->92|695->95|728->120|766->121|794->123|1611->914|1644->931|1684->933|1720->942|1766->961|1779->965|1803->968|1852->990|1865->994|1891->999|1932->1013|1945->1017|1972->1023|2009->1033|2022->1037|2048->1042|2104->1068|2136->1073|2195->1102
                  LINES: 19->4|22->4|24->6|24->6|24->6|25->7|49->31|49->31|49->31|50->32|51->33|51->33|51->33|51->33|51->33|51->33|51->33|51->33|51->33|51->33|51->33|51->33|53->35|54->36|57->39
                  -- GENERATED --
              */
          