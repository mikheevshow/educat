package ink.educat.services.user;

import ink.educat.dao.user.User;
import org.springframework.lang.NonNull;

import java.util.Collection;

public interface UserService {

    /**
     * Ищет пользователя по номеру телефона
     *
     * @param phone - номер телефона пользователя
     */
    User findUserByPhone(@NonNull final String phone);

}
