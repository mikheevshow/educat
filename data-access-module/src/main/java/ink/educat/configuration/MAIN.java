package ink.educat.configuration;

import ink.educat.dao.account.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.PersistenceContext;


public class MAIN {

    private static final Logger logger = LoggerFactory.getLogger(MAIN.class);
    private static final ApplicationContext context = new AnnotationConfigApplicationContext(DataAccessModuleConfiguration.class);
    @PersistenceContext
    private static final SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");

    public static void main(String[] args) {

        final Session session = sessionFactory.openSession();

        System.out.println(session.load(Account.class,1L).getEmail());

       // final Account account = session.load(Account.class, 1);




    }
}
