
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
                    """),_display_(/*14.22*/blog_thumb(blog)),format.raw/*14.38*/("""
                    """),format.raw/*15.21*/("""</div>
                """)))}),format.raw/*16.18*/("""

            """),format.raw/*18.13*/("""</div>
            <div class="swiper-scrollbar"></div>
        </div>

    </section>

    <div class="text-center padding-bottom-20 padding-top-20">
        <form action=""""),_display_(/*25.24*/routes/*25.30*/.BlogController.blog_create_get()),format.raw/*25.63*/("""" method="get">
            <button class="btn btn-link">Create your own blog</button>
        </form>
    </div>

    <section class="col-md-6 col-md-offset-1 padding-top-20">

        <div class="section-title">
            <h1 class="white-text text-center">Popular posts</h1>
        </div>
        <br>
        """),_display_(/*36.10*/for(post <- blogPosts) yield /*36.32*/ {_display_(Seq[Any](format.raw/*36.34*/("""
            """),format.raw/*37.13*/("""<div class="post-thumb pl-25">
                """),_display_(/*38.18*/post_thumb(post)),format.raw/*38.34*/("""
            """),format.raw/*39.13*/("""</div>
        """)))}),format.raw/*40.10*/("""

    """),format.raw/*42.5*/("""</section>

""")))}),format.raw/*44.2*/("""

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
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/index.scala.html
                  HASH: 0046077455d1a9f327a4812049ddd3630fb60303
                  MATRIX: 651->1|696->40|1057->79|1198->128|1226->148|1265->150|1296->155|1521->353|1555->371|1595->373|1644->394|1734->457|1771->473|1820->494|1875->518|1917->532|2118->706|2133->712|2187->745|2531->1062|2569->1084|2609->1086|2650->1099|2725->1147|2762->1163|2803->1176|2850->1192|2883->1198|2926->1211
                  LINES: 24->1|25->2|30->3|35->4|35->4|35->4|36->5|43->12|43->12|43->12|44->13|45->14|45->14|46->15|47->16|49->18|56->25|56->25|56->25|67->36|67->36|67->36|68->37|69->38|69->38|70->39|71->40|73->42|75->44
                  -- GENERATED --
              */
          