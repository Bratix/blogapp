// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Amar/Desktop/javaplay/blogapp/conf/routes
// @DATE:Sat Dec 15 22:31:42 CET 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:23
  BlogController_3: controllers.BlogController,
  // @LINE:37
  BlogPostController_1: controllers.BlogPostController,
  // @LINE:48
  CommentController_2: controllers.CommentController,
  // @LINE:76
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:23
    BlogController_3: controllers.BlogController,
    // @LINE:37
    BlogPostController_1: controllers.BlogPostController,
    // @LINE:48
    CommentController_2: controllers.CommentController,
    // @LINE:76
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_0, BlogController_3, BlogPostController_1, CommentController_2, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, BlogController_3, BlogPostController_1, CommentController_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register_get"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register_post"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login_get"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login_post"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blog/""" + "$" + """id<[^/]+>""", """controllers.HomeController.blog_detail(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create/blog""", """controllers.BlogController.create_Blog"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create/blog""", """controllers.BlogController.save_Blog"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/blog/""" + "$" + """id<[^/]+>""", """controllers.BlogController.update_blog(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/blog/""" + "$" + """id<[^/]+>""", """controllers.BlogController.update_save(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/blog/""" + "$" + """id<[^/]+>""", """controllers.BlogController.delete_blog(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post/""" + "$" + """id<[^/]+>""", """controllers.HomeController.blogpost_detail(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create/post/""" + "$" + """id<[^/]+>""", """controllers.BlogPostController.blogpost_create(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create/post/""" + "$" + """id<[^/]+>""", """controllers.BlogPostController.blogpost_save(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/post/""" + "$" + """id<[^/]+>""", """controllers.BlogPostController.update_blogpost(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/post/""" + "$" + """id<[^/]+>""", """controllers.BlogPostController.save_blogpost_update(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/post/""" + "$" + """id<[^/]+>""", """controllers.BlogPostController.blogpost_delete(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """create/comment/""" + "$" + """id<[^/]+>""", """controllers.CommentController.comment_save(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/comment/""" + "$" + """id<[^/]+>""", """controllers.CommentController.comment_update_get(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/comment/""" + "$" + """id<[^/]+>""", """controllers.CommentController.comment_update_post(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/comment/""" + "$" + """id<[^/]+>""", """controllers.CommentController.comment_delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.HomeController.category_detail"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories/""" + "$" + """id<[^/]+>""", """controllers.HomeController.category_posts(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.HomeController.tag_search"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """like/post/""" + "$" + """id<[^/]+>""", """controllers.HomeController.likes(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_register_get0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_register_get0_invoker = createInvoker(
    HomeController_0.register_get,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register_get",
      Nil,
      "GET",
      this.prefix + """register""",
      """Register""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_register_post1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_register_post1_invoker = createInvoker(
    HomeController_0.register_post,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register_post",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_login_get2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login_get2_invoker = createInvoker(
    HomeController_0.login_get,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login_get",
      Nil,
      "GET",
      this.prefix + """login""",
      """Login page""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_login_post3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login_post3_invoker = createInvoker(
    HomeController_0.login_post,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login_post",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout4_invoker = createInvoker(
    HomeController_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """Logout""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index5_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """Index page""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_blog_detail6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blog/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_blog_detail6_invoker = createInvoker(
    HomeController_0.blog_detail(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "blog_detail",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """blog/""" + "$" + """id<[^/]+>""",
      """Blog detail page""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_BlogController_create_Blog7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create/blog")))
  )
  private[this] lazy val controllers_BlogController_create_Blog7_invoker = createInvoker(
    BlogController_3.create_Blog,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogController",
      "create_Blog",
      Nil,
      "GET",
      this.prefix + """create/blog""",
      """Blog create view""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_BlogController_save_Blog8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create/blog")))
  )
  private[this] lazy val controllers_BlogController_save_Blog8_invoker = createInvoker(
    BlogController_3.save_Blog,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogController",
      "save_Blog",
      Nil,
      "POST",
      this.prefix + """create/blog""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_BlogController_update_blog9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/blog/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BlogController_update_blog9_invoker = createInvoker(
    BlogController_3.update_blog(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogController",
      "update_blog",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """update/blog/""" + "$" + """id<[^/]+>""",
      """Blog update view""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_BlogController_update_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/blog/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BlogController_update_save10_invoker = createInvoker(
    BlogController_3.update_save(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogController",
      "update_save",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """update/blog/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_BlogController_delete_blog11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/blog/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BlogController_delete_blog11_invoker = createInvoker(
    BlogController_3.delete_blog(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogController",
      "delete_blog",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """delete/blog/""" + "$" + """id<[^/]+>""",
      """Blog delete view""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_blogpost_detail12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_blogpost_detail12_invoker = createInvoker(
    HomeController_0.blogpost_detail(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "blogpost_detail",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """post/""" + "$" + """id<[^/]+>""",
      """BlogPost detail view""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_BlogPostController_blogpost_create13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create/post/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BlogPostController_blogpost_create13_invoker = createInvoker(
    BlogPostController_1.blogpost_create(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogPostController",
      "blogpost_create",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """create/post/""" + "$" + """id<[^/]+>""",
      """BlogPost create view""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_BlogPostController_blogpost_save14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create/post/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BlogPostController_blogpost_save14_invoker = createInvoker(
    BlogPostController_1.blogpost_save(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogPostController",
      "blogpost_save",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """create/post/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_BlogPostController_update_blogpost15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/post/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BlogPostController_update_blogpost15_invoker = createInvoker(
    BlogPostController_1.update_blogpost(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogPostController",
      "update_blogpost",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """update/post/""" + "$" + """id<[^/]+>""",
      """BlogPost update view""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_BlogPostController_save_blogpost_update16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/post/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BlogPostController_save_blogpost_update16_invoker = createInvoker(
    BlogPostController_1.save_blogpost_update(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogPostController",
      "save_blogpost_update",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """update/post/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_BlogPostController_blogpost_delete17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/post/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BlogPostController_blogpost_delete17_invoker = createInvoker(
    BlogPostController_1.blogpost_delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BlogPostController",
      "blogpost_delete",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """delete/post/""" + "$" + """id<[^/]+>""",
      """BlogPost delete view""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_CommentController_comment_save18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("create/comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_comment_save18_invoker = createInvoker(
    CommentController_2.comment_save(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "comment_save",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """create/comment/""" + "$" + """id<[^/]+>""",
      """Comment create view""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_CommentController_comment_update_get19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_comment_update_get19_invoker = createInvoker(
    CommentController_2.comment_update_get(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "comment_update_get",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """update/comment/""" + "$" + """id<[^/]+>""",
      """Comment update view""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_CommentController_comment_update_post20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_comment_update_post20_invoker = createInvoker(
    CommentController_2.comment_update_post(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "comment_update_post",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """update/comment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_CommentController_comment_delete21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/comment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_comment_delete21_invoker = createInvoker(
    CommentController_2.comment_delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "comment_delete",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """delete/comment/""" + "$" + """id<[^/]+>""",
      """Comment delete view""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_HomeController_category_detail22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_HomeController_category_detail22_invoker = createInvoker(
    HomeController_0.category_detail,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "category_detail",
      Nil,
      "GET",
      this.prefix + """categories""",
      """Categories page""",
      Seq()
    )
  )

  // @LINE:61
  private[this] lazy val controllers_HomeController_category_posts23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_category_posts23_invoker = createInvoker(
    HomeController_0.category_posts(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "category_posts",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """categories/""" + "$" + """id<[^/]+>""",
      """Search by categories""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_HomeController_tag_search24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_HomeController_tag_search24_invoker = createInvoker(
    HomeController_0.tag_search,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tag_search",
      Nil,
      "GET",
      this.prefix + """search""",
      """Tag search""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_HomeController_likes25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("like/post/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_likes25_invoker = createInvoker(
    HomeController_0.likes(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "likes",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """like/post/""" + "$" + """id<[^/]+>""",
      """Like""",
      Seq()
    )
  )

  // @LINE:76
  private[this] lazy val controllers_Assets_versioned26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned26_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_register_get0_route(params@_) =>
      call { 
        controllers_HomeController_register_get0_invoker.call(HomeController_0.register_get)
      }
  
    // @LINE:7
    case controllers_HomeController_register_post1_route(params@_) =>
      call { 
        controllers_HomeController_register_post1_invoker.call(HomeController_0.register_post)
      }
  
    // @LINE:10
    case controllers_HomeController_login_get2_route(params@_) =>
      call { 
        controllers_HomeController_login_get2_invoker.call(HomeController_0.login_get)
      }
  
    // @LINE:11
    case controllers_HomeController_login_post3_route(params@_) =>
      call { 
        controllers_HomeController_login_post3_invoker.call(HomeController_0.login_post)
      }
  
    // @LINE:14
    case controllers_HomeController_logout4_route(params@_) =>
      call { 
        controllers_HomeController_logout4_invoker.call(HomeController_0.logout)
      }
  
    // @LINE:17
    case controllers_HomeController_index5_route(params@_) =>
      call { 
        controllers_HomeController_index5_invoker.call(HomeController_0.index)
      }
  
    // @LINE:20
    case controllers_HomeController_blog_detail6_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_blog_detail6_invoker.call(HomeController_0.blog_detail(id))
      }
  
    // @LINE:23
    case controllers_BlogController_create_Blog7_route(params@_) =>
      call { 
        controllers_BlogController_create_Blog7_invoker.call(BlogController_3.create_Blog)
      }
  
    // @LINE:24
    case controllers_BlogController_save_Blog8_route(params@_) =>
      call { 
        controllers_BlogController_save_Blog8_invoker.call(BlogController_3.save_Blog)
      }
  
    // @LINE:27
    case controllers_BlogController_update_blog9_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BlogController_update_blog9_invoker.call(BlogController_3.update_blog(id))
      }
  
    // @LINE:28
    case controllers_BlogController_update_save10_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BlogController_update_save10_invoker.call(BlogController_3.update_save(id))
      }
  
    // @LINE:31
    case controllers_BlogController_delete_blog11_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BlogController_delete_blog11_invoker.call(BlogController_3.delete_blog(id))
      }
  
    // @LINE:34
    case controllers_HomeController_blogpost_detail12_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_blogpost_detail12_invoker.call(HomeController_0.blogpost_detail(id))
      }
  
    // @LINE:37
    case controllers_BlogPostController_blogpost_create13_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BlogPostController_blogpost_create13_invoker.call(BlogPostController_1.blogpost_create(id))
      }
  
    // @LINE:38
    case controllers_BlogPostController_blogpost_save14_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BlogPostController_blogpost_save14_invoker.call(BlogPostController_1.blogpost_save(id))
      }
  
    // @LINE:41
    case controllers_BlogPostController_update_blogpost15_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BlogPostController_update_blogpost15_invoker.call(BlogPostController_1.update_blogpost(id))
      }
  
    // @LINE:42
    case controllers_BlogPostController_save_blogpost_update16_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BlogPostController_save_blogpost_update16_invoker.call(BlogPostController_1.save_blogpost_update(id))
      }
  
    // @LINE:45
    case controllers_BlogPostController_blogpost_delete17_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_BlogPostController_blogpost_delete17_invoker.call(BlogPostController_1.blogpost_delete(id))
      }
  
    // @LINE:48
    case controllers_CommentController_comment_save18_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommentController_comment_save18_invoker.call(CommentController_2.comment_save(id))
      }
  
    // @LINE:51
    case controllers_CommentController_comment_update_get19_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommentController_comment_update_get19_invoker.call(CommentController_2.comment_update_get(id))
      }
  
    // @LINE:52
    case controllers_CommentController_comment_update_post20_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommentController_comment_update_post20_invoker.call(CommentController_2.comment_update_post(id))
      }
  
    // @LINE:55
    case controllers_CommentController_comment_delete21_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_CommentController_comment_delete21_invoker.call(CommentController_2.comment_delete(id))
      }
  
    // @LINE:58
    case controllers_HomeController_category_detail22_route(params@_) =>
      call { 
        controllers_HomeController_category_detail22_invoker.call(HomeController_0.category_detail)
      }
  
    // @LINE:61
    case controllers_HomeController_category_posts23_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_category_posts23_invoker.call(HomeController_0.category_posts(id))
      }
  
    // @LINE:64
    case controllers_HomeController_tag_search24_route(params@_) =>
      call { 
        controllers_HomeController_tag_search24_invoker.call(HomeController_0.tag_search)
      }
  
    // @LINE:67
    case controllers_HomeController_likes25_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_HomeController_likes25_invoker.call(HomeController_0.likes(id))
      }
  
    // @LINE:76
    case controllers_Assets_versioned26_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned26_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
