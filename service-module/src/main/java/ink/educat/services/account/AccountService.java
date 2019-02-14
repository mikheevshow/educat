package ink.educat.services.account;

import ink.educat.dao.account.Account;
import ink.educat.dao.account.roles.AccountRole;
import ink.educat.dao.account.AccountStatus;
import ink.educat.exceptions.NoEnoughPermissionsException;
import org.springframework.lang.NonNull;

import java.util.Collection;

/**
 * Сервис для работы с аккаунтами пользователей
 *
 * @author Илья Михеев
 */
public interface AccountService {

    /**
     * Позволяет найти пользователя по никнейму ("Имя пользователя") в системе
     * @param username - имя пользователя
     * @return - аккаунт
     */
    Account findAccountByUsername(@NonNull final String username);

    /**
     * Позволяет найти все аккаунты в статусе {@link ink.educat.dao.account.AccountStatus}
     * @param accountStatus - статус аккаунта
     * @return - коллекцию аккаунтов в статусе
     */
    Collection<Account> findAllAccountsWithStatus(@NonNull final AccountStatus accountStatus);

    /**
     * Присваивает передаваемому аккаунту статус {@link ink.educat.dao.account.AccountStatus#BLOCKED}
     *
     * @throws ink.educat.exceptions.NoEnoughPermissionsException
     */
    void blockAccount(@NonNull final Account admin, @NonNull final Account account);

    /**
     * Присваивает совокупности передаваемых аккаунтов статус {@link ink.educat.dao.account.AccountStatus#BLOCKED}
     *
     * @throws ink.educat.exceptions.NoEnoughPermissionsException
     */
    void blockAccounts(@NonNull final Account admin, @NonNull final Iterable<Account> accounts);

    /**
     * Позволяет менять права пользователя
     *
     * @throws ink.educat.exceptions.NoEnoughPermissionsException
     */
    void changeAccountRole(@NonNull final Account admin, @NonNull final Account account, @NonNull final AccountRole role);

    /**
     * Проверяет, соответствует ли аккаунт роли
     * @param account - аккаунт
     * @param role - роль
     * @return - true/false (соответствует/несоответсвует)
     */
    boolean isAccountCorrespondsToRole(@NonNull final Account account, @NonNull final AccountRole role);

    /**
     * Показывает, соответствует ли аккаунт хотя бы одной из передавамой ролей
     * @param account - аккаунт
     * @param roles - роли
     * @return - true/false (соответствует/несоответсвует)
     */
    boolean isAccountCorrespondsToRoles(@NonNull final Account account, @NonNull final AccountRole... roles);
}
