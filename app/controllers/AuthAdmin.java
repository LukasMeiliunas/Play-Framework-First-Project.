package controllers;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

//Admin Authorisation
public class AuthAdmin extends Action.Simple{

public CompletionStage<Result> call(Http.Context ctx){

String id = ctx.session().get("email");
if(id != null){
    User u = User.getUserById(id);
    if("admin".equals(u.getRole())){
        return delegate.call(ctx);
    }
}
ctx.flash().put("Error","Login Required.");
return CompletableFuture.completedFuture(redirect(routes.LoginController.login()));




}
/* This Class gets the User ID, if the id is not null then checks if the user has Admin permissions to navigate further.*/




}