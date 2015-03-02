
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

"""),format.raw/*4.1*/("""<style>
	.header"""),format.raw/*5.9*/("""{"""),format.raw/*5.10*/("""
		"""),format.raw/*6.3*/("""background-color: #2196F3; 
		color:white; 
		border-radius:5px;
		padding:5%;
	"""),format.raw/*10.2*/("""}"""),format.raw/*10.3*/("""
	"""),format.raw/*11.2*/(""".follow:hover"""),format.raw/*11.15*/("""{"""),format.raw/*11.16*/("""
		"""),format.raw/*12.3*/("""width:20%;
		height:50%;		
	"""),format.raw/*14.2*/("""}"""),format.raw/*14.3*/("""
"""),format.raw/*15.1*/("""</style>

<div  class="row header">
	<div class="col-md-4">
    	<div id="bs-example-navbar-collapse-2">
    		<h4>About Us</h4>
    		<legend></legend>
    		<p>
    			<b>
	      		Knoldus strongly believes in strongly sharing 
	      		knowledge. We conduct knowledge sessions every 
	      		week. Enthusiasts outside Knoldus who would 
	      		like to contribute or attend are most welcome. 
	      		Just drop a mail on knolx@knoldus.com and enjoy 
	      		the Scala sessions with generous snacks and drinks.
	      		</b>	
	        </p>
    	</div>
  	</div>
  	<div class="col-md-4">
  		<h4>Most Popular</h4>
  		<legend></legend>
  		<h6>
  			<ul>
  				<li><a style="color:white;" href="#">Locate Us</a></li>
  				<br/>
  				<li><a style="color:white;" href="#">Blog</a></li>
  				<br/>
  				<li><a style="color:white;" href="#">Testimonials</a></li>
  				<br/>
  				<li><a style="color:white;" href="#">Out Team</a></li>
  			</ul>
  		</h6>
  	</div>    	
  	<div class="col-md-4">
  		<h4>Contact Us:</h4>
  		<legend></legend>
  		<span class="glyphicon glyphicon-earphone" aria-hidden="true">+91-987-654-3210</span><h5 style="color:white;"></h5>
  		<a href="#"><img class="follow" style="width:10%;height:40%;" src=""""),_display_(/*53.73*/routes/*53.79*/.Assets.at("/images/facebook.png")),format.raw/*53.113*/(""""  alt="Image"></a>
  		<a href="#"><img style="width:10%;height:40%;" src=""""),_display_(/*54.58*/routes/*54.64*/.Assets.at("/images/linkedin.png")),format.raw/*54.98*/(""""  alt="Image"></a>
		<a href="#"><img style="width:10%;height:40%;" src=""""),_display_(/*55.56*/routes/*55.62*/.Assets.at("/images/twitter.png")),format.raw/*55.95*/(""""  alt="Image"></a>
		<a href="#"><img style="width:10%;height:40%;" src=""""),_display_(/*56.56*/routes/*56.62*/.Assets.at("/images/googleplus.png")),format.raw/*56.98*/(""""  alt="Image"></a> 		
  	</div>    	
</div>

"""))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 16:08:16 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/footer.scala.html
                  HASH: c30bfecb4f367f843980758a5424a580d5447998
                  MATRIX: 549->29|649->41|677->43|719->59|747->60|776->63|883->143|911->144|940->146|981->159|1010->160|1040->163|1095->191|1123->192|1151->193|2421->1437|2436->1443|2492->1477|2596->1554|2611->1560|2666->1594|2768->1669|2783->1675|2837->1708|2939->1783|2954->1789|3011->1825
                  LINES: 19->2|22->2|24->4|25->5|25->5|26->6|30->10|30->10|31->11|31->11|31->11|32->12|34->14|34->14|35->15|73->53|73->53|73->53|74->54|74->54|74->54|75->55|75->55|75->55|76->56|76->56|76->56
                  -- GENERATED --
              */
          