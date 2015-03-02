
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

/* footer1 Template File */
object footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* footer1 Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""<nav class="navbar navbar-inverse">
  <div class="row">
  	<div class="col-md-12" >
		  <div class="container-fluid">
    		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-2">
      			<ul class="nav navbar-nav navbar-right">
        			<li><a href="#">Knoldus Softwares LLP.</a></li>
      			</ul>
    		</div>
  		</div>  	
  	</div>
  </div>
</nav>
"""))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 00:20:15 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/footer.scala.html
                  HASH: 290d50f462f217258e760f9bacb50c662f693c5f
                  MATRIX: 549->29|649->41|677->43
                  LINES: 19->2|22->2|24->4
                  -- GENERATED --
              */
          