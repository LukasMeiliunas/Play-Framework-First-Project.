
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>ProjMan2018 """),_display_(/*11.21*/title),format.raw/*11.26*/("""</title>

<!-- Bootstrap Core CSS -->

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS --> <link href=""""),_display_(/*17.34*/routes/*17.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.81*/("""" rel="stylesheet" />
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>

<body>


<nav class="navbar navbar-default">
<div class="container-fluid">

<div class="navbar-header">
<a class ="navbar-brand">CompanyManager2018</a>
</div>

<ul class="nav navbar-nav navbar-right">
<li><a href=""""),_display_(/*32.15*/routes/*32.21*/.HomeController.employee()),format.raw/*32.47*/("""">Employee Management</a></li>



<li>
    """),_display_(/*37.6*/if(user !=null)/*37.21*/{_display_(Seq[Any](format.raw/*37.22*/("""
        """),format.raw/*38.9*/("""<a href=""""),_display_(/*38.19*/routes/*38.25*/.LoginController.logout()),format.raw/*38.50*/("""">Logout """),_display_(/*38.60*/user/*38.64*/.getName()),format.raw/*38.74*/("""</a>
    """)))}/*39.6*/else/*39.10*/{_display_(Seq[Any](format.raw/*39.11*/("""
        """),format.raw/*40.9*/("""<a href= """"),_display_(/*40.20*/routes/*40.26*/.LoginController.login()),format.raw/*40.50*/(""""><span class="glyphicon glyphicon-log-in"></span>Login</a>
    
    """)))}),format.raw/*42.6*/("""
    """),format.raw/*43.5*/("""</li>
   
</ul>
</ul>


</div>

</nav>

<container>



"""),_display_(/*57.2*/content),format.raw/*57.9*/("""



"""),format.raw/*61.1*/("""</container>


</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 22:04:10 GMT 2018
                  SOURCE: /home/wdd/Downloads/Java Ca 1/app/views/main.scala.html
                  HASH: 7cd1ccf2c743599b86b0f815c01c01a24d2aa38a
                  MATRIX: 970->1|1120->56|1148->58|1262->145|1288->150|1487->322|1502->328|1564->369|1900->678|1915->684|1962->710|2032->754|2056->769|2095->770|2131->779|2168->789|2183->795|2229->820|2266->830|2279->834|2310->844|2338->854|2351->858|2390->859|2426->868|2464->879|2479->885|2524->909|2624->979|2656->984|2738->1040|2765->1047|2796->1051
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|64->32|64->32|64->32|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|72->40|74->42|75->43|89->57|89->57|93->61
                  -- GENERATED --
              */
          