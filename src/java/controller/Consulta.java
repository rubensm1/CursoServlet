/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.HibernateUtil;
import model.Users;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rubens
 */
public class Consulta {

    private Users user;

    public Users getUser() {
        return user;
    }

    public String sessao() {

        try {

            SessionFactory fab = HibernateUtil.getSessionFactory();
            fab.getCurrentSession().beginTransaction();
            this.user = (Users) fab.getCurrentSession().get(Users.class, 1);
            fab.getCurrentSession().getTransaction().commit();
            fab.getCurrentSession().close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
