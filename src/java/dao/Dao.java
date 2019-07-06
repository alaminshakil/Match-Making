/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Profile;
import entity.User;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;
import util.SessionUtil;

/**
 *
 * @author Al Amin
 */
public class Dao {

    public boolean register(User u) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            session.beginTransaction();
            session.save(u);
            session.getTransaction().commit();
//            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean login(User user) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            session.beginTransaction();
            Query query = session.createQuery("select u from User u where u.username=:uname and u.password=:pass");
            query.setString("uname", user.getUsername());
            query.setString("pass", user.getPassword());
            List<User> list = query.list();
            list.toString();
            session.getTransaction().commit();
//            session.close();

            if (list.size() > 0) {
                HttpSession hts = SessionUtil.getSession();
//                hts.setAttribute("uname", list.get(0).getUsername());
//                hts.setAttribute("uname", list.get(0).getUsername());
//                hts.setAttribute("id", list.get(0).getId());
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {

            return false;
        }
    }

    public List searchResult(Profile info) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query q = session.createQuery("from Profile where gender=? and city=? and age<=?");
        q.setParameter(0, info.getGender());
        q.setParameter(1, info.getCity());
        q.setParameter(2, info.getAge());
        List<User> searchList = q.list();
//        session.close();
        return searchList;

    }

    public List alluserInfo() {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        List<User> uList = session.createQuery("from Profile").list();
        uList.toString();
//        session.close();

        return uList;

    }

    public boolean addProfile(Profile uProfile) {
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            session.beginTransaction();
            session.save(uProfile);
            session.getTransaction().commit();
//            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List userInfo(Profile user) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Query q = session.createQuery("from Profile where username=?");
        q.setParameter(0, user.getUsername());
        List<Profile> userprofile = q.list();        
//        session.close();
        return userprofile;

    }
}
