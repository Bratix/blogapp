
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

object post_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[BlogPost],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(postForm : Form[BlogPost],id: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper.inputText, helper.textarea, helper.select, helper.CSRF


Seq[Any](format.raw/*1.37*/("""
"""),_display_(/*3.2*/base(title = "Update your post")/*3.34*/{_display_(Seq[Any](format.raw/*3.35*/("""

    """),format.raw/*5.5*/("""<div class = "container-field">
        <div class="text-center"><h1><strong>Update your post!</strong></h1></div>
        <br><br>
        <div class = "row">

            <div class = "col-md-4 col-md-offset-4">
            """),_display_(/*11.14*/helper/*11.20*/.form(action = helper.CSRF(routes.BlogPostController.save_blogpost_update(id)))/*11.99*/ {_display_(Seq[Any](format.raw/*11.101*/("""
                """),_display_(/*12.18*/inputText(postForm("post_title"), '_label -> "", 'placeholder -> "Your post title", 'class -> "form-control")),format.raw/*12.127*/("""
                """),_display_(/*13.18*/inputText(postForm("post_text"), '_label -> "", 'placeholder -> "Post content", 'class -> "form-control")),format.raw/*13.123*/("""
                """),_display_(/*14.18*/inputText(postForm("tags"), '_label -> "", 'placeholder -> "Tags", 'class -> "form-control")),format.raw/*14.110*/("""
                
                """),format.raw/*16.17*/("""<div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Update post &nbsp</button>
                </div>

            """)))}),format.raw/*20.14*/("""
            """),format.raw/*21.13*/("""</div>

        </div>

    </div>
""")))}))
      }
    }
  }

  def render(postForm:Form[BlogPost],id:Int): play.twirl.api.HtmlFormat.Appendable = apply(postForm,id)

  def f:((Form[BlogPost],Int) => play.twirl.api.HtmlFormat.Appendable) = (postForm,id) => apply(postForm,id)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 11 00:35:25 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/blog/post_update.scala.html
                  HASH: 29d80d1cc2d9a81c82ba6a2a599dcb6ad6505652
                  MATRIX: 971->1|1079->39|1177->36|1205->110|1245->142|1283->143|1317->151|1577->384|1592->390|1680->469|1721->471|1767->490|1898->599|1944->618|2071->723|2117->742|2231->834|2295->870|2489->1033|2531->1047
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|48->16|52->20|53->21
                  -- GENERATED --
              */
          