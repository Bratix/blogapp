
package views.html.blog

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

object blog_create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Blog],Seq[Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(blogForm: Form[Blog],categories : Seq[Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper.inputText, helper.textarea, helper.select, helper.CSRF


Seq[Any](format.raw/*1.51*/("""
"""),_display_(/*3.2*/base(title = "Create a blog")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""



    """),format.raw/*7.5*/("""<div class = "container-field">
        <div class="text-center"><h1><strong>Crate your blog and let the fun begin!</strong></h1></div>
        <br><br>
        <div class = "row">

            <div class = "col-md-4 col-md-offset-4">
            """),_display_(/*13.14*/helper/*13.20*/.form(action = helper.CSRF(routes.BlogController.save_Blog()))/*13.82*/ {_display_(Seq[Any](format.raw/*13.84*/("""
                """),_display_(/*14.18*/inputText(blogForm("blog_title"), '_label -> "", 'placeholder -> "Your blog title", 'class -> "form-control")),format.raw/*14.127*/("""
                """),_display_(/*15.18*/inputText(blogForm("tags"), '_label -> "", 'placeholder -> "Tags", 'class -> "form-control")),format.raw/*15.110*/("""
                """),_display_(/*16.18*/select(field = blogForm("Category"), options = categories.map(category => category.getId.toString -> category.getName) )),format.raw/*16.138*/("""

                """),format.raw/*18.17*/("""<div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Create your blog &nbsp</button>
                </div>

            """)))}),format.raw/*22.14*/("""
            """),format.raw/*23.13*/("""</div>

        </div>

    </div>
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(blogForm:Form[Blog],categories:Seq[Category]): play.twirl.api.HtmlFormat.Appendable = apply(blogForm,categories)

  def f:((Form[Blog],Seq[Category]) => play.twirl.api.HtmlFormat.Appendable) = (blogForm,categories) => apply(blogForm,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 03 02:31:21 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/blog/blog_create.scala.html
                  HASH: 08b6ea6714119738d16e9b0a89509411a8cee6d4
                  MATRIX: 977->1|1099->53|1197->50|1225->124|1262->153|1301->155|1339->167|1620->421|1635->427|1706->489|1746->491|1792->510|1923->619|1969->638|2083->730|2129->749|2271->869|2319->889|2518->1057|2560->1071|2631->1112
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|39->7|45->13|45->13|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|50->18|54->22|55->23|60->28
                  -- GENERATED --
              */
          