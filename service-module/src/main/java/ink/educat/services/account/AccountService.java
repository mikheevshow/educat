package ink.educat.services.account;

import ink.educat.dao.account.Account;
import ink.educat.dao.account.AccountStatus;
import org.springframework.lang.NonNull;

import java.util.Collection;

public interface AccountService {

    Account findAccountByNickName(@NonNull String nickname);

    Collection<Account> findAllAccountsWithStatus(@NonNull AccountStatus accountStatus);

    /**
     * Присваивает передаваемому аккаунту статус {@link ink.educat.dao.account.AccountStatus#BLOCKED}
     * @param account
     */
    void blockAccount(@NonNull Account account);

    /**
     * Присваивает совокупности передаваемых аккаунтов статус {@link ink.educat.dao.account.AccountStatus#BLOCKED}
     * @param accounts - структра данных, хранящая аккаунты
     */
    void blockAccounts(@NonNull Iterable<Account> accounts);



}
