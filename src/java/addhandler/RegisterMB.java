/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.Dao;
import entity.Profile;
import entity.User;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class RegisterMB {

    User info = new User();
    Profile pf=new Profile();

    public Profile getPf() {
        return pf;
    }

    public void setPf(Profile pf) {
        this.pf = pf;
    }

    public User getInfo() {
        return info;
    }

    public void setInfo(User info) {
        this.info = info;
    }

    

    public String register() {
        info.setUsername(info.getUsername());
        info.setPassword(info.getPassword());
        if (new Dao().register(info)) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registration Sucessfull", ""));
            System.out.println("Registration Sucessfull");
            return "addprofile";
        } else {
            System.out.println("Failed");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Registration Failed", ""));
        }

        return null;

    }
    
    public String profile() {
       pf.setUsername(pf.getUsername());
        pf.setPassword(pf.getPassword());
        pf.setFullname(pf.getFullname());
        pf.setAge(pf.getAge());
        pf.setCity(pf.getCity());
        pf.setGender(pf.getGender());
        pf.setProfession(pf.getProfession());
        pf.setFatherName(pf.getFatherName());
        pf.setFatherProfession(pf.getFatherProfession());
        pf.setMotherName(pf.getMotherProfession());
        pf.setEducation(pf.getEducation());
        pf.setHeight(pf.getHeight());
        pf.setAddress(pf.getAddress());
        pf.setAbout(pf.getAbout());    
        if (new Dao().addProfile(pf)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Profile Added Sucessfully", ""));
            System.out.println("Profile Added Sucessfull");
            return null;
        } else {
            System.out.println("Failed");
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Profile Added Failed", ""));
        }
        return null;
    }
}