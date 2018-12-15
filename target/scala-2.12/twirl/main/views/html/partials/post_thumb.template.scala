
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

object post_thumb extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[BlogPost,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post : BlogPost):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""


"""),format.raw/*4.1*/("""<h5 class="grey-text"> by """),_display_(/*4.28*/post/*4.32*/.getUser.getName),format.raw/*4.48*/(""" """),format.raw/*4.49*/("""</h5>

<h5 class="grey-text"> """),_display_(/*6.25*/post/*6.29*/.getCreation_date.getDayOfMonth),format.raw/*6.60*/("""/"""),_display_(/*6.62*/post/*6.66*/.getCreation_date.getMonthOfYear),format.raw/*6.98*/("""/"""),_display_(/*6.100*/post/*6.104*/.getCreation_date.getYear),format.raw/*6.129*/(""" """),format.raw/*6.130*/("""at """),_display_(/*6.134*/post/*6.138*/.getCreation_date.getHourOfDay),format.raw/*6.168*/(""":"""),_display_(/*6.170*/post/*6.174*/.getCreation_date.getMinuteOfHour),format.raw/*6.207*/(""" """),format.raw/*6.208*/("""</h5>

<a href=""""),_display_(/*8.11*/routes/*8.17*/.HomeController.blogpost_detail(post.getId)),format.raw/*8.60*/("""" class="thumb-link">
    <h3> """),_display_(/*9.11*/post/*9.15*/.getPost_title),format.raw/*9.29*/(""" """),format.raw/*9.30*/("""</h3>
</a>

<p class="padding-bottom-20">&nbsp;"""),_display_(/*12.37*/post/*12.41*/.getPost_text),format.raw/*12.54*/(""" """),format.raw/*12.55*/("""</p>

<div class="tags-area">
        """),_display_(/*15.10*/for(tag <- post.getTags.split(",") ) yield /*15.46*/ {_display_(Seq[Any](format.raw/*15.48*/("""
            """),format.raw/*16.13*/("""<a href="#" class="btn-link">"""),_display_(/*16.43*/tag),format.raw/*16.46*/("""</a>
        """)))}),format.raw/*17.10*/("""
"""),format.raw/*18.1*/("""</div>
<br>

<a href=""""),_display_(/*21.11*/routes/*21.17*/.HomeController.blogpost_detail(post.getId)),format.raw/*21.60*/("""" class="btn-link">Continue Reading...</a>"""))
      }
    }
  }

  def render(post:BlogPost): play.twirl.api.HtmlFormat.Appendable = apply(post)

  def f:((BlogPost) => play.twirl.api.HtmlFormat.Appendable) = (post) => apply(post)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 08 00:27:00 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/post_thumb.scala.html
                  HASH: f49901e0277db922134ea88909a776fa1a5e5ae4
                  MATRIX: 964->1|1076->18|1108->24|1161->51|1173->55|1209->71|1237->72|1296->105|1308->109|1359->140|1387->142|1399->146|1451->178|1480->180|1493->184|1539->209|1568->210|1599->214|1612->218|1663->248|1692->250|1705->254|1759->287|1788->288|1833->307|1847->313|1910->356|1969->389|1981->393|2015->407|2043->408|2121->459|2134->463|2168->476|2197->477|2266->519|2318->555|2358->557|2400->571|2457->601|2481->604|2527->619|2556->621|2609->647|2624->653|2688->696
                  LINES: 28->1|33->1|36->4|36->4|36->4|36->4|36->4|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|40->8|40->8|40->8|41->9|41->9|41->9|41->9|44->12|44->12|44->12|44->12|47->15|47->15|47->15|48->16|48->16|48->16|49->17|50->18|53->21|53->21|53->21
                  -- GENERATED --
              */
          