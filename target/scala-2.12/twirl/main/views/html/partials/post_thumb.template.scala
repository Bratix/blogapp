
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

"""),format.raw/*3.1*/("""<img src=""""),_display_(/*3.12*/routes/*3.18*/.Assets.versioned(post.getPicture_path)),format.raw/*3.57*/("""" alt="" >

<h5 class="grey-text"> by """),_display_(/*5.28*/post/*5.32*/.getUser.getName),format.raw/*5.48*/(""" """),format.raw/*5.49*/("""</h5>

<h5 class="grey-text"> """),_display_(/*7.25*/post/*7.29*/.getCreation_date.getDayOfMonth),format.raw/*7.60*/("""/"""),_display_(/*7.62*/post/*7.66*/.getCreation_date.getMonthOfYear),format.raw/*7.98*/("""/"""),_display_(/*7.100*/post/*7.104*/.getCreation_date.getYear),format.raw/*7.129*/(""" """),format.raw/*7.130*/("""at """),_display_(/*7.134*/post/*7.138*/.getCreation_date.getHourOfDay),format.raw/*7.168*/(""":"""),_display_(/*7.170*/post/*7.174*/.getCreation_date.getMinuteOfHour),format.raw/*7.207*/(""" """),format.raw/*7.208*/("""</h5>

<a href=""""),_display_(/*9.11*/routes/*9.17*/.HomeController.blogpost_detail(post.getId)),format.raw/*9.60*/("""" class="thumb-link">
    <h3> """),_display_(/*10.11*/post/*10.15*/.getPost_title),format.raw/*10.29*/(""" """),format.raw/*10.30*/("""</h3>
</a>

<p class="padding-bottom-20">&nbsp;"""),_display_(/*13.37*/post/*13.41*/.getPost_text),format.raw/*13.54*/(""" """),format.raw/*13.55*/("""</p>

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
                  DATE: Sun Dec 16 16:54:45 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/post_thumb.scala.html
                  HASH: 3d6d5938eee3df9fdd23c014706f12196af02cc6
                  MATRIX: 964->1|1076->18|1106->22|1143->33|1157->39|1216->78|1283->119|1295->123|1331->139|1359->140|1418->173|1430->177|1481->208|1509->210|1521->214|1573->246|1602->248|1615->252|1661->277|1690->278|1721->282|1734->286|1785->316|1814->318|1827->322|1881->355|1910->356|1955->375|1969->381|2032->424|2092->457|2105->461|2140->475|2169->476|2247->527|2260->531|2294->544|2323->545|2392->587|2444->623|2484->625|2526->639|2583->669|2607->672|2653->687|2682->689|2735->715|2750->721|2814->764
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|37->5|37->5|37->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|42->10|45->13|45->13|45->13|45->13|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|54->22|54->22|54->22
                  -- GENERATED --
              */
          