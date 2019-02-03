package ink.educat.services.UserService;
import ink.educat.*;
import ink.educat.user.User;
import ink.educat.user.UserStatus;

import java.util.Collection;

public interface UserService {

    /**
     * Ищет пользователя по номеру телефона
     */
    User findUserByPhone(String phone);


    /**
     * Блокирует пользователя на портале
     * @param user - пользователь
     * @throws ink.educat.exceptions.UserBadOperationResultException
     */
    void blockUser(User user);

    /**
     * Блокирует пользователей на портале
     * @param users - пользователь
     * @throws ink.educat.exceptions.UserBadOperationResultException
     */
    void blockUsers(Collection<? extends User> users);

    /**
     * Проверяет заблокирован ли пользователь
     * @param user - пользователь
     * @return true/false - заблокирован/незаблокирован
     */
    boolean userIsBlocked(User user);

    /**
     * Позволяет менять права доступа пользователя
     * @param user - пользователь
     * @param status - статус пользователя
     */
    void changeUserPermissions(User user, UserStatus status);

    /**
     * Позволяет менять рейтинг пользователя
     * @param user - пользователь
     * @param rating - абсолютное значение рейтинга
     * @throws IllegalStateException
     */
    void changeUserRating(User user, long rating);

    /**
     * Добавляет пользователю очки рейтинга
     * @param user - пользователь
     * @param rating - рейтинг, который нужно добавить к текущему
     */
    void addRatingForUser(User user, long rating);


}
