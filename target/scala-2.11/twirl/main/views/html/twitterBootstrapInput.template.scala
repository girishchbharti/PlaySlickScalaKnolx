
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
object twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
"""),format.raw/*6.1*/("""<div class="clearfix """),_display_(/*6.23*/if(elements.hasErrors)/*6.45*/ {_display_(Seq[Any](format.raw/*6.47*/("""error""")))}),format.raw/*6.53*/("""">
    <label for=""""),_display_(/*7.18*/elements/*7.26*/.id),format.raw/*7.29*/("""">"""),_display_(/*7.32*/elements/*7.40*/.label),format.raw/*7.46*/("""</label>
    <div class="input">
        """),_display_(/*9.10*/elements/*9.18*/.input),format.raw/*9.24*/("""
        """),format.raw/*10.9*/("""<span class="help-inline">"""),_display_(/*10.36*/elements/*10.44*/.infos.mkString(", ")),format.raw/*10.65*/("""</span> 
    </div>
</div>
"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 13:48:10 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/twitterBootstrapInput.scala.html
                  HASH: 9be6c540fa815520cbedc652d3a49add1633c1d3
                  MATRIX: 535->1|655->33|684->190|711->191|759->213|789->235|828->237|864->243|910->263|926->271|949->274|978->277|994->285|1020->291|1088->333|1104->341|1130->347|1166->356|1220->383|1237->391|1279->412
                  LINES: 19->1|22->1|24->5|25->6|25->6|25->6|25->6|25->6|26->7|26->7|26->7|26->7|26->7|26->7|28->9|28->9|28->9|29->10|29->10|29->10|29->10
                  -- GENERATED --
              */
          