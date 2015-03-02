
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
  				<li href="#" class="list-group-item"><span class="glyphicon glyphicon-earphone" aria-hidden="true"></span> Contact Us</li>
  				<li href="#" class="list-group-item">Dapibus ac facilisis in</li>
  				<li href="#" class="list-group-item">Morbi leo risus</li>
  				<li href="#" class="list-group-item">Porta ac consectetur ac</li>
  				<li href="#" class="list-group-item">Vestibulum at eros</li>
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
                  DATE: Mon Mar 02 00:20:16 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/leftlinkpanel.scala.html
                  HASH: 7810263f2454b6bedd2ef6fc45552a665f6c47b0
                  MATRIX: 568->35|668->47|695->48
                  LINES: 19->2|22->2|23->3
                  -- GENERATED --
              */
          