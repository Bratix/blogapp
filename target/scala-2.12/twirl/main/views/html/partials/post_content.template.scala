
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

object post_content extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[BlogPost,Form[Comment],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(post: BlogPost, commentForm : Form[Comment], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import partials.comment_area


Seq[Any](format.raw/*1.59*/("""
"""),format.raw/*3.30*/("""
    """),format.raw/*4.51*/("""
"""),format.raw/*5.11*/("""
"""),format.raw/*6.1*/("""<br><br>
<div class="text-right ">

"""),_display_(/*9.2*/if(post.getUsers.contains(user))/*9.34*/{_display_(Seq[Any](format.raw/*9.35*/("""
    """),format.raw/*10.5*/("""<a href = """"),_display_(/*10.17*/routes/*10.23*/.HomeController.likes(post.getId)),format.raw/*10.56*/("""" class="like_button btn btn-primary mr-50 pt-30"><i class="glyphicon glyphicon-heart liked" ></i><span id = "like-counter">&nbsp;"""),_display_(/*10.187*/post/*10.191*/.getUsers.size()),format.raw/*10.207*/("""</span></a>
""")))}/*11.2*/else/*11.6*/{_display_(Seq[Any](format.raw/*11.7*/("""
    """),format.raw/*12.5*/("""<a href = """"),_display_(/*12.17*/routes/*12.23*/.HomeController.likes(post.getId)),format.raw/*12.56*/("""" class="like_button btn btn-primary mr-50 pt-30"><i class="glyphicon glyphicon-heart-empty liked" ></i><span id = "like-counter">&nbsp;"""),_display_(/*12.193*/post/*12.197*/.getUsers.size()),format.raw/*12.213*/("""</span></a>
""")))}),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""</div>

<h5 class="grey-text"> by """),_display_(/*17.28*/post/*17.32*/.getUser.getName),format.raw/*17.48*/("""</h5>

<h5 class="grey-text">"""),_display_(/*19.24*/post/*19.28*/.getCreation_date.getDayOfMonth),format.raw/*19.59*/("""/"""),_display_(/*19.61*/post/*19.65*/.getCreation_date.getMonthOfYear),format.raw/*19.97*/("""/"""),_display_(/*19.99*/post/*19.103*/.getCreation_date.getYear),format.raw/*19.128*/(""" """),format.raw/*19.129*/("""at """),_display_(/*19.133*/post/*19.137*/.getCreation_date.getHourOfDay),format.raw/*19.167*/(""":"""),_display_(/*19.169*/post/*19.173*/.getCreation_date.getMinuteOfHour),format.raw/*19.206*/(""" """),format.raw/*19.207*/("""</h5>

<a href="#" class="thumb-link">
    <h3>"""),_display_(/*22.10*/post/*22.14*/.getPost_title),format.raw/*22.28*/(""" """),format.raw/*22.29*/("""</h3>
</a>

<p class="padding-bottom-20">&nbsp;"""),_display_(/*25.37*/post/*25.41*/.getPost_text),format.raw/*25.54*/("""</p>

<div class="tags-area">
"""),_display_(/*28.2*/for(tag <- post.getTags.split(",") ) yield /*28.38*/ {_display_(Seq[Any](format.raw/*28.40*/("""
    """),format.raw/*29.5*/("""<a href="#" class="btn-link">"""),_display_(/*29.35*/tag),format.raw/*29.38*/("""</a>
""")))}),format.raw/*30.2*/("""
"""),format.raw/*31.1*/("""</div>

<div class="padding-left-100">
"""),_display_(/*34.2*/comment_area(post.getComments, commentForm, post.getId)),format.raw/*34.57*/("""
"""),format.raw/*35.1*/("""</div>"""))
      }
    }
  }

  def render(post:BlogPost,commentForm:Form[Comment],user:User): play.twirl.api.HtmlFormat.Appendable = apply(post,commentForm,user)

  def f:((BlogPost,Form[Comment],User) => play.twirl.api.HtmlFormat.Appendable) = (post,commentForm,user) => apply(post,commentForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 09 16:51:44 CET 2018
                  SOURCE: C:/Users/Amar/Desktop/javaplay/blogapp/app/views/partials/post_content.scala.html
                  HASH: 9a22ddcaa0be9ea572416b8d9f881ce3a6ea2888
                  MATRIX: 985->1|1115->61|1173->58|1202->120|1235->172|1264->184|1292->186|1357->226|1397->258|1435->259|1468->265|1507->277|1522->283|1576->316|1735->447|1749->451|1787->467|1819->481|1831->485|1869->486|1902->492|1941->504|1956->510|2010->543|2175->680|2189->684|2227->700|2271->714|2302->718|2366->755|2379->759|2416->775|2475->807|2488->811|2540->842|2569->844|2582->848|2635->880|2664->882|2678->886|2725->911|2755->912|2787->916|2801->920|2853->950|2883->952|2897->956|2952->989|2982->990|3060->1041|3073->1045|3108->1059|3137->1060|3215->1111|3228->1115|3262->1128|3322->1162|3374->1198|3414->1200|3447->1206|3504->1236|3528->1239|3565->1246|3594->1248|3663->1291|3739->1346|3768->1348
                  LINES: 28->1|31->2|34->1|35->3|36->4|37->5|38->6|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|44->12|45->13|47->15|49->17|49->17|49->17|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|54->22|54->22|54->22|54->22|57->25|57->25|57->25|60->28|60->28|60->28|61->29|61->29|61->29|62->30|63->31|66->34|66->34|67->35
                  -- GENERATED --
              */
          