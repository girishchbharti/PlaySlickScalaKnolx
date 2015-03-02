// @SOURCE:/home/knoldus/PlayProjects/MyPlaySlickScala/conf/routes
// @HASH:88816d925ebb2331f267b01d69704febe9d283f0
// @DATE:Mon Mar 02 14:25:13 IST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_login0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Application_login0_invoker = createInvoker(
controllers.Application.login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Nil,"GET", """Log In LogOut""", Routes.prefix + """login"""))
        

// @LINE:7
private[this] lazy val controllers_Application_register1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register"))))
private[this] lazy val controllers_Application_register1_invoker = createInvoker(
controllers.Application.register,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Nil,"GET", """""", Routes.prefix + """register"""))
        

// @LINE:8
private[this] lazy val controllers_Application_validatelogin2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validateLogin"))))
private[this] lazy val controllers_Application_validatelogin2_invoker = createInvoker(
controllers.Application.validatelogin,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "validatelogin", Nil,"POST", """""", Routes.prefix + """validateLogin"""))
        

// @LINE:9
private[this] lazy val controllers_Application_registerNow3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registerNow"))))
private[this] lazy val controllers_Application_registerNow3_invoker = createInvoker(
controllers.Application.registerNow,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registerNow", Nil,"POST", """""", Routes.prefix + """registerNow"""))
        

// @LINE:10
private[this] lazy val controllers_Application_myprofile4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("myprofile"))))
private[this] lazy val controllers_Application_myprofile4_invoker = createInvoker(
controllers.Application.myprofile,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "myprofile", Nil,"GET", """""", Routes.prefix + """myprofile"""))
        

// @LINE:11
private[this] lazy val controllers_Application_updateprofile5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateprofile"))))
private[this] lazy val controllers_Application_updateprofile5_invoker = createInvoker(
controllers.Application.updateprofile,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateprofile", Nil,"POST", """""", Routes.prefix + """updateprofile"""))
        

// @LINE:12
private[this] lazy val controllers_Application_logout6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Application_logout6_invoker = createInvoker(
controllers.Application.logout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:13
private[this] lazy val controllers_Application_remotelogin7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("remotelogin"))))
private[this] lazy val controllers_Application_remotelogin7_invoker = createInvoker(
controllers.Application.remotelogin,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "remotelogin", Nil,"GET", """""", Routes.prefix + """remotelogin"""))
        

// @LINE:16
private[this] lazy val controllers_Application_aboutus8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_aboutus8_invoker = createInvoker(
controllers.Application.aboutus,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutus", Nil,"GET", """ Home Page:""", Routes.prefix + """"""))
        

// @LINE:18
private[this] lazy val controllers_Application_index9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("index"))))
private[this] lazy val controllers_Application_index9_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """index"""))
        

// @LINE:21
private[this] lazy val controllers_Application_aboutus10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aboutus"))))
private[this] lazy val controllers_Application_aboutus10_invoker = createInvoker(
controllers.Application.aboutus,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutus", Nil,"GET", """About us""", Routes.prefix + """aboutus"""))
        

// @LINE:24
private[this] lazy val controllers_Application_showallknols11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showallknols"))))
private[this] lazy val controllers_Application_showallknols11_invoker = createInvoker(
controllers.Application.showallknols,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showallknols", Nil,"GET", """Show all knols""", Routes.prefix + """showallknols"""))
        

// @LINE:27
private[this] lazy val controllers_Application_addknolpage12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addknolpage"))))
private[this] lazy val controllers_Application_addknolpage12_invoker = createInvoker(
controllers.Application.addknolpage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addknolpage", Nil,"GET", """Add knol""", Routes.prefix + """addknolpage"""))
        

// @LINE:28
private[this] lazy val controllers_Application_addknol13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addknol"))))
private[this] lazy val controllers_Application_addknol13_invoker = createInvoker(
controllers.Application.addknol(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addknol", Nil,"POST", """""", Routes.prefix + """addknol"""))
        

// @LINE:31
private[this] lazy val controllers_Application_editknol14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("editknol"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_editknol14_invoker = createInvoker(
controllers.Application.editknol(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editknol", Seq(classOf[Int]),"GET", """Edit/Update Knol""", Routes.prefix + """editknol$id<[^/]+>"""))
        

// @LINE:32
private[this] lazy val controllers_Application_updateknol15_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateknol"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_updateknol15_invoker = createInvoker(
controllers.Application.updateknol(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateknol", Seq(classOf[Int]),"POST", """""", Routes.prefix + """updateknol$id<[^/]+>"""))
        

// @LINE:35
private[this] lazy val controllers_Application_deleteknol16_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deleteknol"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_deleteknol16_invoker = createInvoker(
controllers.Application.deleteknol(fakeValue[Int]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteknol", Seq(classOf[Int]),"GET", """Delete Knol""", Routes.prefix + """deleteknol$id<[^/]+>"""))
        

// @LINE:38
private[this] lazy val controllers_Application_list17_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("list"))))
private[this] lazy val controllers_Application_list17_invoker = createInvoker(
controllers.Application.list(fakeValue[Int], fakeValue[Int], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "list", Seq(classOf[Int], classOf[Int], classOf[String]),"GET", """Get list of knol using pagination""", Routes.prefix + """list"""))
        

// @LINE:41
private[this] lazy val controllers_Application_showallsessions18_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showallsessions"))))
private[this] lazy val controllers_Application_showallsessions18_invoker = createInvoker(
controllers.Application.showallsessions,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showallsessions", Nil,"GET", """Routes for Session class:""", Routes.prefix + """showallsessions"""))
        

// @LINE:45
private[this] lazy val controllers_Assets_at19_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at19_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register""","""controllers.Application.register"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validateLogin""","""controllers.Application.validatelogin"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registerNow""","""controllers.Application.registerNow"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """myprofile""","""controllers.Application.myprofile"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateprofile""","""controllers.Application.updateprofile"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """remotelogin""","""controllers.Application.remotelogin"""),("""GET""", prefix,"""controllers.Application.aboutus"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """index""","""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aboutus""","""controllers.Application.aboutus"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showallknols""","""controllers.Application.showallknols"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addknolpage""","""controllers.Application.addknolpage"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addknol""","""controllers.Application.addknol()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """editknol$id<[^/]+>""","""controllers.Application.editknol(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateknol$id<[^/]+>""","""controllers.Application.updateknol(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deleteknol$id<[^/]+>""","""controllers.Application.deleteknol(id:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """list""","""controllers.Application.list(p:Int ?= 0, s:Int ?= 2, f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showallsessions""","""controllers.Application.showallsessions"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_login0_route(params) => {
   call { 
        controllers_Application_login0_invoker.call(controllers.Application.login)
   }
}
        

// @LINE:7
case controllers_Application_register1_route(params) => {
   call { 
        controllers_Application_register1_invoker.call(controllers.Application.register)
   }
}
        

// @LINE:8
case controllers_Application_validatelogin2_route(params) => {
   call { 
        controllers_Application_validatelogin2_invoker.call(controllers.Application.validatelogin)
   }
}
        

// @LINE:9
case controllers_Application_registerNow3_route(params) => {
   call { 
        controllers_Application_registerNow3_invoker.call(controllers.Application.registerNow)
   }
}
        

// @LINE:10
case controllers_Application_myprofile4_route(params) => {
   call { 
        controllers_Application_myprofile4_invoker.call(controllers.Application.myprofile)
   }
}
        

// @LINE:11
case controllers_Application_updateprofile5_route(params) => {
   call { 
        controllers_Application_updateprofile5_invoker.call(controllers.Application.updateprofile)
   }
}
        

// @LINE:12
case controllers_Application_logout6_route(params) => {
   call { 
        controllers_Application_logout6_invoker.call(controllers.Application.logout)
   }
}
        

// @LINE:13
case controllers_Application_remotelogin7_route(params) => {
   call { 
        controllers_Application_remotelogin7_invoker.call(controllers.Application.remotelogin)
   }
}
        

// @LINE:16
case controllers_Application_aboutus8_route(params) => {
   call { 
        controllers_Application_aboutus8_invoker.call(controllers.Application.aboutus)
   }
}
        

// @LINE:18
case controllers_Application_index9_route(params) => {
   call { 
        controllers_Application_index9_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:21
case controllers_Application_aboutus10_route(params) => {
   call { 
        controllers_Application_aboutus10_invoker.call(controllers.Application.aboutus)
   }
}
        

// @LINE:24
case controllers_Application_showallknols11_route(params) => {
   call { 
        controllers_Application_showallknols11_invoker.call(controllers.Application.showallknols)
   }
}
        

// @LINE:27
case controllers_Application_addknolpage12_route(params) => {
   call { 
        controllers_Application_addknolpage12_invoker.call(controllers.Application.addknolpage)
   }
}
        

// @LINE:28
case controllers_Application_addknol13_route(params) => {
   call { 
        controllers_Application_addknol13_invoker.call(controllers.Application.addknol())
   }
}
        

// @LINE:31
case controllers_Application_editknol14_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_editknol14_invoker.call(controllers.Application.editknol(id))
   }
}
        

// @LINE:32
case controllers_Application_updateknol15_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_updateknol15_invoker.call(controllers.Application.updateknol(id))
   }
}
        

// @LINE:35
case controllers_Application_deleteknol16_route(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Application_deleteknol16_invoker.call(controllers.Application.deleteknol(id))
   }
}
        

// @LINE:38
case controllers_Application_list17_route(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[Int]("s", Some(2)), params.fromQuery[String]("f", Some(""))) { (p, s, f) =>
        controllers_Application_list17_invoker.call(controllers.Application.list(p, s, f))
   }
}
        

// @LINE:41
case controllers_Application_showallsessions18_route(params) => {
   call { 
        controllers_Application_showallsessions18_invoker.call(controllers.Application.showallsessions)
   }
}
        

// @LINE:45
case controllers_Assets_at19_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at19_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     