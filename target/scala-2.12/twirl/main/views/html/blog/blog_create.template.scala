
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
            """),_display_(/*11.14*/helper/*11.20*/.form(action = helper.CSRF(routes.BlogController.save_Blog()))/*11.82*/ {_display_(Seq[Any](format.raw/*11.84*/("""
                """),_display_(/*12.18*/inputText(blogForm("blog_title"), '_label -> "", 'placeholder -> "Your blog title", 'class -> "form-control")),format.raw/*12.127*/("""
                """),_display_(/*13.18*/inputText(blogForm("tags"), '_label -> "", 'placeholder -> "Tags", 'class -> "form-control")),format.raw/*13.110*/("""
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
                  DATE: Thu Dec 06 01:01:24 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/blog/blog_create.scala.html
                  HASH: fcdbeebdb21e876e9b5ecf1098a620ab19a9425d
                  MATRIX: 977->1|1099->53|1197->50|1225->124|1262->153|1300->154|1334->162|1615->416|1630->422|1701->484|1741->486|1787->505|1918->614|1964->633|2078->725|2124->744|2266->864|2314->884|2513->1052|2555->1066
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|48->16|52->20|53->21
                  -- GENERATED --
              */
          