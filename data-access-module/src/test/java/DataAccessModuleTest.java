import ink.educat.configuration.DataAccessModuleConfiguration;
import ink.educat.user.UserDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DataAccessModuleTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DataAccessModuleConfiguration.class);
        UserDAO userDAO = (UserDAO) context.getBean("userDAOImpl");
        userDAO.findById(123L);
    }
}
