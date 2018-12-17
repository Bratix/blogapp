
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
"""),format.raw/*2.1*/("""<div class="blog-picture col-md-offset-1 col-md-3 text-center">
    <img src=""""),_display_(/*3.16*/routes/*3.22*/.Assets.versioned(blog.getPicture_path)),format.raw/*3.61*/("""" alt="" height="300" width="400">
</div>

<div class="blog-content col-md-offset-2 col-md-3">
    <a href=""""),_display_(/*7.15*/routes/*7.21*/.HomeController.blog_detail(blog.getId)),format.raw/*7.60*/(""""> <h3>"""),_display_(/*7.68*/blog/*7.72*/.getBlog_title),format.raw/*7.86*/("""</h3> </a>
    <h3 class=""> by """),_display_(/*8.23*/blog/*8.27*/.getUser.getName),format.raw/*8.43*/("""</h3>
    <h4 class=" ">"""),_display_(/*9.20*/blog/*9.24*/.getCreation_date.getDayOfMonth),format.raw/*9.55*/("""/"""),_display_(/*9.57*/blog/*9.61*/.getCreation_date.getMonthOfYear),format.raw/*9.93*/("""/"""),_display_(/*9.95*/blog/*9.99*/.getCreation_date.getYear),format.raw/*9.124*/(""" """),format.raw/*9.125*/("""at """),_display_(/*9.129*/blog/*9.133*/.getCreation_date.getHourOfDay),format.raw/*9.163*/(""":"""),_display_(/*9.165*/blog/*9.169*/.getCreation_date.getMinuteOfHour),format.raw/*9.202*/(""" """),format.raw/*9.203*/("""</h4>
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
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/partials/blog_thumb.scala.html
                  HASH: 0adb5beb0e9379c70b12c56abb0babb9a60ab262
                  MATRIX: 960->1|1068->14|1096->16|1202->96|1216->102|1275->141|1414->254|1428->260|1487->299|1521->307|1533->311|1567->325|1627->359|1639->363|1675->379|1727->405|1739->409|1790->440|1818->442|1830->446|1882->478|1910->480|1922->484|1968->509|1997->510|2028->514|2041->518|2092->548|2121->550|2134->554|2188->587|2217->588
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9
                  -- GENERATED --
              */
          