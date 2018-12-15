
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

object blog_thumb extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Blog,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(blog : Blog):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""
"""),format.raw/*4.9*/("""

"""),format.raw/*6.1*/("""<div class="blog-content col-md-offset-2 col-md-3">
    <a href=""""),_display_(/*7.15*/routes/*7.21*/.HomeController.blog_detail(blog.getId)),format.raw/*7.60*/(""""> <h3>"""),_display_(/*7.68*/blog/*7.72*/.getBlog_title),format.raw/*7.86*/("""</h3> </a>
    <h3 class="lightgrey-text"> by """),_display_(/*8.37*/blog/*8.41*/.getUser.getName),format.raw/*8.57*/("""</h3>
    <h4 class="lightgrey-text">"""),_display_(/*9.33*/blog/*9.37*/.getCreation_date.getDayOfMonth),format.raw/*9.68*/("""/"""),_display_(/*9.70*/blog/*9.74*/.getCreation_date.getMonthOfYear),format.raw/*9.106*/("""/"""),_display_(/*9.108*/blog/*9.112*/.getCreation_date.getYear),format.raw/*9.137*/(""" """),format.raw/*9.138*/("""at """),_display_(/*9.142*/blog/*9.146*/.getCreation_date.getHourOfDay),format.raw/*9.176*/(""":"""),_display_(/*9.178*/blog/*9.182*/.getCreation_date.getMinuteOfHour),format.raw/*9.215*/(""" """),format.raw/*9.216*/("""</h4>
</div>"""))
      }
    }
  }

  def render(blog:Blog): play.twirl.api.HtmlFormat.Appendable = apply(blog)

  def f:((Blog) => play.twirl.api.HtmlFormat.Appendable) = (blog) => apply(blog)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 07 23:40:28 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/blog_thumb.scala.html
                  HASH: aefd5de9039cea035b2e7e11beea458c216e9b59
                  MATRIX: 960->1|1068->14|1096->183|1126->187|1219->254|1233->260|1292->299|1326->307|1338->311|1372->325|1446->373|1458->377|1494->393|1559->432|1571->436|1622->467|1650->469|1662->473|1715->505|1744->507|1757->511|1803->536|1832->537|1863->541|1876->545|1927->575|1956->577|1969->581|2023->614|2052->615
                  LINES: 28->1|33->1|34->4|36->6|37->7|37->7|37->7|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9|39->9
                  -- GENERATED --
              */
          