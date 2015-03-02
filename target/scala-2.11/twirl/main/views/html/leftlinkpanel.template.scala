
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

/* leftlinkpanel Template File */
object leftlinkpanel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* leftlinkpanel Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""
"""),format.raw/*3.1*/("""<div>
	<div class="panel panel-default">
	  <div class="panel-body">
	  	<div class="panel panel-default" style="font-size:15px;">
	    	<ul>
	    		<li><span class="glyphicon glyphicon-home" aria-hidden="true"></span><a href="#"> Home</a></li>
	    		<li><span class="glyphicon glyphicon-user" aria-hidden="true"></span><a href="#"> About Us</a></li>
	    		<li><span class="glyphicon glyphicon-th" aria-hidden="true"></span><a href="#"> Projects</a></li>
	    		<li><span class="glyphicon glyphicon-cog" aria-hidden="true"></span><a href="#"> Technologies</a></li>
	    		<hr/>
	    		<li><span class="glyphicon glyphicon-star" aria-hidden="true"></span><a href="#"> Knolx <span class="badge">New</span></a></li>
	    		<li><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span><a href="#"> Contact Us</a></li>
	    	</ul>
	    	<ul class="list-group">
  				<li href="#" class="list-group-item"><span class="glyphicon glyphicon-star" aria-hidden="true"></span><a href="#">Contact Us</a></li>
  				<li href="#" class="list-group-item"><span class="glyphicon glyphicon-star" aria-hidden="true"></span><a href="#">Our Services</a></li>
  				<li href="#" class="list-group-item"><span class="glyphicon glyphicon-star" aria-hidden="true"></span><a href="#">Our Team</a></li>
  				<li href="#" class="list-group-item"><span class="glyphicon glyphicon-star" aria-hidden="true"></span><a href="#">Our Process</a></li>
  				<li href="#" class="list-group-item"><span class="glyphicon glyphicon-star" aria-hidden="true"></span><a href="#">Our Standards</a></li>
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
                  DATE: Mon Mar 02 16:31:22 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/leftlinkpanel.scala.html
                  HASH: 9125b28966d3e2294a4a8b7be5a17cb1393dc8a4
                  MATRIX: 568->35|668->47|695->48
                  LINES: 19->2|22->2|23->3
                  -- GENERATED --
              */
          