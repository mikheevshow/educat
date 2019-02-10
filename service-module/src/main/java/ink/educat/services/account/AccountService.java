package ink.educat.services.account;

import ink.educat.dao.account.Account;
import ink.educat.dao.account.roles.AccountRole;
import ink.educat.dao.account.AccountStatus;
import org.springframework.lang.NonNull;

import java.util.Collection;

/**
 * Сервис для работы с аккаунтами пользователей
 */
public interface AccountService {

    Account findAccountByNickName(@NonNull String nickname);

    /**
     * Позволяет найти все аккаунты в статусе {@link ink.educat.dao.account.AccountStatus}
     * @param accountStatus - статус аккаунта
     * @return - коллекцию аккаунтов в статусе
     */
    Collection<Account> findAllAccountsWithStatus(@NonNull AccountStatus accountStatus);

    /**
     * Присваивает передаваемому аккаунту статус {@link ink.educat.dao.account.AccountStatus#BLOCKED}
     */
    void blockAccount(@NonNull Account admin,
                      @NonNull Account account);

    /**
     * Присваивает совокупности передаваемых аккаунтов статус {@link ink.educat.dao.account.AccountStatus#BLOCKED}
     */
    void blockAccounts(@NonNull Account admin,
                       @NonNull Iterable<Account> accounts);

    /**
     * Позволяет менять права пользователя
     */
    void changeAccountRole(@NonNull Account admin,
                           @NonNull Account account,
                           @NonNull AccountRole role);


}
