// @SOURCE:/home/knoldus/PlayProjects/MyPlaySlickScala/conf/routes
// @HASH:2664ac45dae6bf737c1f2d930885e1727f7a9f4b
// @DATE:Mon Mar 02 00:20:14 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:44
// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:44
class ReverseAssets {


// @LINE:44
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def validatelogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "validateLogin")
}
                        

// @LINE:30
def editknol(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "editknol" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:40
def showallsessions(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showallsessions")
}
                        

// @LINE:11
def updateprofile(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "updateprofile")
}
                        

// @LINE:12
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:34
def deleteknol(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "deleteknol" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:27
def addknol(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addknol")
}
                        

// @LINE:7
def register(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                        

// @LINE:37
def list(p:Int = 0, s:Int = 2, f:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "list" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == 2) None else Some(implicitly[QueryStringBindable[Int]].unbind("s", s)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                        

// @LINE:23
def showallknols(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showallknols")
}
                        

// @LINE:20
// @LINE:15
def aboutus(): Call = {
   () match {
// @LINE:15
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix)
                                         
   }
}
                                                

// @LINE:26
def addknolpage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "addknolpage")
}
                        

// @LINE:9
def registerNow(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "registerNow")
}
                        

// @LINE:17
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "index")
}
                        

// @LINE:10
def myprofile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "myprofile")
}
                        

// @LINE:6
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:31
def updateknol(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "updateknol" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:44
// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:44
class ReverseAssets {


// @LINE:44
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def validatelogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.validatelogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validateLogin"})
      }
   """
)
                        

// @LINE:30
def editknol : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editknol",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editknol" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:40
def showallsessions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showallsessions",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showallsessions"})
      }
   """
)
                        

// @LINE:11
def updateprofile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateprofile",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateprofile"})
      }
   """
)
                        

// @LINE:12
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:34
def deleteknol : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteknol",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteknol" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:27
def addknol : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addknol",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addknol"})
      }
   """
)
                        

// @LINE:7
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:37
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("s", s)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:23
def showallknols : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showallknols",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showallknols"})
      }
   """
)
                        

// @LINE:20
// @LINE:15
def aboutus : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.aboutus",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutus"})
      }
      }
   """
)
                        

// @LINE:26
def addknolpage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addknolpage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addknolpage"})
      }
   """
)
                        

// @LINE:9
def registerNow : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.registerNow",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerNow"})
      }
   """
)
                        

// @LINE:17
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
      }
   """
)
                        

// @LINE:10
def myprofile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.myprofile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myprofile"})
      }
   """
)
                        

// @LINE:6
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:31
def updateknol : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.updateknol",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateknol" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:44
// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:44
class ReverseAssets {


// @LINE:44
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:40
// @LINE:37
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:27
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def validatelogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.validatelogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "validatelogin", Seq(), "POST", """""", _prefix + """validateLogin""")
)
                      

// @LINE:30
def editknol(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editknol(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editknol", Seq(classOf[Int]), "GET", """Edit/Update Knol""", _prefix + """editknol$id<[^/]+>""")
)
                      

// @LINE:40
def showallsessions(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showallsessions(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showallsessions", Seq(), "GET", """Routes for Session class:""", _prefix + """showallsessions""")
)
                      

// @LINE:11
def updateprofile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateprofile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateprofile", Seq(), "POST", """""", _prefix + """updateprofile""")
)
                      

// @LINE:12
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:34
def deleteknol(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteknol(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteknol", Seq(classOf[Int]), "GET", """Delete Knol""", _prefix + """deleteknol$id<[^/]+>""")
)
                      

// @LINE:27
def addknol(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addknol(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addknol", Seq(), "POST", """""", _prefix + """addknol""")
)
                      

// @LINE:7
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:37
def list(p:Int, s:Int, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, f), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "list", Seq(classOf[Int], classOf[Int], classOf[String]), "GET", """Get list of knol using pagination""", _prefix + """list""")
)
                      

// @LINE:23
def showallknols(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showallknols(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showallknols", Seq(), "GET", """Show all knols""", _prefix + """showallknols""")
)
                      

// @LINE:15
def aboutus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.aboutus(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutus", Seq(), "GET", """ Home Page:""", _prefix + """""")
)
                      

// @LINE:26
def addknolpage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addknolpage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addknolpage", Seq(), "GET", """Add knol""", _prefix + """addknolpage""")
)
                      

// @LINE:9
def registerNow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerNow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registerNow", Seq(), "POST", """""", _prefix + """registerNow""")
)
                      

// @LINE:17
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """""", _prefix + """index""")
)
                      

// @LINE:10
def myprofile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.myprofile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "myprofile", Seq(), "GET", """""", _prefix + """myprofile""")
)
                      

// @LINE:6
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "login", Seq(), "GET", """Log In LogOut""", _prefix + """login""")
)
                      

// @LINE:31
def updateknol(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateknol(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateknol", Seq(classOf[Int]), "POST", """""", _prefix + """updateknol$id<[^/]+>""")
)
                      

}
                          
}
        
    