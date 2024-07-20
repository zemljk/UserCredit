package hibernate;


import entities.Client;
import entities.Credit;
import entities.CreditOffer;
import entities.PaymentGraphic;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    static {
        try {
            sessionFactory = new Configuration().configure().
                    addAnnotatedClass(Client.class).
                    addAnnotatedClass(Credit.class).
                    addAnnotatedClass(CreditOffer.class).
                    addAnnotatedClass(PaymentGraphic.class).buildSessionFactory();
        } catch (Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
