package springConfTest.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import springConfTest.entity.StudentEntity;

public class HiberUtil {

    private static final SessionFactory sessionFactory = createFactory();

    private static SessionFactory createFactory(){
        try {
            return new Configuration().configure("hiba.cfg.xml").buildSessionFactory();
        }
            catch (Throwable ex) {
                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getFactory(){
        return sessionFactory;
    }
}
