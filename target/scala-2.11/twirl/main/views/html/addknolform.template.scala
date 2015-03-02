
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
import helper._
import com.knoldus.models._
/**/
object addknolform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Knol],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(title: String, addKnolForm : Form[Knol]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*4.43*/("""

"""),format.raw/*6.75*/("""

"""),_display_(/*8.2*/main("Add New Knolder","user")/*8.32*/{_display_(Seq[Any](format.raw/*8.33*/("""
	"""),format.raw/*9.2*/("""<div class="row">
		<div class="col-md-6">
			<div style="padding:2%;">
				<h4>"""),_display_(/*12.10*/title),format.raw/*12.15*/("""</h4>
				"""),_display_(/*13.6*/form(routes.Application.addknol())/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""    
     			   """),format.raw/*14.12*/("""<fieldset>
        		    	"""),_display_(/*15.17*/inputText(addKnolForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*15.92*/("""
        		    	"""),_display_(/*16.17*/inputText(addKnolForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.94*/("""
        		    	"""),_display_(/*17.17*/inputText(addKnolForm("m_no"), '_label -> "Mobile", 'class -> "form-control")),format.raw/*17.94*/("""
        			"""),format.raw/*18.12*/("""</fieldset>
        			<div class="actions">
        				<br/>
            			<input type="submit" value="Add New Knol" class="btn btn-primary btn-sm"> or 
            			<a href=""""),_display_(/*22.26*/routes/*22.32*/.Application.list()),format.raw/*22.51*/("""" class="btn btn-default btn-sm">Cancel</a> 
        			</div>
    			""")))}),format.raw/*24.9*/("""
    		"""),format.raw/*25.7*/("""</div>
		</div>
		<div class="col-md-6">
		</div>
	</div>
	
	
""")))}))}
  }

  def render(title:String,addKnolForm:Form[Knol]): play.twirl.api.HtmlFormat.Appendable = apply(title,addKnolForm)

  def f:((String,Form[Knol]) => play.twirl.api.HtmlFormat.Appendable) = (title,addKnolForm) => apply(title,addKnolForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:41:01 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/addknolform.scala.html
                  HASH: f3df732a10c1e092b70e1e38fa118f30cd1c92a1
                  MATRIX: 565->48|686->92|718->116|797->89|826->165|854->168|892->198|930->199|958->201|1066->282|1092->287|1129->298|1172->332|1212->334|1256->350|1310->377|1406->452|1450->469|1548->546|1592->563|1690->640|1730->652|1938->833|1953->839|1993->858|2094->929|2128->936
                  LINES: 20->4|22->6|22->6|23->4|25->6|27->8|27->8|27->8|28->9|31->12|31->12|32->13|32->13|32->13|33->14|34->15|34->15|35->16|35->16|36->17|36->17|37->18|41->22|41->22|41->22|43->24|44->25
                  -- GENERATED --
              */
          