
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

"""),format.raw/*3.1*/("""<div class="text-center">
    <img src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.versioned(post.getPicture_path)),format.raw/*4.61*/("""" alt="" >
</div>

<h5 class="grey-text"> by """),_display_(/*7.28*/post/*7.32*/.getUser.getName),format.raw/*7.48*/(""" """),format.raw/*7.49*/("""</h5>

<h5 class="grey-text"> """),_display_(/*9.25*/post/*9.29*/.getCreation_date.getDayOfMonth),format.raw/*9.60*/("""/"""),_display_(/*9.62*/post/*9.66*/.getCreation_date.getMonthOfYear),format.raw/*9.98*/("""/"""),_display_(/*9.100*/post/*9.104*/.getCreation_date.getYear),format.raw/*9.129*/(""" """),format.raw/*9.130*/("""at """),_display_(/*9.134*/post/*9.138*/.getCreation_date.getHourOfDay),format.raw/*9.168*/(""":"""),_display_(/*9.170*/post/*9.174*/.getCreation_date.getMinuteOfHour),format.raw/*9.207*/(""" """),format.raw/*9.208*/("""</h5>

<a href=""""),_display_(/*11.11*/routes/*11.17*/.HomeController.blogpost_detail(post.getId)),format.raw/*11.60*/("""" class="thumb-link">
    <h3> """),_display_(/*12.11*/post/*12.15*/.getPost_title),format.raw/*12.29*/(""" """),format.raw/*12.30*/("""</h3>
</a>

<div class="tags-area">
        """),_display_(/*16.10*/for(tag <- post.getTags.split(",") ) yield /*16.46*/ {_display_(Seq[Any](format.raw/*16.48*/("""
            """),format.raw/*17.13*/("""<a href="#" class="btn-link">"""),_display_(/*17.43*/tag),format.raw/*17.46*/("""</a>
        """)))}),format.raw/*18.10*/("""
"""),format.raw/*19.1*/("""</div>
<br>

<a href=""""),_display_(/*22.11*/routes/*22.17*/.HomeController.blogpost_detail(post.getId)),format.raw/*22.60*/("""" class="btn-link">Continue Reading...</a>"""))
      }
    }
  }

  def render(post:BlogPost): play.twirl.api.HtmlFormat.Appendable = apply(post)

  def f:((BlogPost) => play.twirl.api.HtmlFormat.Appendable) = (post) => apply(post)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/partials/post_thumb.scala.html
                  HASH: a2d6c7ea67df37298cfdde246a2e7bd83b4afe4d
                  MATRIX: 964->1|1076->18|1106->22|1174->64|1188->70|1247->109|1322->158|1334->162|1370->178|1398->179|1457->212|1469->216|1520->247|1548->249|1560->253|1612->285|1641->287|1654->291|1700->316|1729->317|1760->321|1773->325|1824->355|1853->357|1866->361|1920->394|1949->395|1995->414|2010->420|2074->463|2134->496|2147->500|2182->514|2211->515|2287->564|2339->600|2379->602|2421->616|2478->646|2502->649|2548->664|2577->666|2630->692|2645->698|2709->741
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|39->7|39->7|39->7|39->7|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|41->9|43->11|43->11|43->11|44->12|44->12|44->12|44->12|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|54->22|54->22|54->22
                  -- GENERATED --
              */
          