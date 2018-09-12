package models;

import java.util.*;
import javax.persistence.*;


import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;



@Entity
public class Project extends Model{

    
            @Id
            private Long projID;

            @ManyToOne
            private Category category;


            
            @Constraints.Required
            private String name;
            @Constraints.Required
            private String description;
            @Constraints.Required
            private String supervisor;
            @Constraints.Required
            private double price;
        
            public Project() {
            }
        
            public Project(Long projID, String name,Category category, String description, String supervisor, double price) {
                this.projID = projID;
                this.name = name;
                this.description = description;
                this.supervisor = supervisor;
                this.price = price;
                this.category=category;
            }
        
            public Long getProjID() {
                return projID;
            }
        
            public String getName() {
                return name;
            }
        
            public String getDescription() {
                return description;
            }
        
            public String getSupervisor() {
                return supervisor;
            }
        
            public double getPrice() {
                return price;
            }
        
            public void setProjID(Long projID) {
                this.projID = projID;
            }
        
            public void setName(String name) {
                this.name = name;
            }
        
            public void setDescription(String description) {
                this.description = description;
            }
        
            public void setSupervisor(String supervisor) {
                this.supervisor = supervisor;
            }
        
            public void setPrice(double price) {
                this.price = price;
            }

           public Category getCategory(){
               return category;
           }
           public void setCategory(Category category){
               this.category=category;
           }



     public static final Finder<Long, Project> find = new Finder<>(Project.class);

     public static final List<Project>findAll(){
         return Project.find.all();
     }





        
        }
        





