
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
/*1.2*/import partials.post_thumb

object tag_search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[BlogPost],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(posts : List[BlogPost]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.26*/("""
"""),_display_(/*3.2*/base(title = "Tags")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<div class="section-title col-md-4 col-md-offset-4 text-center mb-20">
        <h2 class="white-text text-center">Search Results</h2>
    </div>
    """),_display_(/*7.6*/for(post <- posts) yield /*7.24*/{_display_(Seq[Any](format.raw/*7.25*/("""
        """),format.raw/*8.9*/("""<div class="row">

            <div class="post-thumb pl-25 col-md-7 col-md-offset-3">
            """),_display_(/*11.14*/post_thumb(post)),format.raw/*11.30*/("""
            """),format.raw/*12.13*/("""</div>

        </div>
    """)))}),format.raw/*15.6*/("""
""")))}))
      }
    }
  }

  def render(posts:List[BlogPost]): play.twirl.api.HtmlFormat.Appendable = apply(posts)

  def f:((List[BlogPost]) => play.twirl.api.HtmlFormat.Appendable) = (posts) => apply(posts)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 11 00:57:20 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/tag_search.scala.html
                  HASH: b2d331d72c0586efac24f61143b7ceec21127337
                  MATRIX: 651->1|995->30|1114->54|1142->57|1170->77|1208->78|1240->84|1418->237|1451->255|1489->256|1525->266|1655->369|1692->385|1734->399|1795->430
                  LINES: 24->1|29->2|34->2|35->3|35->3|35->3|36->4|39->7|39->7|39->7|40->8|43->11|43->11|44->12|47->15
                  -- GENERATED --
              */
          