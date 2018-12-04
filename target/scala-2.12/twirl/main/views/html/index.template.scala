
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
/*1.2*/import views.html.partials.blog_thumb
/*2.2*/import views.html.partials.post_thumb

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Blog],List[BlogPost],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(blogs : List[Blog], blogPosts: List[BlogPost]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*4.2*/base(title = "Home")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
    """),format.raw/*5.5*/("""<section>
    <div class="swiper-container">
            <!-- Additional required wrapper -->
        <div class="swiper-wrapper">
                <!-- Slides -->



            """),_display_(/*13.14*/for(blog <- blogs) yield /*13.32*/ {_display_(Seq[Any](format.raw/*13.34*/("""
                """),format.raw/*14.17*/("""<div class="swiper-slide" height="250px">
                """),format.raw/*17.25*/("""
                """),_display_(/*18.18*/blog_thumb(blog)),format.raw/*18.34*/("""
                """),format.raw/*19.17*/("""</div>
            """)))}),format.raw/*20.14*/("""


        """),format.raw/*23.9*/("""</div>
        <div class="swiper-scrollbar"></div>
    </div>
    </section>

    <section class="col-md-4 col-md-offset-1 padding-top-20">

        <div class="section-title">
            <h1 class="white-text text-center">Popular posts</h1>
        </div>
        <br>
        """),_display_(/*34.10*/for(post <- blogPosts) yield /*34.32*/ {_display_(Seq[Any](format.raw/*34.34*/("""
            """),format.raw/*35.13*/("""<div class="post-thumb pl-25">
                """),_display_(/*36.18*/post_thumb(post)),format.raw/*36.34*/("""
            """),format.raw/*37.13*/("""</div>
        """)))}),format.raw/*38.10*/("""

    """),format.raw/*40.5*/("""</section>

""")))}),format.raw/*42.2*/("""

"""))
      }
    }
  }

  def render(blogs:List[Blog],blogPosts:List[BlogPost]): play.twirl.api.HtmlFormat.Appendable = apply(blogs,blogPosts)

  def f:((List[Blog],List[BlogPost]) => play.twirl.api.HtmlFormat.Appendable) = (blogs,blogPosts) => apply(blogs,blogPosts)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 03 00:40:10 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/index.scala.html
                  HASH: 7348ce47db3ee6f50e09883e47cf5caedd88dfae
                  MATRIX: 651->1|696->40|1057->79|1198->128|1226->148|1265->150|1296->155|1502->334|1536->352|1576->354|1621->371|1707->590|1752->608|1789->624|1834->641|1885->661|1923->672|2231->953|2269->975|2309->977|2350->990|2425->1038|2462->1054|2503->1067|2550->1083|2583->1089|2626->1102
                  LINES: 24->1|25->2|30->3|35->4|35->4|35->4|36->5|44->13|44->13|44->13|45->14|46->17|47->18|47->18|48->19|49->20|52->23|63->34|63->34|63->34|64->35|65->36|65->36|66->37|67->38|69->40|71->42
                  -- GENERATED --
              */
          