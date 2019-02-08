package ink.educat.dao.account;

import ink.educat.core.AbstractDAO;
import org.springframework.lang.NonNull;

public interface AccountDAO extends AbstractDAO<Account> {

    void updateAccountRole(@NonNull Account account, @NonNull AccountRole role);

}
