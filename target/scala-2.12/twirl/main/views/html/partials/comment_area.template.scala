
package views.html.partials

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
/*1.2*/import helper.textarea

object comment_area extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Set[Comment],Form[Comment],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(comments: Set[Comment], commentForm: Form[Comment], id: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.63*/("""
"""),format.raw/*3.1*/("""<h2>Comments</h2>
<br>
    <!-- Comment list  -->
<ul class="comment-list" style="list-style-type:none">
    """),_display_(/*7.6*/for(comment <- comments) yield /*7.30*/ {_display_(Seq[Any](format.raw/*7.32*/("""
        """),format.raw/*8.9*/("""<li>
            <div class="comment-content col-md-7">
                <p><span class="comment-date">"""),_display_(/*10.48*/comment/*10.55*/.getCreation_date.getDayOfMonth),format.raw/*10.86*/("""/"""),_display_(/*10.88*/comment/*10.95*/.getCreation_date.getMonthOfYear),format.raw/*10.127*/("""/"""),_display_(/*10.129*/comment/*10.136*/.getCreation_date.getYear),format.raw/*10.161*/(""" """),format.raw/*10.162*/("""at """),_display_(/*10.166*/comment/*10.173*/.getCreation_date.getHourOfDay),format.raw/*10.203*/(""":"""),_display_(/*10.205*/comment/*10.212*/.getCreation_date.getMinuteOfHour),format.raw/*10.245*/(""" """),format.raw/*10.246*/("""</span></p>
                <h4><strong>"""),_display_(/*11.30*/comment/*11.37*/.getUser.getName),format.raw/*11.53*/("""</strong></h4>
                <p id="comtext">"""),_display_(/*12.34*/comment/*12.41*/.getText),format.raw/*12.49*/("""</p>

                """),_display_(/*14.18*/if(comment.getUser.getName == session.get("name"))/*14.68*/{_display_(Seq[Any](format.raw/*14.69*/("""
                """),format.raw/*15.17*/("""<div class="container-fluid comment-buttons padding-bottom-10">
                    <div class="row">
                        """),_display_(/*17.26*/helper/*17.32*/.form(action = helper.CSRF(routes.CommentController.comment_update_get(comment.getId)))/*17.119*/{_display_(Seq[Any](format.raw/*17.120*/("""
                        """),format.raw/*18.25*/("""<button type="submit" class="btn-link">Edit</button>
                        """)))}),format.raw/*19.26*/("""
                        """),_display_(/*20.26*/helper/*20.32*/.form(action = helper.CSRF(routes.CommentController.comment_delete(comment.getId)))/*20.115*/{_display_(Seq[Any](format.raw/*20.116*/("""
                            """),format.raw/*21.29*/("""<button type="submit" class="btn-link">Delete</button>
                        """)))}),format.raw/*22.26*/("""
                    """),format.raw/*23.21*/("""</div>
                </div>
                """)))}),format.raw/*25.18*/("""
            """),format.raw/*26.13*/("""</div>
        </li>
    """)))}),format.raw/*28.6*/("""
"""),format.raw/*29.1*/("""</ul>

    <!-- New comment form -->
<form action=""""),_display_(/*32.16*/helper/*32.22*/.CSRF(routes.CommentController.comment_create_post(id))),format.raw/*32.77*/("""" method="post" class="comment-form">

    <div class="text-center">
        """),_display_(/*35.10*/helper/*35.16*/.textarea(commentForm("text"), '_label -> "", 'placeholder -> "Enter your comment here", 'class -> "form-control")),format.raw/*35.130*/("""
        """),format.raw/*36.9*/("""<button type="submit" class="btn btn-link" id="comment-post">Post Comment</button>
    </div>
</form>

"""))
      }
    }
  }

  def render(comments:Set[Comment],commentForm:Form[Comment],id:Int): play.twirl.api.HtmlFormat.Appendable = apply(comments,commentForm,id)

  def f:((Set[Comment],Form[Comment],Int) => play.twirl.api.HtmlFormat.Appendable) = (comments,commentForm,id) => apply(comments,commentForm,id)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 17 01:16:55 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay_ss/blogapp/app/views/partials/comment_area.scala.html
                  HASH: 2c8b849332e8f30000bf588482969412aaf5ddb9
                  MATRIX: 660->1|1018->26|1174->87|1202->89|1341->203|1380->227|1419->229|1455->239|1587->344|1603->351|1655->382|1684->384|1700->391|1754->423|1784->425|1801->432|1848->457|1878->458|1910->462|1927->469|1979->499|2009->501|2026->508|2081->541|2111->542|2180->584|2196->591|2233->607|2309->656|2325->663|2354->671|2406->696|2465->746|2504->747|2550->765|2706->894|2721->900|2818->987|2858->988|2912->1014|3022->1093|3076->1120|3091->1126|3184->1209|3224->1210|3282->1240|3394->1321|3444->1343|3524->1392|3566->1406|3624->1434|3653->1436|3735->1491|3750->1497|3826->1552|3934->1633|3949->1639|4085->1753|4122->1763
                  LINES: 24->1|29->2|34->2|35->3|39->7|39->7|39->7|40->8|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|46->14|46->14|47->15|49->17|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|52->20|53->21|54->22|55->23|57->25|58->26|60->28|61->29|64->32|64->32|64->32|67->35|67->35|67->35|68->36
                  -- GENERATED --
              */
          