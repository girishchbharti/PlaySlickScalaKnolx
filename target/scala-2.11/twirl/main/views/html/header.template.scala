
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

/* header1 Template File */
object header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* header1 Template File */
  def apply/*2.2*/(user: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.16*/("""

"""),format.raw/*4.1*/("""<div class="row">
	<div class="col-md-12">
		<div>
			<img style="width:20%;height:50%;" src=""""),_display_(/*7.45*/routes/*7.51*/.Assets.at("/images/knoldus.png")),format.raw/*7.84*/(""""  alt="Image">
			<span class="label label-primary" >Welcome """),_display_(/*8.48*/user),format.raw/*8.52*/("""</span>
			
			<div style="float:right;color:white;background-color:green;"><b> Welcome """),_display_(/*10.78*/user),format.raw/*10.82*/(""" """),format.raw/*10.83*/("""</b></div>	
		</div>
	</div>
</div>

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
        				<li class="active"><a href="#">Home <span class="sr-only">(current)</span></a></li>
        				<li><a href="/showallknols">Knolders</a></li>
        				<li><a href="/myprofile">My Profile</a></li>
        				
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
        			<li><a href="/logout">Logout</a></li>
        			<li class="dropdown">
          				<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Admin panel Test<span class="caret"></span></a>
          				<ul class="dropdown-menu" role="menu">
            				<li><a href="/list">Knolders</a></li>
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

  def render(user:String): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 13:48:10 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/header.scala.html
                  HASH: 3e5d23caa266a8905a081ab16e2bc4f1165b647b
                  MATRIX: 552->29|654->43|682->45|803->140|817->146|870->179|959->242|983->246|1099->335|1124->339|1153->340
                  LINES: 19->2|22->2|24->4|27->7|27->7|27->7|28->8|28->8|30->10|30->10|30->10
                  -- GENERATED --
              */
          