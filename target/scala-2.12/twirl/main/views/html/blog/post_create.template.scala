
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
/*2.2*/import helper.inputText, helper.textarea, helper.select, helper.CSRF, helper.inputFile


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*3.2*/base(title = "Create a post")/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""

    """),format.raw/*5.5*/("""<div class = "container-field">
        <div class="text-center"><h1><strong>Create a post!</strong></h1></div>
        <br><br>
        <div class = "row">

            <div class = "col-md-4 col-md-offset-4">
            """),_display_(/*11.14*/helper/*11.20*/.form(action = helper.CSRF(routes.BlogPostController.blogpost_create_post(id)),'enctype -> "multipart/form-data")/*11.133*/ {_display_(Seq[Any](format.raw/*11.135*/("""
                """),_display_(/*12.18*/inputText(postForm("post_title"), '_label -> "", 'placeholder -> "Your post title", 'class -> "form-control")),format.raw/*12.127*/("""
                """),_display_(/*13.18*/textarea(postForm("post_text"),args = 'rows -> 7, '_label -> "", 'placeholder -> "Post content", 'class -> "form-control")),format.raw/*13.140*/("""
                """),format.raw/*14.17*/("""<br>
                <input type="file" name="picture">
                """),_display_(/*16.18*/inputText(postForm("tags"), '_label -> "", 'placeholder -> "Tags", 'class -> "form-control")),format.raw/*16.110*/("""


                """),format.raw/*19.17*/("""<div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Create your post &nbsp</button>
                </div>

            """)))}),format.raw/*23.14*/("""
            """),format.raw/*24.13*/("""</div>

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
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/blog/post_create.scala.html
                  HASH: 41c2c6aaea30e189abbfcd0fa89c12fc4f0b9691
                  MATRIX: 971->1|1080->40|1196->37|1224->129|1261->158|1299->159|1333->167|1590->397|1605->403|1728->516|1769->518|1815->537|1946->646|1992->665|2136->787|2182->805|2284->880|2398->972|2448->994|2647->1162|2689->1176
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|43->11|44->12|44->12|45->13|45->13|46->14|48->16|48->16|51->19|55->23|56->24
                  -- GENERATED --
              */
          