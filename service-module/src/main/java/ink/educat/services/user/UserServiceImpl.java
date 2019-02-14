package ink.educat.services.user;

import ink.educat.dao.account.AccountStatus;
import ink.educat.dao.user.User;
import ink.educat.dao.user.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
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

    @Override
    public User findUserByPhone(@NonNull final String phone) {

        return userDAO.findUserByPhone(phone);
    }

}
