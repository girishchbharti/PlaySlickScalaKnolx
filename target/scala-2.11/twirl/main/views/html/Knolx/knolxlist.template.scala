
package views.html.Knolx

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/* knolxlist Template File */
object knolxlist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* knolxlist Template File */
  def apply/*2.2*/(knolx: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.17*/("""
"""))}
  }

  def render(knolx:String): play.twirl.api.HtmlFormat.Appendable = apply(knolx)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (knolx) => apply(knolx)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:20:16 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/Knolx/knolxlist.scala.html
                  HASH: 90fbd8204200d89bc6cc4880920b8cb898410bd5
                  MATRIX: 565->31|668->46
                  LINES: 19->2|22->2
                  -- GENERATED --
              */
          