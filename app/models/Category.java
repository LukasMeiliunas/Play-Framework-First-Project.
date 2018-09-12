package models;

import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

/** Table called category is created in the database. */
@Entity
public class Category extends Model{

@Id
private Long id;
@Constraints.Required
private String name;


@OneToMany
private List<Employee> employees; /** Created a link between Employees and Categories */


public Category(){

}

public Category(Long id, String name, List<Employee>employees){
    this.id=id;
    this.name=name;
    this.employees=employees;
    
}

public Long getID() {
    return id;
}

public String getName() {
    return name;
}

public List getEmployees() {
    return employees;
}



public void setId(Long id) {
    this.id = id;
}

public void setName(String name){
    this.name=name;
}

public void setList(List employees){
    this.employees=employees;
}



public static Finder<Long, Category> find = new Finder<Long,Category>(Category.class);

public static List<Category> findAll(){
    return Category.find.query().where().orderBy("name asc").findList();
}


public static Map<String,String> options(){
LinkedHashMap<String,String> options = new LinkedHashMap<>();

for(Category c: Category.findAll()){
    options.put(c.getID().toString(),c.getName());
}
return options;


}
























}