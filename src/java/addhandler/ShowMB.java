/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.Dao;
import entity.Profile;
import entity.User;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ShowMB {
    Profile user=new Profile();
    User info = new User();

    public User getInfo() {
        return info;
    }

    public void setInfo(User info) {
        this.info = info;
    }
    
    public List<User> getAllUser(){
    List<User> uList = new Dao().alluserInfo();    
    return uList;
    }
      public List<Profile> getUserInfo(){
    List<Profile> usList = new Dao().userInfo(user);    
    return usList;
    }
    
}
