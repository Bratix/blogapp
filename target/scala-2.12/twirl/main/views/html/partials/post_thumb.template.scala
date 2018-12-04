
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
"""),format.raw/*2.1*/("""<img src=""""),format.raw/*2.11*/("""{"""),format.raw/*2.12*/("""{"""),format.raw/*2.13*/(""" """),format.raw/*2.14*/("""post.picture.url """),format.raw/*2.31*/("""}"""),format.raw/*2.32*/("""}"""),format.raw/*2.33*/("""" alt="" >

<h5 class="grey-text"> by """),_display_(/*4.28*/post/*4.32*/.getUser.getName),format.raw/*4.48*/(""" """),format.raw/*4.49*/("""</h5>

<h5 class="grey-text"> """),_display_(/*6.25*/post/*6.29*/.getCreation_date.getDayOfMonth),format.raw/*6.60*/("""/"""),_display_(/*6.62*/post/*6.66*/.getCreation_date.getMonthOfYear),format.raw/*6.98*/("""/"""),_display_(/*6.100*/post/*6.104*/.getCreation_date.getYear),format.raw/*6.129*/(""" """),format.raw/*6.130*/("""at """),_display_(/*6.134*/post/*6.138*/.getCreation_date.getHourOfDay),format.raw/*6.168*/(""":"""),_display_(/*6.170*/post/*6.174*/.getCreation_date.getMinuteOfHour),format.raw/*6.207*/(""" """),format.raw/*6.208*/("""</h5>

<a href="#" class="thumb-link">
    <h3> """),_display_(/*9.11*/post/*9.15*/.getPost_title),format.raw/*9.29*/(""" """),format.raw/*9.30*/("""</h3>
</a>

<p class="padding-bottom-20">&nbsp;"""),_display_(/*12.37*/post/*12.41*/.getPost_text),format.raw/*12.54*/(""" """),format.raw/*12.55*/("""</p>

<div class="tags-area">
        """),_display_(/*15.10*/for(tag <- post.getTags.split(",") ) yield /*15.46*/ {_display_(Seq[Any](format.raw/*15.48*/("""
            """),format.raw/*16.13*/("""<a href="#" class="btn-link">"""),_display_(/*16.43*/tag),format.raw/*16.46*/("""</a>
        """)))}),format.raw/*17.10*/("""
"""),format.raw/*18.1*/("""</div>
<br>

<a href="#" class="btn-link">Continue Reading...</a>"""))
      }
    }
  }

  def render(post:BlogPost): play.twirl.api.HtmlFormat.Appendable = apply(post)

  def f:((BlogPost) => play.twirl.api.HtmlFormat.Appendable) = (post) => apply(post)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 03 00:05:23 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/post_thumb.scala.html
                  HASH: 76b76636fd5cb27dbdcf90856a9c8b5bf1c90801
                  MATRIX: 964->1|1076->18|1104->20|1141->30|1169->31|1197->32|1225->33|1269->50|1297->51|1325->52|1392->93|1404->97|1440->113|1468->114|1527->147|1539->151|1590->182|1618->184|1630->188|1682->220|1711->222|1724->226|1770->251|1799->252|1830->256|1843->260|1894->290|1923->292|1936->296|1990->329|2019->330|2097->382|2109->386|2143->400|2171->401|2249->452|2262->456|2296->469|2325->470|2394->512|2446->548|2486->550|2528->564|2585->594|2609->597|2655->612|2684->614
                  LINES: 28->1|33->1|34->2|34->2|34->2|34->2|34->2|34->2|34->2|34->2|36->4|36->4|36->4|36->4|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|38->6|41->9|41->9|41->9|41->9|44->12|44->12|44->12|44->12|47->15|47->15|47->15|48->16|48->16|48->16|49->17|50->18
                  -- GENERATED --
              */
          