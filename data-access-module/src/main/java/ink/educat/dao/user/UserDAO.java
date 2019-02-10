package ink.educat.dao.user;

import ink.educat.core.AbstractDAO;
import org.springframework.lang.NonNull;

import java.util.Optional;

/**
 * Основная часть получения обновления и сохранения сущностей работает через Hibernate по принципу CRUD,
 * по-этому для его реализации каждый DAO интерфейс наследуется от {@link ink.educat.core.AbstractDAO}.
 * В связи с этим все DAO интерфейсы должны содержать только те методы, которые не подчиняются принципу CRUD
 * и требуют, например, написания отдельных запросов к базе данных.
 */
public interface UserDAO extends AbstractDAO<User> {

    /**
     * Позволяет найти пользователя по номеру телефона
     * @param phone - номер телефона
     * @return - опциональный тип User, требуется проверка isPresent()
     */
    Optional<User> findUserByPhone(@NonNull String phone);

}
