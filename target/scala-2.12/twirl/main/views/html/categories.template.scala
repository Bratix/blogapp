
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

object categories extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(categories: List[Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*2.2*/base(title = "Categories")/*2.28*/{_display_(Seq[Any](format.raw/*2.29*/("""


    """),format.raw/*5.5*/("""<div class="container-fluid">
        <div class="row">

        """),_display_(/*8.10*/for(category <- categories) yield /*8.37*/{_display_(Seq[Any](format.raw/*8.38*/("""
            """),format.raw/*9.13*/("""<div class="container-category col-md-offset-1 col-md-5 ml-30 mb-20">
                <img src=""""),_display_(/*10.28*/routes/*10.34*/.Assets.versioned(category.getPicture)),format.raw/*10.72*/("""" alt="" height="300" width="400">
                <div class="catagory-title">
                    <a href=""""),_display_(/*12.31*/routes/*12.37*/.HomeController.category_blogs(category.getId)),format.raw/*12.83*/("""" class="btn btn-link-category">
                        <h5> """),_display_(/*13.31*/category/*13.39*/.getName),format.raw/*13.47*/(""" """),format.raw/*13.48*/("""</h5>
                    </a>
                </div>
            </div>
        """)))}),format.raw/*17.10*/("""
        """),format.raw/*18.9*/("""</div>

    </div>


""")))}))
      }
    }
  }

  def render(categories:List[Category]): play.twirl.api.HtmlFormat.Appendable = apply(categories)

  def f:((List[Category]) => play.twirl.api.HtmlFormat.Appendable) = (categories) => apply(categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/categories.scala.html
                  HASH: 60b4397a170bce336e130cde217685eae5ce0f7a
                  MATRIX: 961->1|1084->29|1112->32|1146->58|1184->59|1220->69|1315->138|1357->165|1395->166|1436->180|1561->278|1576->284|1635->322|1774->434|1789->440|1856->486|1947->550|1964->558|1993->566|2022->567|2139->653|2176->663
                  LINES: 28->1|33->1|34->2|34->2|34->2|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|44->12|44->12|44->12|45->13|45->13|45->13|45->13|49->17|50->18
                  -- GENERATED --
              */
          