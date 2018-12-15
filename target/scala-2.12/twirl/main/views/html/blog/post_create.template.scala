
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

object post_create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[BlogPost],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(postForm : Form[BlogPost],id : Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper.inputText, helper.textarea, helper.select, helper.CSRF


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*3.2*/base(title = "Create a post")/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""

    """),format.raw/*5.5*/("""<div class = "container-field">
        <div class="text-center"><h1><strong>Create a post!</strong></h1></div>
        <br><br>
        <div class = "row">

            <div class = "col-md-4 col-md-offset-4">
            """),_display_(/*11.14*/helper/*11.20*/.form(action = helper.CSRF(routes.BlogPostController.blogpost_save(id)))/*11.92*/ {_display_(Seq[Any](format.raw/*11.94*/("""
                """),_display_(/*12.18*/inputText(postForm("post_title"), '_label -> "", 'placeholder -> "Your post title", 'class -> "form-control")),format.raw/*12.127*/("""
                """),_display_(/*13.18*/inputText(postForm("post_text"), '_label -> "", 'placeholder -> "Post content", 'class -> "form-control")),format.raw/*13.123*/("""
                """),_display_(/*14.18*/inputText(postForm("tags"), '_label -> "", 'placeholder -> "Tags", 'class -> "form-control")),format.raw/*14.110*/("""


                """),format.raw/*17.17*/("""<div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Create your post &nbsp</button>
                </div>

            """)))}),format.raw/*21.14*/("""
            """),format.raw/*22.13*/("""</div>

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
                  DATE: Mon Dec 10 17:23:15 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/blog/post_create.scala.html
                  HASH: 9a9550c7efcb1a43aef0e13014e6a8a9df8e069b
                  MATRIX: 971->1|1080->40|1178->37|1206->111|1243->140|1281->141|1315->149|1572->379|1587->385|1668->457|1708->459|1754->478|1885->587|1931->606|2058->711|2104->730|2218->822|2268->844|2467->1012|2509->1026
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|43->11|44->12|44->12|45->13|45->13|46->14|46->14|49->17|53->21|54->22
                  -- GENERATED --
              */
          