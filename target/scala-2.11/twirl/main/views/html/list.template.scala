
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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Page[Knol],Int,String,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(currentPage: Page[Knol], currentOrderBy:Int, currentFilter:String)(implicit flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*7.2*/link/*7.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
    routes.Application.list(newPage, newOrderBy.map { orderBy =>
        if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
    }.getOrElse(currentOrderBy), currentFilter)
}};
Seq[Any](format.raw/*4.105*/("""


"""),format.raw/*11.2*/("""

"""),_display_(/*13.2*/main("Knolders","list")/*13.25*/ {_display_(Seq[Any](format.raw/*13.27*/("""

"""),format.raw/*15.1*/("""<!-- Begin page content -->

	<div class="row">
		<div class="col-md-12">
			<br/>
			"""),_display_(/*20.5*/flash/*20.10*/.get("success").map/*20.29*/ { message =>_display_(Seq[Any](format.raw/*20.42*/("""
				"""),format.raw/*21.5*/("""<div class="alert alert-dismissable alert-success">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<strong>Well done!</strong> """),_display_(/*23.35*/message),format.raw/*23.42*/("""
				"""),format.raw/*24.5*/("""</div>
			""")))}),format.raw/*25.5*/("""
		"""),format.raw/*26.3*/("""</div>
	</div>
	<div class="row">
		<div class="col-md-3">
			<h4><b>Knolders:</b></h4>
		</div>
		<div class="col-md-6">
			<div id="actions">
				"""),_display_(/*34.6*/helper/*34.12*/.form(action=routes.Application.list(), 'class -> "", 'role -> "search")/*34.84*/ {_display_(Seq[Any](format.raw/*34.86*/("""
					"""),format.raw/*35.6*/("""<input type="search" id="searchbox" name="f" value=""""),_display_(/*35.59*/currentFilter),format.raw/*35.72*/("""" placeholder="Search">
					<input type="submit" id="searchsubmit" value="Search knolder" class="btn btn-primary btn-sm"> 
				""")))}),format.raw/*37.6*/(""" 
			"""),format.raw/*38.4*/("""</div>		
		</div>
		<div class="col-md-3">
			<a class="btn btn-success btn-sm pull-right" id="add" href=""""),_display_(/*41.65*/routes/*41.71*/.Application.addknolpage()),format.raw/*41.97*/("""">ADD NEW KNOLDER</a>	
		</div>	
	</div>		
	<div class="row">
		<div class="col-md-12">
				"""),_display_(/*46.6*/Option(currentPage.items)/*46.31*/.filterNot(_.isEmpty).map/*46.56*/ { knols =>_display_(Seq[Any](format.raw/*46.67*/("""
				"""),format.raw/*47.5*/("""<table class="table table-striped">
					<thead style="background-color:Gray;">
    					<tr>
    						<th>KnolID</th>
      						<th>Name</th>
      						<th>Email ID</th>
      						<th>Phone</th>
      						<th>Edit</th>
      					</tr>
  					</thead>
					<tbody>
						"""),_display_(/*58.8*/knols/*58.13*/.map/*58.17*/ { knol =>_display_(Seq[Any](format.raw/*58.27*/("""
						"""),format.raw/*59.7*/("""<tr>
							<td>"""),_display_(/*60.13*/knol/*60.17*/.id),format.raw/*60.20*/("""</td>
							<td><a href=""""),_display_(/*61.22*/routes/*61.28*/.Application.editknol(knol.id.get)),format.raw/*61.62*/("""">"""),_display_(/*61.65*/knol/*61.69*/.name),format.raw/*61.74*/("""</a></td>
							<td>"""),_display_(/*62.13*/knol/*62.17*/.email),format.raw/*62.23*/("""</td>
							<td>"""),_display_(/*63.13*/knol/*63.17*/.m_no),format.raw/*63.22*/("""</td>
							<td><a href=""""),_display_(/*64.22*/routes/*64.28*/.Application.editknol(knol.id.get)),format.raw/*64.62*/("""" class="btn btn-primary btn-sm">Edit</a></td>
						</tr>
						""")))}),format.raw/*66.8*/("""
					"""),format.raw/*67.6*/("""</tbody>
				</table>
			
				"""),format.raw/*70.36*/("""
            	"""),format.raw/*71.14*/("""<ul class="pager">
            	    """),_display_(/*72.19*/currentPage/*72.30*/.prev.map/*72.39*/ { page =>_display_(Seq[Any](format.raw/*72.49*/("""
            	        """),format.raw/*73.22*/("""<li class="previous">
            	            <a href=""""),_display_(/*74.36*/link(page)),format.raw/*74.46*/("""">&larr; Previous</a>
            	        </li> 
            	    """)))}/*76.19*/.getOrElse/*76.29*/ {_display_(Seq[Any](format.raw/*76.31*/("""
            	        """),format.raw/*77.22*/("""<li class="previous disabled">
            	            <a>&larr; Previous</a>
            	        </li>
            	    """)))}),format.raw/*80.19*/("""
            	    """),format.raw/*81.18*/("""<li class="current">
            	        <a>Displaying """),_display_(/*82.37*/(currentPage.offset + 1)),format.raw/*82.61*/(""" """),format.raw/*82.62*/("""to """),_display_(/*82.66*/(currentPage.offset + knols.size)),format.raw/*82.99*/(""" """),format.raw/*82.100*/("""of """),_display_(/*82.104*/currentPage/*82.115*/.total),format.raw/*82.121*/("""</a>
            	    </li>
            	    """),_display_(/*84.19*/currentPage/*84.30*/.next.map/*84.39*/ { page =>_display_(Seq[Any](format.raw/*84.49*/("""
            	        """),format.raw/*85.22*/("""<li class="next">
            	            <a href=""""),_display_(/*86.36*/link(page)),format.raw/*86.46*/("""">Next &rarr;</a>
            	        </li> 
            	    """)))}/*88.19*/.getOrElse/*88.29*/ {_display_(Seq[Any](format.raw/*88.31*/("""
            	        """),format.raw/*89.22*/("""<li class="next disabled">
            	            <a>Next &rarr;</a>
            	        </li>
               	 """)))}),format.raw/*92.19*/("""
            	"""),format.raw/*93.14*/("""</ul>
				""")))}/*94.6*/.getOrElse/*94.16*/ {_display_(Seq[Any](format.raw/*94.18*/("""
					"""),format.raw/*95.6*/("""<div class="panel panel-default">
					  <div class="panel-body">
					    <em>Nothing to display</em>
					  </div>
					</div>	
				""")))}),format.raw/*100.6*/("""	
		"""),format.raw/*101.3*/("""</div>
	</div>	
""")))}))}
  }

  def render(currentPage:Page[Knol],currentOrderBy:Int,currentFilter:String,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentOrderBy,currentFilter)(flash)

  def f:((Page[Knol],Int,String) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentOrderBy,currentFilter) => (flash) => apply(currentPage,currentOrderBy,currentFilter)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 13:48:10 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/list.scala.html
                  HASH: 340ed843c080ec38fb82021fe990a556caad5c61
                  MATRIX: 565->56|739->163|750->167|1030->159|1060->416|1089->419|1121->442|1161->444|1190->446|1303->533|1317->538|1345->557|1396->570|1428->575|1614->734|1642->741|1674->746|1715->757|1745->760|1920->909|1935->915|2016->987|2056->989|2089->995|2169->1048|2203->1061|2362->1190|2394->1195|2528->1302|2543->1308|2590->1334|2709->1427|2743->1452|2777->1477|2826->1488|2858->1493|3166->1775|3180->1780|3193->1784|3241->1794|3275->1801|3319->1818|3332->1822|3356->1825|3410->1852|3425->1858|3480->1892|3510->1895|3523->1899|3549->1904|3598->1926|3611->1930|3638->1936|3683->1954|3696->1958|3722->1963|3776->1990|3791->1996|3846->2030|3942->2096|3975->2102|4033->2163|4075->2177|4139->2214|4159->2225|4177->2234|4225->2244|4275->2266|4359->2323|4390->2333|4477->2401|4496->2411|4536->2413|4586->2435|4741->2559|4787->2577|4871->2634|4916->2658|4945->2659|4976->2663|5030->2696|5060->2697|5092->2701|5113->2712|5141->2718|5214->2764|5234->2775|5252->2784|5300->2794|5350->2816|5430->2869|5461->2879|5544->2943|5563->2953|5603->2955|5653->2977|5800->3093|5842->3107|5871->3118|5890->3128|5930->3130|5963->3136|6129->3271|6161->3275
                  LINES: 19->4|21->7|21->7|26->4|29->11|31->13|31->13|31->13|33->15|38->20|38->20|38->20|38->20|39->21|41->23|41->23|42->24|43->25|44->26|52->34|52->34|52->34|52->34|53->35|53->35|53->35|55->37|56->38|59->41|59->41|59->41|64->46|64->46|64->46|64->46|65->47|76->58|76->58|76->58|76->58|77->59|78->60|78->60|78->60|79->61|79->61|79->61|79->61|79->61|79->61|80->62|80->62|80->62|81->63|81->63|81->63|82->64|82->64|82->64|84->66|85->67|88->70|89->71|90->72|90->72|90->72|90->72|91->73|92->74|92->74|94->76|94->76|94->76|95->77|98->80|99->81|100->82|100->82|100->82|100->82|100->82|100->82|100->82|100->82|100->82|102->84|102->84|102->84|102->84|103->85|104->86|104->86|106->88|106->88|106->88|107->89|110->92|111->93|112->94|112->94|112->94|113->95|118->100|119->101
                  -- GENERATED --
              */
          