
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

object _navbar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name : String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*2.1*/("""<nav class="navbar navbar-dark bg-primary">

    <div class="container-fluid">
        <div class="row">
            <div class="navbar-brand">
                <span> &nbsp; Blogo</span>
            </div>

            <div class="page-links col-md-2">
                <a href=""""),_display_(/*11.27*/routes/*11.33*/.HomeController.index()),format.raw/*11.56*/("""">  Home </a>
                <a href=""""),_display_(/*12.27*/routes/*12.33*/.HomeController.category_detail),format.raw/*12.64*/(""""> Categories </a>
            </div>

            <div class="col-md-3">
                <form action=""""),_display_(/*16.32*/routes/*16.38*/.HomeController.tag_search),format.raw/*16.64*/("""" method="GET" class="search-form">
                <input type="text" name="tag" id="tag" placeholder=" Search" class="search-input">
                    <button type="submit" class="btn loop-icon"><span><i class="glyphicon glyphicon-search"></i></span></button>
                </form>
            </div>

                <div class="login-area col-md-2 navbar-right">


                    """),_display_(/*25.22*/if(name == null)/*25.38*/{_display_(Seq[Any](format.raw/*25.39*/("""
                        """),format.raw/*26.25*/("""<a href=""""),_display_(/*26.35*/routes/*26.41*/.HomeController.login_get()),format.raw/*26.68*/("""">Sing in</a>
                        <span class="separator"> | </span>
                        <a href=#>Sing up</a>
                    """)))}/*29.22*/else/*29.26*/{_display_(Seq[Any](format.raw/*29.27*/("""
                        """),format.raw/*30.25*/("""<a href="">"""),_display_(/*30.37*/name),format.raw/*30.41*/("""</a>
                        <span class="separator"> | </span>
                        <a href=""""),_display_(/*32.35*/routes/*32.41*/.HomeController.logout()),format.raw/*32.65*/("""">Logout</a>
                    """)))}),format.raw/*33.22*/("""


                """),format.raw/*36.17*/("""</div>

        </div>
    </div>

</nav>
"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 11 00:57:20 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/_navbar.scala.html
                  HASH: 8a62a6d135bc73773692ab4eca5144f336315c84
                  MATRIX: 959->1|1069->16|1097->18|1412->306|1427->312|1471->335|1539->376|1554->382|1606->413|1742->522|1757->528|1804->554|2234->957|2259->973|2298->974|2352->1000|2389->1010|2404->1016|2452->1043|2614->1186|2627->1190|2666->1191|2720->1217|2759->1229|2784->1233|2911->1333|2926->1339|2971->1363|3037->1398|3087->1420
                  LINES: 28->1|33->1|34->2|43->11|43->11|43->11|44->12|44->12|44->12|48->16|48->16|48->16|57->25|57->25|57->25|58->26|58->26|58->26|58->26|61->29|61->29|61->29|62->30|62->30|62->30|64->32|64->32|64->32|65->33|68->36
                  -- GENERATED --
              */
          