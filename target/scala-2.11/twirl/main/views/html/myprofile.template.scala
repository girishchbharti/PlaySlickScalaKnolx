
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
object myprofile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(title:String, user: String, userForm :Form[User]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*5.52*/("""

"""),_display_(/*7.2*/main("My Profile",user)/*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
	"""),format.raw/*8.2*/("""<div class="row" style="padding-top:2%;">
	    <div class="col-md-8">
	       	<h4>My Profile:</h4>
	  			<div style="padding:2%;">
				"""),_display_(/*12.6*/form(routes.Application.updateprofile(),'id->"editform")/*12.62*/ {_display_(Seq[Any](format.raw/*12.64*/("""    
     				"""),format.raw/*13.10*/("""<fieldset>
        			    """),_display_(/*14.17*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.89*/("""
        			    """),_display_(/*15.17*/inputText(userForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*15.95*/("""
        			    """),_display_(/*16.17*/inputText(userForm("company"), '_label -> "Company", 'class -> "form-control")),format.raw/*16.95*/("""
        				"""),_display_(/*17.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.88*/("""
        				"""),_display_(/*18.14*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*18.98*/("""
        				"""),_display_(/*19.14*/inputText(userForm("phone"), '_label -> "Contact No", 'class -> "form-control")),format.raw/*19.93*/("""
        			"""),format.raw/*20.12*/("""</fieldset>
        			<div class="actions">
        				<br/>
            			<input type="submit" value="Update" class="btn btn-primary"> or 
            			<a href=""""),_display_(/*24.26*/routes/*24.32*/.Application.index()),format.raw/*24.52*/("""" class="btn btn-default">Cancel</a> 
        			</div>
    				""")))}),format.raw/*26.10*/("""
    			"""),format.raw/*27.8*/("""</div>
    	</div>
	    <div class="col-md-4">
	    	<img style="height:100%;width:100%;" src=""""),_display_(/*30.50*/routes/*30.56*/.Assets.at("/images/user.png")),format.raw/*30.86*/("""" alt="Image not found"/>
	    	<a class="btn btn-default" href="#">Edit picture</a>
	    </div>
	</div>
""")))}),format.raw/*34.2*/("""
"""),format.raw/*35.1*/("""<!-- Script to validate client side form validations -->
<script>
	$("#editform").validate("""),format.raw/*37.26*/("""{"""),format.raw/*37.27*/("""
		"""),format.raw/*38.3*/("""rules : """),format.raw/*38.11*/("""{"""),format.raw/*38.12*/("""
			"""),format.raw/*39.4*/("""name : """),format.raw/*39.11*/("""{"""),format.raw/*39.12*/("""
				"""),format.raw/*40.5*/("""required : true
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/(""",
			company:"""),format.raw/*42.12*/("""{"""),format.raw/*42.13*/("""
				"""),format.raw/*43.5*/("""required:true
			"""),format.raw/*44.4*/("""}"""),format.raw/*44.5*/(""",
			password : """),format.raw/*45.15*/("""{"""),format.raw/*45.16*/("""
				"""),format.raw/*46.5*/("""required : true
			"""),format.raw/*47.4*/("""}"""),format.raw/*47.5*/(""",
			email:"""),format.raw/*48.10*/("""{"""),format.raw/*48.11*/("""
				"""),format.raw/*49.5*/("""required:true,
				email:true
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""
		"""),format.raw/*52.3*/("""}"""),format.raw/*52.4*/("""
	"""),format.raw/*53.2*/("""}"""),format.raw/*53.3*/(""");
</script>

"""))}
  }

  def render(title:String,user:String,userForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(title,user,userForm)

  def f:((String,String,Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (title,user,userForm) => apply(title,user,userForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 13:48:10 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/myprofile.scala.html
                  HASH: e2891caa7b9eecf62785a267eea5f9e834a37d2e
                  MATRIX: 570->78|708->128|736->131|767->154|805->155|833->157|996->294|1061->350|1101->352|1143->366|1197->393|1290->465|1334->482|1433->560|1477->577|1576->655|1617->669|1712->743|1753->757|1858->841|1899->855|1999->934|2039->946|2234->1114|2249->1120|2290->1140|2386->1205|2421->1213|2544->1309|2559->1315|2610->1345|2746->1451|2774->1452|2893->1543|2922->1544|2952->1547|2988->1555|3017->1556|3048->1560|3083->1567|3112->1568|3144->1573|3190->1592|3218->1593|3259->1606|3288->1607|3320->1612|3364->1629|3392->1630|3436->1646|3465->1647|3497->1652|3543->1671|3571->1672|3610->1683|3639->1684|3671->1689|3731->1722|3759->1723|3789->1726|3817->1727|3846->1729|3874->1730
                  LINES: 20->5|23->5|25->7|25->7|25->7|26->8|30->12|30->12|30->12|31->13|32->14|32->14|33->15|33->15|34->16|34->16|35->17|35->17|36->18|36->18|37->19|37->19|38->20|42->24|42->24|42->24|44->26|45->27|48->30|48->30|48->30|52->34|53->35|55->37|55->37|56->38|56->38|56->38|57->39|57->39|57->39|58->40|59->41|59->41|60->42|60->42|61->43|62->44|62->44|63->45|63->45|64->46|65->47|65->47|66->48|66->48|67->49|69->51|69->51|70->52|70->52|71->53|71->53
                  -- GENERATED --
              */
          