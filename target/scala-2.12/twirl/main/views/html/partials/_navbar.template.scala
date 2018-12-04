
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
                <a href=#> Categories </a>
            </div>

            <div class="col-md-3">
                <form action=# method="GET" class="search-form">
                <input type="text" name="search" placeholder=" Search" class="search-input">
                    <button type="submit" class="btn loop-icon"><span><i class="glyphicon glyphicon-search"></i></span></button>
                </form>
            </div>

                <div class="login-area col-md-2 navbar-right">





                    """),_display_(/*28.22*/if(name == null)/*28.38*/{_display_(Seq[Any](format.raw/*28.39*/("""
                        """),format.raw/*29.25*/("""<a href=""""),_display_(/*29.35*/routes/*29.41*/.HomeController.login_get()),format.raw/*29.68*/("""">Sing in</a>
                        <span class="separator"> | </span>
                        <a href=#>Sing up</a>
                    """)))}/*32.22*/else/*32.26*/{_display_(Seq[Any](format.raw/*32.27*/("""
                        """),format.raw/*33.25*/("""<a href="">"""),_display_(/*33.37*/name),format.raw/*33.41*/("""</a>
                        <span class="separator"> | </span>
                        <a href=""""),_display_(/*35.35*/routes/*35.41*/.HomeController.logout()),format.raw/*35.65*/("""">Logout</a>
                    """)))}),format.raw/*36.22*/("""


                """),format.raw/*39.17*/("""</div>

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
                  DATE: Sun Dec 02 18:01:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/_navbar.scala.html
                  HASH: 8d5b9ca0e72ae3335ca22fd39850a8a818508053
                  MATRIX: 959->1|1069->16|1097->18|1412->306|1427->312|1471->335|2047->884|2072->900|2111->901|2165->927|2202->937|2217->943|2265->970|2427->1113|2440->1117|2479->1118|2533->1144|2572->1156|2597->1160|2724->1260|2739->1266|2784->1290|2850->1325|2900->1347
                  LINES: 28->1|33->1|34->2|43->11|43->11|43->11|60->28|60->28|60->28|61->29|61->29|61->29|61->29|64->32|64->32|64->32|65->33|65->33|65->33|67->35|67->35|67->35|68->36|71->39
                  -- GENERATED --
              */
          