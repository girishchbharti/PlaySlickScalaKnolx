// @SOURCE:/home/knoldus/PlayProjects/MyPlaySlickScala/conf/routes
// @HASH:88816d925ebb2331f267b01d69704febe9d283f0
// @DATE:Mon Mar 02 14:25:13 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:45
// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:45
class ReverseAssets {


// @LINE:45
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:13
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
                        

// @LINE:31
def editknol(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "editknol" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:13
def remotelogin(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "remotelogin")
}
                        

// @LINE:41
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
                        

// @LINE:35
def deleteknol(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "deleteknol" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

// @LINE:28
def addknol(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "addknol")
}
                        

// @LINE:7
def register(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                        

// @LINE:38
def list(p:Int = 0, s:Int = 2, f:String = ""): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "list" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == 2) None else Some(implicitly[QueryStringBindable[Int]].unbind("s", s)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                        

// @LINE:24
def showallknols(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showallknols")
}
                        

// @LINE:21
// @LINE:16
def aboutus(): Call = {
   () match {
// @LINE:16
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix)
                                         
   }
}
                                                

// @LINE:27
def addknolpage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "addknolpage")
}
                        

// @LINE:9
def registerNow(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "registerNow")
}
                        

// @LINE:18
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
                        

// @LINE:32
def updateknol(id:Int): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "updateknol" + implicitly[PathBindable[Int]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:45
// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:45
class ReverseAssets {


// @LINE:45
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:13
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
                        

// @LINE:31
def editknol : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editknol",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editknol" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def remotelogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.remotelogin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remotelogin"})
      }
   """
)
                        

// @LINE:41
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
                        

// @LINE:35
def deleteknol : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteknol",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteknol" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:28
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
                        

// @LINE:38
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.list",
   """
      function(p,s,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("s", s)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:24
def showallknols : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showallknols",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showallknols"})
      }
   """
)
                        

// @LINE:21
// @LINE:16
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
                        

// @LINE:27
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
                        

// @LINE:18
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
                        

// @LINE:32
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
        


// @LINE:45
// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:45
class ReverseAssets {


// @LINE:45
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:41
// @LINE:38
// @LINE:35
// @LINE:32
// @LINE:31
// @LINE:28
// @LINE:27
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:13
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
                      

// @LINE:31
def editknol(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editknol(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "editknol", Seq(classOf[Int]), "GET", """Edit/Update Knol""", _prefix + """editknol$id<[^/]+>""")
)
                      

// @LINE:13
def remotelogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.remotelogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "remotelogin", Seq(), "GET", """""", _prefix + """remotelogin""")
)
                      

// @LINE:41
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
                      

// @LINE:35
def deleteknol(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteknol(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deleteknol", Seq(classOf[Int]), "GET", """Delete Knol""", _prefix + """deleteknol$id<[^/]+>""")
)
                      

// @LINE:28
def addknol(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addknol(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addknol", Seq(), "POST", """""", _prefix + """addknol""")
)
                      

// @LINE:7
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:38
def list(p:Int, s:Int, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.list(p, s, f), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "list", Seq(classOf[Int], classOf[Int], classOf[String]), "GET", """Get list of knol using pagination""", _prefix + """list""")
)
                      

// @LINE:24
def showallknols(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showallknols(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showallknols", Seq(), "GET", """Show all knols""", _prefix + """showallknols""")
)
                      

// @LINE:16
def aboutus(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.aboutus(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutus", Seq(), "GET", """ Home Page:""", _prefix + """""")
)
                      

// @LINE:27
def addknolpage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addknolpage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addknolpage", Seq(), "GET", """Add knol""", _prefix + """addknolpage""")
)
                      

// @LINE:9
def registerNow(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.registerNow(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "registerNow", Seq(), "POST", """""", _prefix + """registerNow""")
)
                      

// @LINE:18
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
                      

// @LINE:32
def updateknol(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.updateknol(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "updateknol", Seq(classOf[Int]), "POST", """""", _prefix + """updateknol$id<[^/]+>""")
)
                      

}
                          
}
        
    