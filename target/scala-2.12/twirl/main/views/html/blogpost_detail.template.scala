
package views.html

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
/*1.2*/import partials.post_content, partials.blogpost_actionbuttons

object blogpost_detail extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[BlogPost,Form[Comment],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(post : BlogPost, commentForm : Form[Comment], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.60*/("""
"""),_display_(/*3.2*/base(title = "Post")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <section class="col-md-7 col-md-offset-1">
            <div class="post-thumb pl-25">
                """),_display_(/*7.18*/post_content(post,commentForm, user)),format.raw/*7.54*/("""
            """),format.raw/*8.13*/("""</div>

        </section>

        <section class="col-md-offset-1 col-md-2">

            <h1 class="section-title text-center">About me</h1>

            <div class="post-thumb text-center">
                <h3>"""),_display_(/*17.22*/post/*17.26*/.getUser.getName),format.raw/*17.42*/("""</h3>
            </div>
            """),_display_(/*19.14*/if(session().get("name")== post.getUser.getName)/*19.62*/ {_display_(Seq[Any](format.raw/*19.64*/("""
                """),_display_(/*20.18*/blogpost_actionbuttons(post)),format.raw/*20.46*/("""
            """)))}),format.raw/*21.14*/("""


        """),format.raw/*24.9*/("""</section>
    </div>
""")))}))
      }
    }
  }

  def render(post:BlogPost,commentForm:Form[Comment],user:User): play.twirl.api.HtmlFormat.Appendable = apply(post,commentForm,user)

  def f:((BlogPost,Form[Comment],User) => play.twirl.api.HtmlFormat.Appendable) = (post,commentForm,user) => apply(post,commentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/blogpost_detail.scala.html
                  HASH: a9b120d6db15f852ccb5f4a38cab74ca640ec6a8
                  MATRIX: 651->1|1048->65|1201->123|1229->126|1257->146|1295->147|1327->153|1485->285|1541->321|1582->335|1833->559|1846->563|1883->579|1950->619|2007->667|2047->669|2093->688|2142->716|2188->731|2229->745
                  LINES: 24->1|29->2|34->2|35->3|35->3|35->3|36->4|39->7|39->7|40->8|49->17|49->17|49->17|51->19|51->19|51->19|52->20|52->20|53->21|56->24
                  -- GENERATED --
              */
          