
package views.html

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

object user_blogs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Blog],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(blogs: List[Blog]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import partials.blog_thumb


Seq[Any](format.raw/*1.21*/("""
"""),_display_(/*3.2*/base(title = "title")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<div class="section-title col-md-4 col-md-offset-4 text-center mb-20">
        <h2 class="white-text text-center">Your blogs:</h2>
    </div>
    """),_display_(/*7.6*/for(blog <- blogs) yield /*7.24*/{_display_(Seq[Any](format.raw/*7.25*/("""
        """),format.raw/*8.9*/("""<div class="row">

            <div class="post-thumb pl-25 col-md-10 col-md-offset-1">
            """),_display_(/*11.14*/blog_thumb(blog)),format.raw/*11.30*/("""
            """),format.raw/*12.13*/("""</div>

        </div>
    """)))}),format.raw/*15.6*/("""
""")))}))
      }
    }
  }

  def render(blogs:List[Blog]): play.twirl.api.HtmlFormat.Appendable = apply(blogs)

  def f:((List[Blog]) => play.twirl.api.HtmlFormat.Appendable) = (blogs) => apply(blogs)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/user_blogs.scala.html
                  HASH: ca3b8fe6eb8f46bb8d6e2be12b6d4a31534edd81
                  MATRIX: 957->1|1049->23|1105->20|1133->52|1162->73|1200->74|1232->80|1407->230|1440->248|1478->249|1514->259|1645->363|1682->379|1724->393|1785->424
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|39->7|39->7|39->7|40->8|43->11|43->11|44->12|47->15
                  -- GENERATED --
              */
          