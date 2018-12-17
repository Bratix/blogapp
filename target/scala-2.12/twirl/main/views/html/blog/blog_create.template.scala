
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
"""),_display_(/*3.2*/base(title = "Create a blog")/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""

    """),format.raw/*5.5*/("""<div class = "container-field">
        <div class="text-center"><h1><strong>Crate your blog and let the fun begin!</strong></h1></div>
        <br><br>
        <div class = "row">

            <div class = "col-md-4 col-md-offset-4">
            """),_display_(/*11.14*/helper/*11.20*/.form(action = helper.CSRF(routes.BlogController.blog_create_post()),'enctype -> "multipart/form-data")/*11.123*/ {_display_(Seq[Any](format.raw/*11.125*/("""
                """),_display_(/*12.18*/inputText(blogForm("blog_title"), '_label -> "", 'placeholder -> "Your blog title", 'class -> "form-control")),format.raw/*12.127*/("""
                """),format.raw/*13.17*/("""<input type="file" name="picture">
                """),_display_(/*14.18*/select(field = blogForm("Category"), options = categories.map(category => category.getId.toString -> category.getName) )),format.raw/*14.138*/("""

                """),format.raw/*16.17*/("""<div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Create your blog &nbsp</button>
                </div>

            """)))}),format.raw/*20.14*/("""
            """),format.raw/*21.13*/("""</div>

        </div>

    </div>
""")))}))
      }
    }
  }

  def render(blogForm:Form[Blog],categories:Seq[Category]): play.twirl.api.HtmlFormat.Appendable = apply(blogForm,categories)

  def f:((Form[Blog],Seq[Category]) => play.twirl.api.HtmlFormat.Appendable) = (blogForm,categories) => apply(blogForm,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/blog/blog_create.scala.html
                  HASH: 668ebb836602fb1023abdf9d89c0ba0e05573f3e
                  MATRIX: 977->1|1099->53|1197->50|1225->124|1262->153|1300->154|1334->162|1615->416|1630->422|1743->525|1784->527|1830->546|1961->655|2007->673|2087->726|2229->846|2277->866|2476->1034|2518->1048
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|43->11|44->12|44->12|45->13|46->14|46->14|48->16|52->20|53->21
                  -- GENERATED --
              */
          