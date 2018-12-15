// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Amar/Desktop/javaplay/blogapp/conf/routes
// @DATE:Tue Dec 11 00:57:20 CET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:65
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
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

  
    // @LINE:6
    def login_get(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:53
    def tag_search(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:7
    def login_post(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:16
    def blog_detail(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:10
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:47
    def category_detail(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories")
    }
  
    // @LINE:56
    def likes(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "like/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:13
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:30
    def blogpost_detail(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:50
    def category_posts(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "categories/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:33
  class ReverseBlogPostController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def blogpost_delete(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:34
    def blogpost_save(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:38
    def save_blogpost_update(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:37
    def update_blogpost(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:33
    def blogpost_create(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:19
  class ReverseBlogController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def create_Blog(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "create/blog")
    }
  
    // @LINE:26
    def update_blog(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update/blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:23
    def delete_blog(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "delete/blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:20
    def save_Blog(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create/blog")
    }
  
    // @LINE:27
    def update_save(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update/blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:44
  class ReverseCommentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def comment_save(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "create/comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }


}
