
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

object employee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Employee],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: List[models.Employee], categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""



"""),_display_(/*5.2*/main("Employees",user)/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""

    """),format.raw/*7.5*/("""<div class="row">
        <div class="col-sm-2">
            <div class="list-group list-group-flush">
                <a href=""""),_display_(/*10.27*/routes/*10.33*/.HomeController.employee(0)),format.raw/*10.60*/("""" class="list-group-item">All Departments</a>

           """),_display_(/*12.13*/for(c<-categories) yield /*12.31*/{_display_(Seq[Any](format.raw/*12.32*/("""

            """),format.raw/*14.13*/("""<a href=""""),_display_(/*14.23*/routes/*14.29*/.HomeController.employee(c.getID)),format.raw/*14.62*/("""" class="list-group-item">"""),_display_(/*14.89*/c/*14.90*/.getName),format.raw/*14.98*/("""
            
                """),format.raw/*16.17*/("""<span class="badge badge-primary badge-pill">"""),_display_(/*16.63*/c/*16.64*/.getEmployees.size()),format.raw/*16.84*/("""</span>
            </a>
           """)))}),format.raw/*18.13*/("""

        """),format.raw/*20.9*/("""</div>
    </div>
    

</div>

    
        
    <div class="col-sm-10">
    <div class="well">
<table class="table ">
    <thead>
    <tr>
    
    <th>EmpID</th>
    
    <th>Employee Name</th>
    
    <th>Address</th>
    

    <th>Department</th>
    
    
    </tr>
    
    </thead>
    
    <tbody>
    
    
    """),_display_(/*51.6*/for(e<-employee) yield /*51.22*/{_display_(Seq[Any](format.raw/*51.23*/("""
    """),format.raw/*52.5*/("""<tr>
    
    <td>"""),_display_(/*54.10*/e/*54.11*/.getEmpID),format.raw/*54.20*/("""</td>
    
    <td>"""),_display_(/*56.10*/e/*56.11*/.getEmpName),format.raw/*56.22*/("""</td>
    
    <td>"""),_display_(/*58.10*/e/*58.11*/.getAddress),format.raw/*58.22*/("""</td>

    <td>"""),_display_(/*60.10*/e/*60.11*/.getCategory.getName),format.raw/*60.31*/("""</td>
     
        <td>
            <a href=""""),_display_(/*63.23*/routes/*63.29*/.HomeController.updateEmployee(e.getEmpID)),format.raw/*63.71*/("""" class="button-xs btn-primary">
                <span class="glyphicon glyphicon-pencil"></span>
            </a>
           </td>

        <td>
         <a href=""""),_display_(/*69.20*/routes/*69.26*/.HomeController.deleteEmployee(e.getEmpID)),format.raw/*69.68*/("""" class="button-xs btn-primary">
             <span class="glyphicon glyphicon-remove-circle"></span>
         </a>
        </td>
    </tr>


""")))}),format.raw/*76.2*/("""
    """),format.raw/*77.5*/("""</tbody>
    
    </table> 

    <div class="btn-toolbar">
            <a href=""""),_display_(/*82.23*/routes/*82.29*/.HomeController.addEmployee()),format.raw/*82.58*/("""">
                    <button class="btn btn-primary">Add new Employee</button>
                  </a>  
            </div>
</div>
    </div>

   



""")))}))
      }
    }
  }

  def render(employee:List[models.Employee],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employee,categories,user)

  def f:((List[models.Employee],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employee,categories,user) => apply(employee,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 11 22:04:10 GMT 2018
                  SOURCE: /home/wdd/Downloads/Java Ca 1/app/views/employee.scala.html
                  HASH: f8963d2db41c2c11548f6312cee313d3178dad73
                  MATRIX: 1006->1|1194->94|1224->99|1254->121|1293->123|1325->129|1481->258|1496->264|1544->291|1630->350|1664->368|1703->369|1745->383|1782->393|1797->399|1851->432|1905->459|1915->460|1944->468|2002->498|2075->544|2085->545|2126->565|2194->602|2231->612|2580->935|2612->951|2651->952|2683->957|2729->976|2739->977|2769->986|2816->1006|2826->1007|2858->1018|2905->1038|2915->1039|2947->1050|2990->1066|3000->1067|3041->1087|3115->1134|3130->1140|3193->1182|3385->1347|3400->1353|3463->1395|3636->1538|3668->1543|3776->1624|3791->1630|3841->1659
                  LINES: 28->1|33->1|37->5|37->5|37->5|39->7|42->10|42->10|42->10|44->12|44->12|44->12|46->14|46->14|46->14|46->14|46->14|46->14|46->14|48->16|48->16|48->16|48->16|50->18|52->20|83->51|83->51|83->51|84->52|86->54|86->54|86->54|88->56|88->56|88->56|90->58|90->58|90->58|92->60|92->60|92->60|95->63|95->63|95->63|101->69|101->69|101->69|108->76|109->77|114->82|114->82|114->82
                  -- GENERATED --
              */
          