
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
object register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Form[User],play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(title: String, regForm : Form[User])(implicit flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
implicit def /*7.2*/implicitFieldConstructor/*7.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*5.75*/("""

"""),format.raw/*7.75*/("""

"""),_display_(/*9.2*/loginMain("Register")/*9.23*/{_display_(Seq[Any](format.raw/*9.24*/("""
	"""),format.raw/*10.2*/("""<div class="row" style="padding-top:2%;">
	    <div class="col-md-8">
	       	<h5>Registration Form:</h5>
	       		"""),_display_(/*13.12*/flash/*13.17*/.get("success").map/*13.36*/ { message =>_display_(Seq[Any](format.raw/*13.49*/("""
					"""),format.raw/*14.6*/("""<div class="alert alert-dismissable alert-warning">
						<button type="button" class="close" data-dismiss="alert">×</button>
						<strong>Message</strong> """),_display_(/*16.33*/message),format.raw/*16.40*/("""
					"""),format.raw/*17.6*/("""</div>
				""")))}),format.raw/*18.6*/("""
	  			"""),format.raw/*19.7*/("""<div style="padding:2%;">
				"""),_display_(/*20.6*/helper/*20.12*/.form(action = routes.Application.registerNow(), 'id->"regForm")/*20.76*/ {_display_(Seq[Any](format.raw/*20.78*/("""    
     				"""),format.raw/*21.10*/("""<fieldset>
        			    """),_display_(/*22.17*/inputText(regForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*22.88*/("""
        			    """),_display_(/*23.17*/inputText(regForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*23.94*/("""
        			    """),_display_(/*24.17*/inputText(regForm("company"), '_label -> "Company", 'class -> "form-control")),format.raw/*24.94*/("""
        				"""),_display_(/*25.14*/inputText(regForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*25.87*/("""
        				"""),_display_(/*26.14*/inputPassword(regForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*26.97*/("""
        				"""),_display_(/*27.14*/inputText(regForm("phone"), '_label -> "Contact No", 'class -> "form-control")),format.raw/*27.92*/("""
        			"""),format.raw/*28.12*/("""</fieldset>
        			<div class="actions">
        				<br/>
            			<input type="submit" value="Register" class="btn btn-primary"> or 
            			<a href=""""),_display_(/*32.26*/routes/*32.32*/.Application.login()),format.raw/*32.52*/("""" class="btn btn-default">Cancel</a> 
        			</div>
    				""")))}),format.raw/*34.10*/("""
    			"""),format.raw/*35.8*/("""</div>
    	</div>
    	<div class="col-md-4">
    	</div>
	</div>
""")))}),format.raw/*40.2*/("""
"""),format.raw/*41.1*/("""<!-- Script to validate client side form validations -->
<script>
	$("#regForm").validate("""),format.raw/*43.25*/("""{"""),format.raw/*43.26*/("""
		"""),format.raw/*44.3*/("""rules : """),format.raw/*44.11*/("""{"""),format.raw/*44.12*/("""
			"""),format.raw/*45.4*/("""name : """),format.raw/*45.11*/("""{"""),format.raw/*45.12*/("""
				"""),format.raw/*46.5*/("""required : true
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/(""",
			company:"""),format.raw/*48.12*/("""{"""),format.raw/*48.13*/("""
				"""),format.raw/*49.5*/("""required:true
			"""),format.raw/*50.4*/("""}"""),format.raw/*50.5*/(""",
			password : """),format.raw/*51.15*/("""{"""),format.raw/*51.16*/("""
				"""),format.raw/*52.5*/("""required : true
			"""),format.raw/*53.4*/("""}"""),format.raw/*53.5*/(""",
			email:"""),format.raw/*54.10*/("""{"""),format.raw/*54.11*/("""
				"""),format.raw/*55.5*/("""required:true,
				email:true
			"""),format.raw/*57.4*/("""}"""),format.raw/*57.5*/("""
		"""),format.raw/*58.3*/("""}"""),format.raw/*58.4*/("""
	"""),format.raw/*59.2*/("""}"""),format.raw/*59.3*/(""");
</script>"""))}
  }

  def render(title:String,regForm:Form[User],flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(title,regForm)(flash)

  def f:((String,Form[User]) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (title,regForm) => (flash) => apply(title,regForm)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:20:15 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/register.scala.html
                  HASH: 8d630f0865a09fb1e3c8916dd9eb3c6668c1e3f8
                  MATRIX: 581->74|734->150|766->174|845->147|874->223|902->226|931->247|969->248|998->250|1143->368|1157->373|1185->392|1236->405|1269->411|1454->569|1482->576|1515->582|1557->594|1591->601|1648->632|1663->638|1736->702|1776->704|1818->718|1872->745|1964->816|2008->833|2106->910|2150->927|2248->1004|2289->1018|2383->1091|2424->1105|2528->1188|2569->1202|2668->1280|2708->1292|2905->1462|2920->1468|2961->1488|3057->1553|3092->1561|3190->1629|3218->1630|3336->1720|3365->1721|3395->1724|3431->1732|3460->1733|3491->1737|3526->1744|3555->1745|3587->1750|3633->1769|3661->1770|3702->1783|3731->1784|3763->1789|3807->1806|3835->1807|3879->1823|3908->1824|3940->1829|3986->1848|4014->1849|4053->1860|4082->1861|4114->1866|4174->1899|4202->1900|4232->1903|4260->1904|4289->1906|4317->1907
                  LINES: 20->5|22->7|22->7|23->5|25->7|27->9|27->9|27->9|28->10|31->13|31->13|31->13|31->13|32->14|34->16|34->16|35->17|36->18|37->19|38->20|38->20|38->20|38->20|39->21|40->22|40->22|41->23|41->23|42->24|42->24|43->25|43->25|44->26|44->26|45->27|45->27|46->28|50->32|50->32|50->32|52->34|53->35|58->40|59->41|61->43|61->43|62->44|62->44|62->44|63->45|63->45|63->45|64->46|65->47|65->47|66->48|66->48|67->49|68->50|68->50|69->51|69->51|70->52|71->53|71->53|72->54|72->54|73->55|75->57|75->57|76->58|76->58|77->59|77->59
                  -- GENERATED --
              */
          