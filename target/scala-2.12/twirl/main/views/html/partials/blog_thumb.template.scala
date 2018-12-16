
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
"""),format.raw/*2.1*/("""<div class="blog-picture col-md-offset-1 col-md-3">
    <img src=""""),_display_(/*3.16*/routes/*3.22*/.Assets.versioned(blog.getPicture_path)),format.raw/*3.61*/("""" alt="" height="300" width="400">
</div>

<div class="blog-content col-md-offset-2 col-md-3">
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
                  DATE: Sun Dec 16 16:46:46 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/blog_thumb.scala.html
                  HASH: 68da541491408b2966e5a023f9446ae198c7546f
                  MATRIX: 960->1|1068->14|1096->16|1190->84|1204->90|1263->129|1402->242|1416->248|1475->287|1509->295|1521->299|1555->313|1629->361|1641->365|1677->381|1742->420|1754->424|1805->455|1833->457|1845->461|1898->493|1927->495|1940->499|1986->524|2015->525|2046->529|2059->533|2110->563|2139->565|2152->569|2206->602|2235->603
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9
                  -- GENERATED --
              */
          