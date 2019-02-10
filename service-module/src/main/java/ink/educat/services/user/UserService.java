package ink.educat.services.user;

import ink.educat.dao.user.User;

import java.util.Collection;

public interface UserService {

    /**
     * Ищет пользователя по номеру телефона
     */
    User findUserByPhone(String phone);


    /**
     * Блокирует пользователя на портале
     *
     * @param user - пользователь
     * @throws ink.educat.exceptions.UserBadOperationResultException
     * @throws ink.educat.exceptions.NoEnoughPermissionsException
     */
    void blockUser(User user);

    /**
     * Блокирует пользователей на портале
     *
     * @param users - пользователь
     * @throws ink.educat.exceptions.UserBadOperationResultException
     */
    void blockUsers(Collection<? extends User> users);

    /**
     * Проверяет заблокирован ли пользователь
     *
     * @param user - пользователь
     * @return true/false - заблокирован/незаблокирован
     */
    boolean userIsBlocked(User user);

    /**
     * Позволяет менять рейтинг пользователя
     *
     * @param user   - пользователь
     * @param rating - абсолютное значение рейтинга
     * @throws IllegalStateException
     */
    void changeUserRating(User user, long rating);

    /**
     * Добавляет пользователю очки рейтинга
     *
     * @param user   - пользователь
     * @param rating - рейтинг, который нужно добавить к текущему
     */
    void addRatingForUser(User user, long rating);


}
