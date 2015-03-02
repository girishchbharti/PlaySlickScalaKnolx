
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
import com.knoldus.models.User
/**/
object test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""User Name:"""),_display_(/*5.12*/user/*5.16*/.name),format.raw/*5.21*/("""
"""),format.raw/*6.1*/("""User Address:"""),_display_(/*6.15*/user/*6.19*/.address),format.raw/*6.27*/("""
"""),format.raw/*7.1*/("""Email:"""),_display_(/*7.8*/user/*7.12*/.email),format.raw/*7.18*/("""
"""),format.raw/*8.1*/("""Password:"""),_display_(/*8.11*/user/*8.15*/.password),format.raw/*8.24*/("""
"""),format.raw/*9.1*/("""Phone:"""),_display_(/*9.8*/user/*9.12*/.phone),format.raw/*9.18*/("""
"""),format.raw/*10.1*/("""Register date:"""),_display_(/*10.16*/user/*10.20*/.created),format.raw/*10.28*/("""
"""),format.raw/*11.1*/("""Update Date:"""),_display_(/*11.14*/user/*11.18*/.updated),format.raw/*11.26*/("""

"""))}
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:20:15 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/test.scala.html
                  HASH: f3bec0668cf41290af40922b1b23598beb6a115a
                  MATRIX: 532->58|632->70|660->72|697->83|709->87|734->92|761->93|801->107|813->111|841->119|868->120|900->127|912->131|938->137|965->138|1001->148|1013->152|1042->161|1069->162|1101->169|1113->173|1139->179|1167->180|1209->195|1222->199|1251->207|1279->208|1319->221|1332->225|1361->233
                  LINES: 19->3|22->3|24->5|24->5|24->5|24->5|25->6|25->6|25->6|25->6|26->7|26->7|26->7|26->7|27->8|27->8|27->8|27->8|28->9|28->9|28->9|28->9|29->10|29->10|29->10|29->10|30->11|30->11|30->11|30->11
                  -- GENERATED --
              */
          