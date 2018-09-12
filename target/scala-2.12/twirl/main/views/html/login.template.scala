
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login",user)/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
    """),format.raw/*5.5*/("""<div class="row">
    <div class="col-sm-8">
  <div class="col-sm-4">

    """),_display_(/*9.6*/if(loginForm.hasGlobalErrors)/*9.35*/{_display_(Seq[Any](format.raw/*9.36*/("""
        """),format.raw/*10.9*/("""<p class="alert alert-warning">
            """),_display_(/*11.14*/loginForm/*11.23*/.globalError.message),format.raw/*11.43*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""
    """),_display_(/*14.6*/if(flash.containsKey("error"))/*14.36*/{_display_(Seq[Any](format.raw/*14.37*/("""
       """),format.raw/*15.8*/("""<p class="alert alert-warning">
           """),_display_(/*16.13*/flash/*16.18*/.get("Login Required.")),format.raw/*16.41*/("""
       """),format.raw/*17.8*/("""</p>
    """)))}),format.raw/*18.6*/("""

    """),_display_(/*20.6*/helper/*20.12*/.form(CSRF(controllers.routes.LoginController.loginSubmit()))/*20.73*/{_display_(Seq[Any](format.raw/*20.74*/("""


        
"""),format.raw/*24.1*/("""<div class="form-group">
    <input type="text" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*25.95*/loginForm("email")/*25.113*/.value),format.raw/*25.119*/("""">
</div>
<div class="form-group">
    <input type="password" name="password" class="form-control input-xs" placeholder="Password">
</div>
<div class="form-group">
    <input type="submit" value="Sign In" class="btn btn-primary">
</div>
    """)))}),format.raw/*33.6*/("""
"""),format.raw/*34.1*/("""</div>
</div>
</div>



    """)))}),format.raw/*40.6*/("""






















"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 22:04:10 GMT 2018
                  SOURCE: /home/wdd/Downloads/Java Ca 1/app/views/login.scala.html
                  HASH: 3b9b92c91b182c725cc5a15a6eef0a4dce9a4b9c
                  MATRIX: 984->1|1118->64|1163->62|1190->80|1217->82|1243->100|1281->101|1312->106|1413->182|1450->211|1488->212|1524->221|1596->266|1614->275|1655->295|1691->304|1731->314|1763->320|1802->350|1841->351|1876->359|1947->403|1961->408|2005->431|2040->439|2080->449|2113->456|2128->462|2198->523|2237->524|2276->536|2422->655|2450->673|2478->679|2750->921|2778->922|2837->951
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|52->20|52->20|52->20|52->20|56->24|57->25|57->25|57->25|65->33|66->34|72->40
                  -- GENERATED --
              */
          