/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addhandler;

import dao.Dao;
import entity.Profile;
import entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

@ManagedBean
@SessionScoped
public class SearchMB {

    Profile info = new Profile();
    List<User> uList= new ArrayList<>();

    public Profile getInfo() {
        return info;
    }

    public void setInfo(Profile info) {
        this.info = info;
    }

    public List<User> getuList() {
        return uList;
    }

    public void setuList(List<User> uList) {
        this.uList = uList;
    }

    

    public String searchUser() {
       uList = new Dao().searchResult(info);
       
       return "searchResult";
    }

    public List loadCombo() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        List city = session.createQuery("select DISTINCT city from Profile ORDER BY city ASC").list();
//        session.close();
        return city;

    }
    

}
