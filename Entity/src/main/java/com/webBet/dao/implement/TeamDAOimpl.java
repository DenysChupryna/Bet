package com.webBet.dao.implement;


import com.webBet.dao.Entity.Team;
import com.webBet.dao.interfaces.TeamDAO;
import com.webBet.hibernateFactory.HibernateSessionFactory;
import org.hibernate.Session;

public class TeamDAOimpl implements TeamDAO{

    @Override
    public void addTeam(Team team) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(team);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void updateTeam(Team team) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(team);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteTeam(Team team) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete(team);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
