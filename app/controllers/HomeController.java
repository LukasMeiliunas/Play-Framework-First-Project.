package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;


import models.*;
import views.html.*;
import models.users.*;





/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
 
 
 
public class HomeController extends Controller {

    private FormFactory formFactory; /** Creating forms for DB **/
    
    @Inject
    public HomeController(FormFactory f){
        this.formFactory=f;
    }

   
    /** Method which lists table of employess	**/
public Result employee(Long cat){

 List<Employee> empList=null;
 List<Category> catList=Category.findAll();

   if(cat==0){
   empList=Employee.findAll();
   }else{
       empList=Category.find.ref(cat).getEmployees();
   }
 return ok(views.html.employee.render(empList,catList, User.getUserById(session().get("email"))));
}

/** This method requires Admin Permissions, Admin adds a new employee into the Database. **/
@Security.Authenticated(Secured.class)
@With(AuthAdmin.class)
public Result addEmployee(){
    Form<Employee> employeeForm = formFactory.form(Employee.class);
    return ok(addEmployee.render(employeeForm,User.getUserById(session().get("email"))));
}



public Result addEmployeeSubmit(){

Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();

if(newEmployeeForm.hasErrors()){
    return badRequest(addEmployee.render(newEmployeeForm,User.getUserById(session().get("email"))));
}else{
    Employee newEmployee = newEmployeeForm.get();
   if(newEmployee.getEmpID()==null){
       newEmployee.save();
   }else if(newEmployee.getEmpID()!=null){
       newEmployee.update();
   }
   
   return redirect(controllers.routes.HomeController.employee(0));
}
}

@Security.Authenticated(Secured.class)
@With(AuthAdmin.class)
@Transactional
public Result deleteEmployee(Long empID){
Employee.find.ref(empID).delete();

flash("success","Employee Deleted.");

return redirect(controllers.routes.HomeController.employee(0));
}

@Security.Authenticated(Secured.class)
@With(AuthAdmin.class)
@Transactional
public Result updateEmployee(Long id){
Employee e;
Form<Employee> employeeForm;

try{
    e=Employee.find.byId(id);
    employeeForm=formFactory.form(Employee.class).fill(e);

}catch(Exception eghg){
    return badRequest("ERROR");
}
return ok(addEmployee.render(employeeForm,User.getUserById(session().get("email"))));

}














}







