
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
            """),_display_(/*10.14*/helper/*10.20*/.form(action = helper.CSRF(routes.BlogController.update_save(blog.getId)))/*10.94*/ {_display_(Seq[Any](format.raw/*10.96*/("""
                """),_display_(/*11.18*/inputText(blogForm("blog_title"), '_label -> "", 'placeholder -> "Your blog title", 'class -> "form-control")),format.raw/*11.127*/("""
                """),_display_(/*12.18*/inputText(blogForm("tags"), '_label -> "", 'placeholder -> "Tags", 'class -> "form-control")),format.raw/*12.110*/("""

                """),format.raw/*14.17*/("""<strong>Blog category:</strong> <br>
                <select id="Category" name="Category">
                    """),_display_(/*16.22*/for(category <- categories) yield /*16.49*/{_display_(Seq[Any](format.raw/*16.50*/("""
                        """),_display_(/*17.26*/if(blog.getCategory.getName != category.getName)/*17.74*/ {_display_(Seq[Any](format.raw/*17.76*/("""
                            """),format.raw/*18.29*/("""<option value="""),_display_(/*18.44*/category/*18.52*/.getId),format.raw/*18.58*/(""" """),format.raw/*18.59*/(""">"""),_display_(/*18.61*/category/*18.69*/.getName),format.raw/*18.77*/("""</option>
                        """)))}/*19.26*/else/*19.31*/{_display_(Seq[Any](format.raw/*19.32*/("""
                            """),format.raw/*20.29*/("""<option value="""),_display_(/*20.44*/category/*20.52*/.getId),format.raw/*20.58*/(""" """),format.raw/*20.59*/("""selected>"""),_display_(/*20.69*/category/*20.77*/.getName),format.raw/*20.85*/(""" """),format.raw/*20.86*/("""</option>
                        """)))}),format.raw/*21.26*/("""
                    """)))}),format.raw/*22.22*/("""
                """),format.raw/*23.17*/("""</select>
                <br><br>
                <div class="text-center">
                    <button type="submit" class="btn btn-link">&nbsp Create your blog &nbsp</button>
                </div>

            """)))}),format.raw/*29.14*/("""
            """),format.raw/*30.13*/("""</div>

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
                  DATE: Mon Dec 10 17:23:15 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/blog/blog_update.scala.html
                  HASH: f66cd3951487e153915d278b21ae3bfe98792afc
                  MATRIX: 983->1|1120->68|1165->65|1193->86|1228->113|1266->114|1298->120|1557->352|1572->358|1655->432|1695->434|1741->453|1872->562|1918->581|2032->673|2080->693|2222->808|2265->835|2304->836|2358->863|2415->911|2455->913|2513->943|2555->958|2572->966|2599->972|2628->973|2657->975|2674->983|2703->991|2758->1027|2771->1032|2810->1033|2868->1063|2910->1078|2927->1086|2954->1092|2983->1093|3020->1103|3037->1111|3066->1119|3095->1120|3162->1156|3216->1179|3262->1197|3514->1418|3556->1432
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|42->10|42->10|42->10|42->10|43->11|43->11|44->12|44->12|46->14|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|50->18|50->18|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|54->22|55->23|61->29|62->30
                  -- GENERATED --
              */
          