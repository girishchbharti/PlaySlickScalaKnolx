
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

/* aboutus Template File */
object aboutus extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* aboutus Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""

"""),_display_(/*4.2*/loginMain("About Us")/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
	"""),_display_(/*5.3*/aboutuscontent("About us")),format.raw/*5.29*/("""
""")))}))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:20:15 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/aboutus.scala.html
                  HASH: d52ea38e68acfe76834e4434b6dcd5b215506bbe
                  MATRIX: 550->29|650->41|678->44|707->65|745->66|773->69|819->95
                  LINES: 19->2|22->2|24->4|24->4|24->4|25->5|25->5
                  -- GENERATED --
              */
          