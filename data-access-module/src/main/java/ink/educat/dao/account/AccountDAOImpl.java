package ink.educat.dao.account;

import ink.educat.dao.account.roles.AccountRole;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

/**
 * Репозиторий для работы с {@link ink.educat.dao.account.Account}.
 * Подробное описание методов смотри в {@link ink.educat.dao.account.AccountDAO}.
 *
 * Если вы видите, что Hibernate использует неоптимальные запросы, тогда воспользуйтесь
 * более низким встроенным в Hibernate - JDBC уровнем, для отправки native запросов к базе.
 * В подобных случаях не стоит сохранять красоту ради красоты.
 */
@Repository
public class AccountDAOImpl implements AccountDAO {

    private static final Logger logger = LoggerFactory.getLogger(AccountDAOImpl.class);
    private final SessionFactory sessionFactory;

    @Autowired
    public AccountDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * Запросы к базе данных для сервиса AccountDAO
     */
    private static final String FIND_ACCOUNTS_WITH_ROLE =
            "SELECT * FROM ACCOUNTS" +
                    " WHERE 1=1" +
                    " AND ACCOUNTS.ROLE = :role";

    private static final String FIND_ACCOUNT_BY_USERNAME =
            "SELECT * FROM ACCOUNTS" +
                    " WHERE 1=1" +
                    " AND ACCOUNTS.USERNAME = :username";

    /* Реализация методов интерфейса*/
    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Account> findByUserName(String username) {

        final Session session = sessionFactory.openSession();
        session.close();

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<Account> findAllAccountsWithRole(AccountRole role) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account findById(final long id) {

        final Session session = sessionFactory.openSession();
        final Account account = session.find(Account.class, id);
        session.close();

        return account;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<Account> findByIDs(Iterable<Long> ids) {

        final Collection<Account> collection = new ArrayList<>();
        ids.forEach(id -> collection.add((findById(id) != null) ? findById(id) : new Account()));

        return collection;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveOrUpdate(Iterable<Account> accounts) {

        while (accounts.iterator().hasNext()) {
            this.saveOrUpdate(accounts.iterator().next());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveOrUpdate(Account account) {

        final Session session = sessionFactory.openSession();
        session.saveOrUpdate(account);
        session.close();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(Account account) {

        final Session session = sessionFactory.openSession();
        session.delete(account);
        session.close();
    }
}
