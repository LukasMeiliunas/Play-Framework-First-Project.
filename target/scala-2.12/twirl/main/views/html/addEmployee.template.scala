
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

object addEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employeeForm : Form[models.Employee],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Employee", user)/*4.24*/{_display_(Seq[Any](format.raw/*4.25*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new Employee</p>

"""),_display_(/*7.2*/form(routes.HomeController.addEmployeeSubmit(), 'class -> "form-horizontal", 'role -> "form")/*7.95*/{_display_(Seq[Any](format.raw/*7.96*/("""

"""),_display_(/*9.2*/CSRF/*9.6*/.formField),format.raw/*9.16*/("""


"""),_display_(/*12.2*/inputText(employeeForm("empName"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.81*/("""
"""),_display_(/*13.2*/inputText(employeeForm("address"), '_label -> "Address", 'class -> "form-control")),format.raw/*13.84*/("""
"""),_display_(/*14.2*/inputText(employeeForm("department"), '_label -> "Project", 'class -> "form-control")),format.raw/*14.87*/("""                 

"""),_display_(/*16.2*/select(

employeeForm("category.id"),options(Category.options),'_label ->"Department",'_default -> "--Choose department please--",
'_showConstraints -> false, 'class-> "form-control"


)),format.raw/*22.2*/("""















"""),_display_(/*38.2*/inputText(employeeForm("empID"), '_label -> "", 'hidden -> "hidden")),format.raw/*38.70*/("""


"""),format.raw/*41.1*/("""<div class="actions">
<input type="submit" value = "Press To Add Employee" class="btn btn-primary">
<a href =""""),_display_(/*43.12*/routes/*43.18*/.HomeController.employee(0)),format.raw/*43.45*/("""">
    <button type="button" class="btn btn-warning">Cancel</button>
</a>




</div>

""")))}),format.raw/*52.2*/("""


""")))}),format.raw/*55.2*/("""


"""))
      }
    }
  }

  def render(employeeForm:Form[models.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm,user)

  def f:((Form[models.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm,user) => apply(employeeForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 22:04:10 GMT 2018
                  SOURCE: /home/wdd/Downloads/Java Ca 1/app/views/addEmployee.scala.html
                  HASH: 42a91cb255b08584b188fa2906b6600134e6e160
                  MATRIX: 987->1|1122->65|1167->63|1194->81|1221->83|1251->105|1289->106|1320->111|1386->152|1487->245|1525->246|1553->249|1564->253|1594->263|1624->267|1724->346|1752->348|1855->430|1883->432|1989->517|2035->537|2241->723|2284->740|2373->808|2403->811|2541->922|2556->928|2604->955|2721->1042|2755->1046
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|39->7|39->7|41->9|41->9|41->9|44->12|44->12|45->13|45->13|46->14|46->14|48->16|54->22|70->38|70->38|73->41|75->43|75->43|75->43|84->52|87->55
                  -- GENERATED --
              */
          