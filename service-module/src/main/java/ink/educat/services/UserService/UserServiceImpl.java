package ink.educat.services.UserService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Сервис для работы с пользователями
 */

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void blockUser(User user) {

    }

    @Override
    public void blockUsers(Collection<? extends User> users) {

    }

    @Override
    public boolean userIsBlocked(User user) {
        return false;
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
