
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

/* loginform Template File */
object loginform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* loginform Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""
"""),format.raw/*3.1*/("""<div style="padding-right:20%;">
	<legend>LogIn</legend>
	<form class="form-horizontal" id="loginform" action=""""),_display_(/*5.56*/routes/*5.62*/.Application.validatelogin()),format.raw/*5.90*/("""" method="post">
  		<div class="form-group">
    		<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
    		<div class="col-sm-10">
      			<input type="email" class="form-control" id="inputEmail3" name="username" placeholder="Email">
    		</div>
  		</div>
  		<div class="form-group">
    		<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
    		<div class="col-sm-10">
      			<input type="password" class="form-control" id="idpassword" name="password" placeholder="Password">
    		</div>
  		</div>
  		<div class="form-group">
    		<div class="col-sm-offset-2 col-sm-10">
      			<div class="checkbox">
        			<label>
        			  <input type="checkbox" name="rememberme"> Remember me
        			</label>
      			</div>
    		</div>
  		</div>
  		<div class="form-group">
    		<div class="col-sm-offset-2 col-sm-10">
      			<button type="submit" class="btn btn-primary">Sign in</button>
    		</div>
  		</div>
  		<a href="#">Forget Password?</a>
	</form>
</div>
<script>
	$("#loginform").validate("""),format.raw/*36.27*/("""{"""),format.raw/*36.28*/("""
		"""),format.raw/*37.3*/("""rules : """),format.raw/*37.11*/("""{"""),format.raw/*37.12*/("""
			"""),format.raw/*38.4*/("""username : """),format.raw/*38.15*/("""{"""),format.raw/*38.16*/("""
				"""),format.raw/*39.5*/("""required:true,
				email:true
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/(""",
			password : """),format.raw/*42.15*/("""{"""),format.raw/*42.16*/("""
				"""),format.raw/*43.5*/("""required : true
			"""),format.raw/*44.4*/("""}"""),format.raw/*44.5*/("""
		"""),format.raw/*45.3*/("""}"""),format.raw/*45.4*/("""
	"""),format.raw/*46.2*/("""}"""),format.raw/*46.3*/(""")
</script>
"""))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Mar 02 13:48:10 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/MyPlaySlickScala/app/views/loginform.scala.html
                  HASH: d3a357c2e653b6d4298386f4b396d668395607c4
                  MATRIX: 556->31|656->43|683->44|821->156|835->162|883->190|1977->1256|2006->1257|2036->1260|2072->1268|2101->1269|2132->1273|2171->1284|2200->1285|2232->1290|2292->1323|2320->1324|2364->1340|2393->1341|2425->1346|2471->1365|2499->1366|2529->1369|2557->1370|2586->1372|2614->1373
                  LINES: 19->2|22->2|23->3|25->5|25->5|25->5|56->36|56->36|57->37|57->37|57->37|58->38|58->38|58->38|59->39|61->41|61->41|62->42|62->42|63->43|64->44|64->44|65->45|65->45|66->46|66->46
                  -- GENERATED --
              */
          