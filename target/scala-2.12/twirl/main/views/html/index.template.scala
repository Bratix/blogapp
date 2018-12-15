
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

                """),_display_(/*12.18*/for(blog <- blogs) yield /*12.36*/ {_display_(Seq[Any](format.raw/*12.38*/("""
                    """),format.raw/*13.21*/("""<div class="swiper-slide" height="250px">
                    """),format.raw/*16.29*/("""
                    """),_display_(/*17.22*/blog_thumb(blog)),format.raw/*17.38*/("""
                    """),format.raw/*18.21*/("""</div>
                """)))}),format.raw/*19.18*/("""

            """),format.raw/*21.13*/("""</div>
            <div class="swiper-scrollbar"></div>
        </div>

    </section>

    <div class="text-center padding-bottom-20 padding-top-20">
        <form action=""""),_display_(/*28.24*/routes/*28.30*/.BlogController.create_Blog()),format.raw/*28.59*/("""" method="get">
            <button class="btn btn-link">Create your own blog</button>
        </form>
    </div>

    <section class="col-md-4 col-md-offset-1 padding-top-20">

        <div class="section-title">
            <h1 class="white-text text-center">Popular posts</h1>
        </div>
        <br>
        """),_display_(/*39.10*/for(post <- blogPosts) yield /*39.32*/ {_display_(Seq[Any](format.raw/*39.34*/("""
            """),format.raw/*40.13*/("""<div class="post-thumb pl-25">
                """),_display_(/*41.18*/post_thumb(post)),format.raw/*41.34*/("""
            """),format.raw/*42.13*/("""</div>
        """)))}),format.raw/*43.10*/("""

    """),format.raw/*45.5*/("""</section>

""")))}),format.raw/*47.2*/("""

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
                  DATE: Sun Dec 09 02:47:54 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/index.scala.html
                  HASH: 02b1ccac46d92418c53fc750151ddc0dc084a183
                  MATRIX: 651->1|696->40|1057->79|1198->128|1226->148|1265->150|1296->155|1521->353|1555->371|1595->373|1644->394|1734->625|1783->647|1820->663|1869->684|1924->708|1966->722|2167->896|2182->902|2232->931|2576->1248|2614->1270|2654->1272|2695->1285|2770->1333|2807->1349|2848->1362|2895->1378|2928->1384|2971->1397
                  LINES: 24->1|25->2|30->3|35->4|35->4|35->4|36->5|43->12|43->12|43->12|44->13|45->16|46->17|46->17|47->18|48->19|50->21|57->28|57->28|57->28|68->39|68->39|68->39|69->40|70->41|70->41|71->42|72->43|74->45|76->47
                  -- GENERATED --
              */
          