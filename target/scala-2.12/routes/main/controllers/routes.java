// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Amar/Desktop/javaplay_ss/blogapp/conf/routes
// @DATE:Mon Dec 17 01:16:54 CET 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBlogPostController BlogPostController = new controllers.ReverseBlogPostController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBlogController BlogController = new controllers.ReverseBlogController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCommentController CommentController = new controllers.ReverseCommentController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBlogPostController BlogPostController = new controllers.javascript.ReverseBlogPostController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBlogController BlogController = new controllers.javascript.ReverseBlogController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCommentController CommentController = new controllers.javascript.ReverseCommentController(RoutesPrefix.byNamePrefix());
  }

}
