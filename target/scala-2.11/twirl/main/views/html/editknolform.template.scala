
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
import helper._
/**/
object editknolform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Form[Knol],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(title: String, formKnol:Form[Knol],id:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*5.45*/("""


"""),_display_(/*8.2*/main("Edit Knol Info:",title)/*8.31*/{_display_(Seq[Any](format.raw/*8.32*/("""
	"""),format.raw/*9.2*/("""<div class="row">
		<div claass="col-md-4">
			<div style="padding:3%">
				<h4 style="float: left">"""),_display_(/*12.30*/title),format.raw/*12.35*/("""</h4>
			</div>
		</div>
		<div class="col-md-4">
				<a href=""""),_display_(/*16.15*/routes/*16.21*/.Application.deleteknol(id)),format.raw/*16.48*/("""" class="btn btn-danger btn-sm" style="float: right;">Delete this Knol</a>
			
		</div>
		<div class="col-md-4"></div>
	</div>
	<div class="row">
		<div class="col-md-6">
			<div style="padding:5%;">	
				"""),_display_(/*24.6*/form(routes.Application.updateknol(id))/*24.45*/{_display_(Seq[Any](format.raw/*24.46*/("""
					"""),format.raw/*25.6*/("""<fieldset>
						"""),_display_(/*26.8*/inputText(formKnol("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*26.80*/("""
						"""),_display_(/*27.8*/inputText(formKnol("email"),'_label -> "Email", 'class -> "form-control")),format.raw/*27.81*/("""
						"""),_display_(/*28.8*/inputText(formKnol("m_no"), '_label -> "Phone", 'class -> "form-control")),format.raw/*28.81*/("""				
					"""),format.raw/*29.6*/("""</fieldset>
					<div class="actions">
						<input type="submit" value="Update"	class="btn btn-primary btn-sm"> or 
						<a href=""""),_display_(/*32.17*/routes/*32.23*/.Application.list()),format.raw/*32.42*/("""" class="btn btn-default btn-sm">Cancel</a>
					</div>
				""")))}),format.raw/*34.6*/("""
			"""),format.raw/*35.4*/("""</div>
		</div>
	</div>
""")))}),format.raw/*38.2*/("""
"""))}
  }

  def render(title:String,formKnol:Form[Knol],id:Int): play.twirl.api.HtmlFormat.Appendable = apply(title,formKnol,id)

  def f:((String,Form[Knol],Int) => play.twirl.api.HtmlFormat.Appendable) = (title,formKnol,id) => apply(title,formKnol,id)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:43:40 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/editknolform.scala.html
                  HASH: ebd3f065e3f67b5fce83553a355cae6057798ccd
                  MATRIX: 570->81|701->124|730->128|767->157|805->158|833->160|961->261|987->266|1078->330|1093->336|1141->363|1373->569|1421->608|1460->609|1493->615|1537->633|1630->705|1664->713|1758->786|1792->794|1886->867|1923->877|2083->1010|2098->1016|2138->1035|2229->1096|2260->1100|2315->1125
                  LINES: 20->5|23->5|26->8|26->8|26->8|27->9|30->12|30->12|34->16|34->16|34->16|42->24|42->24|42->24|43->25|44->26|44->26|45->27|45->27|46->28|46->28|47->29|50->32|50->32|50->32|52->34|53->35|56->38
                  -- GENERATED --
              */
          