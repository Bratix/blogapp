
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
/*1.2*/import partials.post_thumb,partials.blog_actionbuttons

object blog_detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Blog,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(blog : Blog):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.15*/("""
"""),_display_(/*3.2*/base(title = "Blog")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="breadcumb-area">
            <div class="breadcumb-title text-center">
                <h1>"""),_display_(/*7.22*/blog/*7.26*/.getBlog_title),format.raw/*7.40*/("""</h1>
            </div>
        </div>


        <section class="col-md-5 col-md-offset-1">

            """),_display_(/*14.14*/for(post <- blog.getBlogPosts ) yield /*14.45*/{_display_(Seq[Any](format.raw/*14.46*/("""

            """),format.raw/*16.13*/("""<div class="post-thumb pl-25">
            """),_display_(/*17.14*/post_thumb(post)),format.raw/*17.30*/("""
            """),format.raw/*18.13*/("""</div>
            """)))}),format.raw/*19.14*/("""

        """),format.raw/*21.9*/("""</section>


        <section class="col-md-offset-2 col-md-3">

            <h1 class="section-title text-center">About me</h1>

            <div class="post-thumb text-center">
                <h3>"""),_display_(/*29.22*/blog/*29.26*/.getUser.getName),format.raw/*29.42*/("""</h3>
            </div>
            """),_display_(/*31.14*/if(session().get("name")== blog.getUser.getName)/*31.62*/ {_display_(Seq[Any](format.raw/*31.64*/("""
                """),_display_(/*32.18*/blog_actionbuttons(blog)),format.raw/*32.42*/("""
            """)))}),format.raw/*33.14*/("""

        """),format.raw/*35.9*/("""</section>

    </div>
""")))}))
      }
    }
  }

  def render(blog:Blog): play.twirl.api.HtmlFormat.Appendable = apply(blog)

  def f:((Blog) => play.twirl.api.HtmlFormat.Appendable) = (blog) => apply(blog)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/blog_detail.scala.html
                  HASH: cdf515d4465561c7c26d28c381c2e05b6d455ee8
                  MATRIX: 651->1|1014->58|1122->71|1150->74|1178->94|1217->96|1249->102|1408->235|1420->239|1454->253|1595->367|1642->398|1681->399|1725->415|1797->460|1834->476|1876->490|1928->511|1967->523|2202->731|2215->735|2252->751|2319->791|2376->839|2416->841|2462->860|2507->884|2553->899|2592->911
                  LINES: 24->1|29->2|34->2|35->3|35->3|35->3|36->4|39->7|39->7|39->7|46->14|46->14|46->14|48->16|49->17|49->17|50->18|51->19|53->21|61->29|61->29|61->29|63->31|63->31|63->31|64->32|64->32|65->33|67->35
                  -- GENERATED --
              */
          