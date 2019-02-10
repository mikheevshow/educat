package ink.educat.dao.user;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Collection;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
    private SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public UserDAOImpl() { }

    /**
     * Запросы к базе данных для сервиса UserDAO
     */
    private static final String FIND_USER_BY_PHONE =
            "SELECT * FROM USERS" +
                    " WHERE 1=1" +
                    " AND USERS.PHONE = :phone";

    private static final String FIND_USER_BY_EMAIL =
            "SELECT * FROM USERS" +
                    " WHERE 1=1" +
                    " AND USERS.EMAIL = :email";

    /**
     * Реализация методов интерфейса {@link ink.educat.dao.user.UserDAO}
     */

    @Override
    public void updateUserFirstName(@NonNull final User user, @NonNull final String firstName) {
        user.setFirstName(firstName);
        saveOrUpdate(user);
    }

    @Override
    public void updateUserSecondName(@NonNull final User user, @NonNull final String secondName) {
        user.setSecondName(secondName);
        saveOrUpdate(user);
    }

    @Override
    public void updateUserMiddleName(User user, String middleName) {
        user.setMiddleName(middleName);
        saveOrUpdate(user);
    }

    @Override
    public void updateUserEmail(User user, String email) {
        user.setEmail(email);
        saveOrUpdate(user);
    }

    @Override
    public void updateUserEmailConfirmationStatus(User user, Boolean status) {
    }

    @Override
    public void updateUserBirthDate(User user, LocalDate birthDate) {

    }

    @Override
    public void updateUserPhone(User user, String phone) {

    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public Collection<User> findByIDs(long[] ids) {
        return null;
    }

    @Override
    public void saveOrUpdate(Iterable<User> users) {

    }

    @Override
    public void saveOrUpdate(User user) {

    }
}
