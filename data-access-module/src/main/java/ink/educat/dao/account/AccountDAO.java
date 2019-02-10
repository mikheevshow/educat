package ink.educat.dao.account;

import ink.educat.core.AbstractDAO;
import ink.educat.dao.account.roles.AccountRole;
import org.springframework.lang.NonNull;

import java.util.Collection;
import java.util.Optional;

/**
 * Основная часть получения обновления и сохранения сущностей работает через Hibernate по принципу CRUD,
 * по-этому для его реализации каждый DAO интерфейс наследуется от {@link ink.educat.core.AbstractDAO}.
 * В связи с этим все DAO интерфейсы должны содержать только те методы, которые не подчиняются принципу CRUD
 * и требуют, например, написания отдельных запросов к базе данных.
 *
 * Написание таких запросов требуют многие бизнес-процессы, метрики, различные алгоритмы и т.д.
 */
public interface AccountDAO extends AbstractDAO<Account> {

    Optional<Account> findByUserName(@NonNull String username);

    Collection<Account> findAllAccountsWithRole(@NonNull AccountRole role);

}
