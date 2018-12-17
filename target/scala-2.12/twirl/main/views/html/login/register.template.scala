
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper.inputText,helper.inputPassword


Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*3.2*/base(title = "Registration")/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""
    """),format.raw/*4.5*/("""<div class = "container-field">
        <div class="text-center"><h1><strong> Register!</strong></h1></div>
        <br><br>

        <div class = "row">

            <div class = "col-md-4 col-md-offset-4">
            """),_display_(/*11.14*/helper/*11.20*/.form(action = helper.CSRF(routes.HomeController.register_post()))/*11.86*/{_display_(Seq[Any](format.raw/*11.87*/("""
                """),_display_(/*12.18*/inputText(registerForm("name"), '_label -> "", 'placeholder -> "Enter username", 'class -> "form-control")),format.raw/*12.124*/("""
                """),_display_(/*13.18*/inputPassword(registerForm("password"), '_label -> "", 'placeholder -> "Enter password", 'class -> "form-control")),format.raw/*13.132*/("""

                """),format.raw/*15.17*/("""<div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Register &nbsp</button>
                </div>
            """)))}),format.raw/*18.14*/("""

            """),format.raw/*20.13*/("""</div>

        </div>

    </div>

""")))}))
      }
    }
  }

  def render(registerForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(registerForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (registerForm) => apply(registerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/login/register.scala.html
                  HASH: 4a6e4f8817c868d7ac8d0800d7e35cafd809948e
                  MATRIX: 961->1|1060->30|1134->27|1162->77|1198->105|1236->106|1268->112|1523->340|1538->346|1613->412|1652->413|1698->432|1826->538|1872->557|2008->671|2056->691|2245->849|2289->865
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|43->11|43->11|43->11|43->11|44->12|44->12|45->13|45->13|47->15|50->18|52->20
                  -- GENERATED --
              */
          