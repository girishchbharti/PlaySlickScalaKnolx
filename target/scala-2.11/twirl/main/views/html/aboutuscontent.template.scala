
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

/* aboutuscontent Template File */
object aboutuscontent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* aboutuscontent Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""<div class="row">
		<!-- First block of about me content -->
		<div class="col-md-4">
			<div class="panel panel-primary">
				<div class="panel-heading">About Knolx</div>
  				<div class="panel-body">
  					Knoldus strongly believes in strongly sharing knowledge. 
  					We conduct knowledge sessions every week. Enthusiasts 
  					outside Knoldus who would like to contribute or attend 
  					are most welcome. Just drop a mail on knolx@knoldus.com 
  					and enjoy the Scala sessions with generous snacks and drinks
  					or register into this website and drop a request of knolx session.
  					You can either join us for a knolx session or you can also 
  					give knolx sessions.   					    				
				</div>
  			</div>
		</div>
		<!-- Second block of about me content -->
		<div class="col-md-4">
			<div class="panel panel-primary">
  				<div class="panel-heading">About Knoldus</div>
  				<div class="panel-body">
  					Knoldus is a team of Passionate Technologists, focused 
  					on staying at the edge of the curve. We love to build Scalable, 
  					Performant, Concurrent systems with Functional Programming to 
  					meet the needs of the business. Our big data solutions have won 
  					accolades in domains like Social media analytics, Finance, 
  					Healthcare, Gaming, Shipping and Media. Our proactive thinking, 
  					led by the mission of Authority enables us to deliver Business 
  					Innovation & Acceleration to help you succeed.     				
				</div>
  			</div>
		</div>
		<!-- Third block of about me content -->
		<div class="col-md-4">
			<div class="panel panel-primary">
  				<div class="panel-heading">About Our Work</div>
				<div class="panel-body">
   					<ul>
   						<li>Experts in Scala, Clojure and Haskell</li>
   						<li>Scrum & XP Evangelists and Practitioners</li>
   						<li>Build Software & Partnerships</li>
   						<li>Thought Leaders & Teachers</li>
   						<li>Technology Stack </li>
   					</ul>
				</div>
  			</div>
		</div>
</div>"""))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 13:48:10 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/aboutuscontent.scala.html
                  HASH: 6ad611a5c65682b7f6871985666f2cbc61f484c6
                  MATRIX: 571->36|671->48|699->50
                  LINES: 19->2|22->2|24->4
                  -- GENERATED --
              */
          