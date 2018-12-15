
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

object blogpost_actionbuttons extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[BlogPost,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: BlogPost):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""
"""),format.raw/*2.1*/("""<div class="post-thumb">

        <!-- Post Update -->
    <div >
        <form action=""""),_display_(/*6.24*/routes/*6.30*/.BlogPostController.update_blogpost(post.getId)),format.raw/*6.77*/("""" method="get" visible = "off">

            <div class="text-center">
                <button type="submit" class="btn-link">Update post</button>
            </div>
        </form>
    </div>

    <br>
        <!-- Post Delete -->
    <div>
        <form action=""""),_display_(/*17.24*/helper/*17.30*/.CSRF(routes.BlogPostController.blogpost_delete(post.getId))),format.raw/*17.90*/("""" method="post" visible = "off">

            <div class="text-center">
                <button type="submit" class="btn-link">Delete post</button>
            </div>
        </form>
    </div>

</div>"""))
      }
    }
  }

  def render(post:BlogPost): play.twirl.api.HtmlFormat.Appendable = apply(post)

  def f:((BlogPost) => play.twirl.api.HtmlFormat.Appendable) = (post) => apply(post)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 10 17:25:25 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/blogpost_actionbuttons.scala.html
                  HASH: eb6df5e8926ecbe2c7493b5185d5dbd447762a2b
                  MATRIX: 976->1|1087->17|1115->19|1234->112|1248->118|1315->165|1618->441|1633->447|1714->507
                  LINES: 28->1|33->1|34->2|38->6|38->6|38->6|49->17|49->17|49->17
                  -- GENERATED --
              */
          