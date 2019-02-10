package ink.educat.dao.account;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Репозиторий для работы с {@link ink.educat.dao.account.Account}.
 * Подробное описание методов смотри в {@link ink.educat.dao.account.AccountDAO}.
 */
@Repository
public class AccountDAOImpl implements AccountDAO {

    private static final Logger logger = LoggerFactory.getLogger(AccountDAOImpl.class);
    private SessionFactory sessionFactory;

    @Autowired
    public AccountDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public AccountDAOImpl() { }

    private static final String FIND_ACCOUNTS_WITH_ROLE =
            "SELECT * FROM ACCOUNTS" +
                    " WHERE 1=1" +
                    " AND ACCOUNTS.ROLE = :role";




}
