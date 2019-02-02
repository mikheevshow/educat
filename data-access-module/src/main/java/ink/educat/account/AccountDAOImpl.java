package ink.educat.account;

import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class AccountDAOImpl implements AccountDAO {

    public AccountDAOImpl() {

    }

    @Override
    public Account findById(long id) {
        return null;
    }

    @Override
    public Collection<Account> findByIDs(long[] ids) {
        return null;
    }

    @Override
    public void saveOrUpdate(Iterable<Account> accounts) {

    }

    @Override
    public void saveOrUpdate(Account account) {

    }
}
