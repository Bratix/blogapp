
package views.html.partials

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object blog_actionbuttons extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Blog,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(blog: Blog):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
"""),format.raw/*2.1*/("""<div class="post-thumb">

        <!-- Post Create -->
    <div>
        <form action=""""),_display_(/*6.24*/routes/*6.30*/.BlogPostController.blogpost_create(blog.getId)),format.raw/*6.77*/("""" method="get" visible = "off">

            <div class="text-center">
                <button type="submit" class="btn-link">Create a new post</button>
            </div>
        </form>
    </div>
    <br>
        <!-- Blog Update -->
    <div >
        <form action=""""),_display_(/*16.24*/helper/*16.30*/.CSRF(routes.BlogController.update_blog(blog.getId))),format.raw/*16.82*/("""" method="get" visible = "off">
            <div class="text-center">
                <button type="submit" class="btn-link">Update your blog</button>
            </div>
        </form>
    </div>
    <br>
        <!-- Blog Delete -->
    <div>
        <form action=""""),_display_(/*25.24*/helper/*25.30*/.CSRF(routes.BlogController.delete_blog(blog.getId))),format.raw/*25.82*/("""" method="post">
            <div class="text-center">
                <button type="submit" class="btn-link">Delete blog</button>
            </div>
        </form>
    </div>

</div>"""))
      }
    }
  }

  def render(blog:Blog): play.twirl.api.HtmlFormat.Appendable = apply(blog)

  def f:((Blog) => play.twirl.api.HtmlFormat.Appendable) = (blog) => apply(blog)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 09 14:44:59 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/blog_actionbuttons.scala.html
                  HASH: a68fb38cdff19945ed45748561ba2f44ac8e9c66
                  MATRIX: 968->1|1075->13|1103->15|1221->107|1235->113|1302->160|1610->441|1625->447|1698->499|2002->776|2017->782|2090->834
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|48->16|48->16|48->16|57->25|57->25|57->25
                  -- GENERATED --
              */
          