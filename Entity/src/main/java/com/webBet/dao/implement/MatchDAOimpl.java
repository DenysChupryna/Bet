package com.webBet.dao.implement;


import com.webBet.dao.Entity.Match;
import com.webBet.dao.interfaces.MatchDAO;
import com.webBet.hibernateFactory.HibernateSessionFactory;
import org.hibernate.Session;

public class MatchDAOimpl implements MatchDAO{

    @Override
    public void addMatch(Match match) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(match);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void updateMatch(Match match) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(match);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteMatch(Match match) {
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete(match);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
