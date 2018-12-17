
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
/*1.2*/import views.html.partials._navbar

object base extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href=""""),_display_(/*7.35*/routes/*7.41*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*7.83*/("""">
    <link rel="stylesheet" href=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("css/bootstrap-theme.min.css")),format.raw/*8.89*/("""">
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("css/style.css")),format.raw/*9.75*/("""">
    <link rel="stylesheet" href=""""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("css/swiper.min.css")),format.raw/*10.80*/("""">


    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
</head>
<body>

    """),_display_(/*17.6*/_navbar(name = session().get("name"))),format.raw/*17.43*/("""
    """),_display_(/*18.6*/content),format.raw/*18.13*/("""


    """),format.raw/*21.5*/("""<script src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.versioned("js/jquery-3.3.1.min.js")),format.raw/*21.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*22.65*/("""" type="text/javascript"></script>
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
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/base.scala.html
                  HASH: 6fce6f08f7a45d15d94525f9e4625fb483288dc1
                  MATRIX: 651->1|994->38|1119->68|1147->70|1278->175|1292->181|1354->223|1418->261|1432->267|1500->315|1564->353|1578->359|1632->393|1697->431|1712->437|1772->476|1819->496|1845->501|1905->535|1963->572|1996->579|2024->586|2061->596|2102->610|2117->616|2181->659|2262->713|2277->719|2338->759|2419->813|2434->819|2492->856|2573->910|2588->916|2643->950
                  LINES: 24->1|29->2|34->2|35->3|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|45->13|45->13|49->17|49->17|50->18|50->18|53->21|53->21|53->21|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24
                  -- GENERATED --
              */
          