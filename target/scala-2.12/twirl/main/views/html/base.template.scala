
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

object base extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*1.33*/import views.html.partials._navbar


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*6.83*/("""">
    <link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("css/bootstrap-theme.min.css")),format.raw/*7.89*/("""">
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("css/style.css")),format.raw/*8.75*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("css/swiper.min.css")),format.raw/*9.80*/("""">


    <title>"""),_display_(/*12.13*/title),format.raw/*12.18*/("""</title>
</head>
<body>

    """),_display_(/*16.6*/_navbar(name = session().get("name"))),format.raw/*16.43*/("""
    """),_display_(/*17.6*/content),format.raw/*17.13*/("""


    """),format.raw/*20.5*/("""<script src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*20.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*21.65*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("js/main.js")),format.raw/*22.56*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*23.19*/routes/*23.25*/.Assets.versioned("js/swiper.min.js")),format.raw/*23.62*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("js/swipper.js")),format.raw/*24.59*/("""" type="text/javascript"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 02 17:58:58 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/base.scala.html
                  HASH: 8e913d3fcaadd379ae41730ff7cf15af02040231
                  MATRIX: 952->1|1056->32|1119->68|1250->173|1264->179|1326->221|1390->259|1404->265|1472->313|1536->351|1550->357|1604->391|1668->429|1682->435|1741->474|1788->494|1814->499|1874->533|1932->570|1965->577|1993->584|2030->594|2071->608|2086->614|2150->657|2231->711|2246->717|2307->757|2388->811|2403->817|2455->848|2536->902|2551->908|2609->945|2690->999|2705->1005|2760->1039
                  LINES: 28->1|31->1|34->2|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|44->12|44->12|48->16|48->16|49->17|49->17|52->20|52->20|52->20|52->20|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24
                  -- GENERATED --
              */
          