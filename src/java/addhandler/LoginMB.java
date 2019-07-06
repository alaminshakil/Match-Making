/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.Dao;
import entity.User;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
/**
 *
 * @author Al Amin Shakil
 */
public class LoginMB {
    User user=new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


   
    public String login(){
        user.setUsername(user.getUsername());
        user.setPassword(user.getPassword());   
       if(new Dao().login(user)){
           System.out.println("Login Sucessfull");     
        return "viewprofile";
        

}else{
            System.out.println("Login Failed");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Something went wrong", ""));
}
return null;
}
    
}
    
    



