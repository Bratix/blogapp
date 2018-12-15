
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
/*1.2*/import partials.blog_thumb

object category_blogs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Category,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(category : Category):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.23*/("""
"""),_display_(/*3.2*/base(title = "Category blogs")/*3.32*/{_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<div class="section-title col-md-4 col-md-offset-4 text-center mb-20">
        <h2 class="white-text text-center">Search Results</h2>
    </div>
    """),_display_(/*7.6*/for(blog <- category.getBlogs) yield /*7.36*/{_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<div class="row">

            <div class="post-thumb pl-25 col-md-7 col-md-offset-3">
                """),_display_(/*11.18*/blog_thumb(blog)),format.raw/*11.34*/("""
            """),format.raw/*12.13*/("""</div>

        </div>
    """)))}),format.raw/*15.6*/("""
""")))}))
      }
    }
  }

  def render(category:Category): play.twirl.api.HtmlFormat.Appendable = apply(category)

  def f:((Category) => play.twirl.api.HtmlFormat.Appendable) = (category) => apply(category)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 07 23:45:59 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/category_blogs.scala.html
                  HASH: ff8509f7cf9c218f1dbd2f4b74c042be73eddf96
                  MATRIX: 651->1|993->30|1109->51|1137->54|1175->84|1213->85|1245->91|1423->244|1468->274|1506->275|1542->285|1676->392|1713->408|1755->422|1816->453
                  LINES: 24->1|29->2|34->2|35->3|35->3|35->3|36->4|39->7|39->7|39->7|40->8|43->11|43->11|44->12|47->15
                  -- GENERATED --
              */
          