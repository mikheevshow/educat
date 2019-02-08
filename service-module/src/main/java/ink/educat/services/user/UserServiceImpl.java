package ink.educat.services.user;

import ink.educat.dao.account.AccountStatus;
import ink.educat.dao.user.User;
import ink.educat.dao.user.UserDAO;
import ink.educat.dao.user.UserStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Сервис для работы с пользователями
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserServiceImpl () {};

    @Override
    public User findUserByPhone(String phone) {
        return null;
    }

    @Override
    @Transactional
    public void blockUser(User user) {
        //TODO проверить работоспособность персистентности для агрегированных объектов
        user.getAccount().setStatus(AccountStatus.BLOCKED);
        userDAO.saveOrUpdate(user);
    }

    @Override
    public void blockUsers(Collection<? extends User> users) {

    }

    @Override
    public boolean userIsBlocked(User user) {
        return user.getAccount().getStatus() == AccountStatus.BLOCKED;
    }

    @Override
    @Transactional
    public void changeUserPermissions(User user, UserStatus status) {

    }

    @Override
    @Transactional
    public void changeUserRating(User user, long rating) {

    }

    @Override
    public void addRatingForUser(User user, long rating) {

    }
}
