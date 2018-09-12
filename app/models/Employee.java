package models;



import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

/** Creating Employee table in the Database */
@Entity
public class Employee extends Model{
    @Id
    private Long empID;
    @Constraints.Required
    private String empName;
    @Constraints.Required
    private String  address;
    @Constraints.Required
    private String  department;

    @ManyToOne
    private Category category; /** Creating link between Category and Employee */
    
    

    public Employee() {
    }

    public Employee(Long empID, String empName, String address, String department,Category category) {
        this.empID = empID;
        this.empName = empName;
        this.address = address;
        this.department = department;
        this.category=category;
       
    }

    

    public Long getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }


    
    public void setEmpID(Long empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
    

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Category getCategory(){
        return category;
    }
    public void setCategory(Category category){
        this.category=category;
    }



    public static final Finder<Long, Employee> find = new Finder<>(Employee.class); /** Required for picking out individual employees from table */
    
         public static final List<Employee>findAll(){
             return Employee.find.all();
         }








    
    
    
}