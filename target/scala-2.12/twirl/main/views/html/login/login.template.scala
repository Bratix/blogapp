
package views.html.login

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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper.inputText, helper.inputPassword


Seq[Any](format.raw/*1.26*/("""
"""),_display_(/*3.2*/base(title = "Login")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
"""),format.raw/*4.1*/("""<div class = "container-field">
    <div class="text-center"><h1><strong> Log into your account!</strong></h1></div>
    <br><br>

    <div class = "row">

        <div class = "col-md-4 col-md-offset-4">
            """),_display_(/*11.14*/helper/*11.20*/.form(action = helper.CSRF(routes.HomeController.login_post()))/*11.83*/ {_display_(Seq[Any](format.raw/*11.85*/("""
                """),_display_(/*12.18*/inputText(loginForm("name"), '_label -> "", 'placeholder -> "Username", 'class -> "form-control")),format.raw/*12.115*/("""
                """),_display_(/*13.18*/inputPassword(loginForm("password"), '_label -> "", 'placeholder -> "Password", 'class -> "form-control")),format.raw/*13.123*/("""
                """),format.raw/*14.17*/("""<div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Login &nbsp</button>
                </div>
            """)))}),format.raw/*17.14*/("""



        """),format.raw/*21.9*/("""</div>

    </div>

</div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/login/login.scala.html
                  HASH: 8313b492085f9951215bc622037f97482e26baf7
                  MATRIX: 959->1|1056->28|1131->25|1159->76|1188->97|1226->98|1254->100|1506->325|1521->331|1593->394|1633->396|1679->415|1798->512|1844->531|1971->636|2017->654|2203->809|2246->825
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|43->11|43->11|43->11|43->11|44->12|44->12|45->13|45->13|46->14|49->17|53->21
                  -- GENERATED --
              */
          