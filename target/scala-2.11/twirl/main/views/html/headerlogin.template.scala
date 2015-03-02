
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

/* loginnavbar Template File */
object headerlogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* loginnavbar Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""<!-- Header image -->
<div class="row">
   <div class="col-md-4">
		<img style="width:63%; height:35%;" src=""""),_display_(/*7.45*/routes/*7.51*/.Assets.at("/images/knoldus.png")),format.raw/*7.84*/(""""  alt="Image">
   </div>
   <div class="col-md-6" style="padding-top:2%;padding-bottom:2%;">
   	    <!-- Blank column to adjust knoldus icon -->
	</div>
	<div class="col-md-2" style="padding-top:2%;padding-bottom:2%;text-align:right;" >
	     <a class="btn btn-warning" href=""""),_display_(/*13.41*/routes/*13.47*/.Application.register()),format.raw/*13.70*/("""">Register</a>
	</div>
</div>

<!-- Navbar for login -->
<div class="row">
	<div class="col-md-12">
		<nav class="navbar navbar-default">
  			<div class="container-fluid">
    			<!-- Brand and toggle get grouped for better mobile display -->
    			<div class="navbar-header">
      				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        				<span class="sr-only">Toggle navigation</span>
        				<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
      				</button>
      				<a class="navbar-brand" href="/aboutus">Knolx</a>
    			</div>

    			<!-- Collect the nav links, forms, and other content for toggling -->
    			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      				<ul class="nav navbar-nav">
        				<li class="active"><a href="/aboutus">Home <span class="sr-only">(current)</span></a></li>
        				<li><a href="/aboutus">About Us</a></li>
        				<li class="dropdown">
          					<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
          					<ul class="dropdown-menu" role="menu">
            					<li><a href="#">Action</a></li>
           	 					<li><a href="#">Another action</a></li>
            					<li><a href="#">Something else here</a></li>
            					<li class="divider"></li>
            					<li><a href="#">Separated link</a></li>
            					<li class="divider"></li>
            					<li><a href="#">One more separated link</a></li>
          					</ul>
        				</li>
      				</ul>
      			<form class="navbar-form navbar-left" role="search">
        			<div class="form-group">
          				<input type="text" class="form-control" placeholder="Search">
        			</div>
        			<button type="submit" class="btn btn-default">Submit</button>
      			</form>
      			<ul class="nav navbar-nav navbar-right">
        			<li><a href="/login">Login</a></li>
        			<li class="dropdown">
          				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
          				<ul class="dropdown-menu" role="menu">
            				<li><a href="#">Action</a></li>
            				<li><a href="#">Another action</a></li>
            				<li><a href="#">Something else here</a></li>
            				<li class="divider"></li>
            				<li><a href="#">Separated link</a></li>
          				</ul>
        			</li>
      			</ul>
    		</div><!-- /.navbar-collapse -->
  		</div><!-- /.container-fluid -->
	</nav>	
	</div>
</div>"""))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 15:21:50 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/headerlogin.scala.html
                  HASH: 0aaed9faa43b968597496ba9083950a68c527b9b
                  MATRIX: 562->33|662->45|690->47|826->157|840->163|893->196|1199->475|1214->481|1258->504
                  LINES: 19->2|22->2|24->4|27->7|27->7|27->7|33->13|33->13|33->13
                  -- GENERATED --
              */
          