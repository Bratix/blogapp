// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Amar/Desktop/javaplay/blogapp/conf/routes
// @DATE:Sun Dec 16 18:00:57 CET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:75
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def login_get(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:64
    def tag_search(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:11
    def login_post(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:61
    def category_blogs(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:7
    def register_post(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:20
    def blog_detail(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:67
    def user_blogs(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/blogs/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:14
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:58
    def category_detail(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:6
    def register_get(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:70
    def likes(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "like/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:17
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:34
    def blogpost_detail(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:37
  class ReverseBlogPostController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def blogpost_delete(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:37
    def blogpost_create_get(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:42
    def blogpost_update_post(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:41
    def blogpost_update_get(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:38
    def blogpost_create_post(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:23
  class ReverseBlogController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def blog_create_get(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create/blog")
    }
  
    // @LINE:31
    def blog_delete(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete/blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:27
    def blog_update_get(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update/blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:28
    def blog_update_post(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update/blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:24
    def blog_create_post(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create/blog")
    }
  
  }

  // @LINE:48
  class ReverseCommentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:51
    def comment_update_get(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update/comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:52
    def comment_update_post(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update/comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:55
    def comment_delete(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete/comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:48
    def comment_create_post(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create/comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }


}
