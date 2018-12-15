
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

object comment_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Comment],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(commentForm: Form[Comment],id: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper.inputText, helper.textarea, helper.select, helper.CSRF


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*3.2*/base(title = "Update your comment")/*3.37*/{_display_(Seq[Any](format.raw/*3.38*/("""

    """),format.raw/*5.5*/("""<div class = "container-field">
        <div class="text-center"><h1><strong>Update your comment!</strong></h1></div>
        <br><br>
        <div class = "row">

            <div class = "col-md-4 col-md-offset-4">
            """),_display_(/*11.14*/helper/*11.20*/.form(action = helper.CSRF(routes.CommentController.comment_update_post(id)))/*11.97*/ {_display_(Seq[Any](format.raw/*11.99*/("""
                """),_display_(/*12.18*/inputText(commentForm("text"), '_label -> "",'class -> "form-control")),format.raw/*12.88*/("""

                """),format.raw/*14.17*/("""<div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Update comment &nbsp</button>
                </div>

            """)))}),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""</div>

        </div>

    </div>
""")))}))
      }
    }
  }

  def render(commentForm:Form[Comment],id:Int): play.twirl.api.HtmlFormat.Appendable = apply(commentForm,id)

  def f:((Form[Comment],Int) => play.twirl.api.HtmlFormat.Appendable) = (commentForm,id) => apply(commentForm,id)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 15 22:04:13 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/blog/comment_update.scala.html
                  HASH: 5dda6438cc3afe821ecdb4ab90b700f0d517f238
                  MATRIX: 973->1|1082->40|1180->37|1208->111|1251->146|1289->147|1323->155|1586->391|1601->397|1687->474|1727->476|1773->495|1864->565|1912->585|2109->751|2151->765
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|37->5|43->11|43->11|43->11|43->11|44->12|44->12|46->14|50->18|51->19
                  -- GENERATED --
              */
          