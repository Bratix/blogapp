
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

object blog_update extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Blog,Form[Blog],List[Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(blog : Blog, blogForm : Form[Blog],categories : List[Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.66*/("""
"""),_display_(/*3.2*/base(title = "Blog Update")/*3.29*/{_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<div class = "container-field">
        <div class="text-center"><h1><strong>Update your blog</strong></h1></div>
        <br><br>
        <div class = "row">

            <div class = "col-md-4 col-md-offset-4">
            """),_display_(/*10.14*/helper/*10.20*/.form(action = helper.CSRF(routes.BlogController.blog_update_post(blog.getId)),'enctype -> "multipart/form-data")/*10.133*/ {_display_(Seq[Any](format.raw/*10.135*/("""
                """),_display_(/*11.18*/inputText(blogForm("blog_title"), '_label -> "", 'placeholder -> "Your blog title", 'class -> "form-control")),format.raw/*11.127*/("""
                """),format.raw/*12.17*/("""<input type="file" name="picture">
                <strong>Blog category:</strong> <br>
                <select id="Category" name="Category">
                    """),_display_(/*15.22*/for(category <- categories) yield /*15.49*/{_display_(Seq[Any](format.raw/*15.50*/("""
                        """),_display_(/*16.26*/if(blog.getCategory.getName != category.getName)/*16.74*/ {_display_(Seq[Any](format.raw/*16.76*/("""
                            """),format.raw/*17.29*/("""<option value="""),_display_(/*17.44*/category/*17.52*/.getId),format.raw/*17.58*/(""" """),format.raw/*17.59*/(""">"""),_display_(/*17.61*/category/*17.69*/.getName),format.raw/*17.77*/("""</option>
                        """)))}/*18.26*/else/*18.31*/{_display_(Seq[Any](format.raw/*18.32*/("""
                            """),format.raw/*19.29*/("""<option value="""),_display_(/*19.44*/category/*19.52*/.getId),format.raw/*19.58*/(""" """),format.raw/*19.59*/("""selected>"""),_display_(/*19.69*/category/*19.77*/.getName),format.raw/*19.85*/(""" """),format.raw/*19.86*/("""</option>
                        """)))}),format.raw/*20.26*/("""
                    """)))}),format.raw/*21.22*/("""
                """),format.raw/*22.17*/("""</select>
                <br><br>
                <div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Create your blog &nbsp</button>
                </div>

            """)))}),format.raw/*28.14*/("""
            """),format.raw/*29.13*/("""</div>

        </div>

    </div>
""")))}))
      }
    }
  }

  def render(blog:Blog,blogForm:Form[Blog],categories:List[Category]): play.twirl.api.HtmlFormat.Appendable = apply(blog,blogForm,categories)

  def f:((Blog,Form[Blog],List[Category]) => play.twirl.api.HtmlFormat.Appendable) = (blog,blogForm,categories) => apply(blog,blogForm,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 16 18:27:05 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/blog/blog_update.scala.html
                  HASH: 6c267d0defc02fad504a16316aeb8f1a6b288849
                  MATRIX: 983->1|1120->68|1165->65|1193->86|1228->113|1266->114|1298->120|1557->352|1572->358|1695->471|1736->473|1782->492|1913->601|1959->619|2153->786|2196->813|2235->814|2289->841|2346->889|2386->891|2444->921|2486->936|2503->944|2530->950|2559->951|2588->953|2605->961|2634->969|2689->1005|2702->1010|2741->1011|2799->1041|2841->1056|2858->1064|2885->1070|2914->1071|2951->1081|2968->1089|2997->1097|3026->1098|3093->1134|3147->1157|3193->1175|3445->1396|3487->1410
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|42->10|42->10|42->10|42->10|43->11|43->11|44->12|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|53->21|54->22|60->28|61->29
                  -- GENERATED --
              */
          