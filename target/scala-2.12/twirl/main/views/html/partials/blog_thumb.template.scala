
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
"""),format.raw/*2.1*/("""<div class="blog-content col-md-offset-2 col-md-3">
    <a href="#"> <h3>"""),_display_(/*3.23*/blog/*3.27*/.getBlog_title),format.raw/*3.41*/("""</h3> </a>
    <h3 class="lightgrey-text"> by """),_display_(/*4.37*/blog/*4.41*/.getUser.getName),format.raw/*4.57*/("""</h3>
    <h4 class="lightgrey-text">"""),_display_(/*5.33*/blog/*5.37*/.getCreation_date.getDayOfMonth),format.raw/*5.68*/("""/"""),_display_(/*5.70*/blog/*5.74*/.getCreation_date.getMonthOfYear),format.raw/*5.106*/("""/"""),_display_(/*5.108*/blog/*5.112*/.getCreation_date.getYear),format.raw/*5.137*/(""" """),format.raw/*5.138*/("""at """),_display_(/*5.142*/blog/*5.146*/.getCreation_date.getHourOfDay),format.raw/*5.176*/(""":"""),_display_(/*5.178*/blog/*5.182*/.getCreation_date.getMinuteOfHour),format.raw/*5.215*/(""" """),format.raw/*5.216*/("""</h4>
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
                  DATE: Mon Dec 03 00:27:34 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/blog_thumb.scala.html
                  HASH: 78ee39296f1416a5cc33760d08057fa1fb1f3e59
                  MATRIX: 960->1|1068->14|1096->16|1197->91|1209->95|1243->109|1317->157|1329->161|1365->177|1430->216|1442->220|1493->251|1521->253|1533->257|1586->289|1615->291|1628->295|1674->320|1703->321|1734->325|1747->329|1798->359|1827->361|1840->365|1894->398|1923->399
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5
                  -- GENERATED --
              */
          