
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

/* csslink Template File */
object headlinks extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* csslink Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""<!-- links to css, javascript, jquery, bootstrap, jquery validation -->

	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*6.63*/routes/*6.69*/.Assets.at("bootstrap-3.3.2-dist/css/bootstrap.min.css")),format.raw/*6.125*/("""" )>        
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.at("stylesheets/main.css")),format.raw/*7.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("images/favicon.png")),format.raw/*8.93*/("""">
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.at("bootstrap-3.3.2-dist/js/jquery_2.1.1.min.js")),format.raw/*9.82*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.at("bootstrap-3.3.2-dist/js/bootstrap.min.js")),format.raw/*10.79*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.at("jquery-validation-1.13.1/dist/jquery.validate.js")),format.raw/*11.87*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*12.19*/routes/*12.25*/.Assets.at("jquery-validation-1.13.1/dist/additional-methods.js")),format.raw/*12.90*/("""" type="text/javascript"></script>
  """))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 13:48:10 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/headlinks.scala.html
                  HASH: 61f4fa9de48a397db5a5ae1c4be8782ee35b3163
                  MATRIX: 552->29|652->41|680->43|841->178|855->184|932->240|1020->302|1034->308|1088->342|1171->399|1185->405|1237->437|1284->458|1298->464|1375->521|1455->574|1470->580|1545->634|1625->687|1640->693|1723->755|1803->808|1818->814|1904->879
                  LINES: 19->2|22->2|24->4|26->6|26->6|26->6|27->7|27->7|27->7|28->8|28->8|28->8|29->9|29->9|29->9|30->10|30->10|30->10|31->11|31->11|31->11|32->12|32->12|32->12
                  -- GENERATED --
              */
          