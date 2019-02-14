package ink.educat.services.account;

import ink.educat.dao.account.Account;
import ink.educat.dao.account.AccountDAO;
import ink.educat.dao.account.roles.AccountRole;
import ink.educat.dao.account.AccountStatus;
import ink.educat.exceptions.NoEnoughPermissionsException;
import ink.educat.utils.MessageTemplates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
    private AccountDAO accountDAO;

    @Autowired
    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account findAccountByUsername(@NonNull final String username) {

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<Account> findAllAccountsWithStatus(@NonNull final AccountStatus accountStatus) {

        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void blockAccount(@NonNull final Account admin, @NonNull final Account account) {
        if (isAccountCorrespondsToRoles(account, AccountRole.SUPER_USER, AccountRole.ADMIN)) {
            logger.info(MessageTemplates.OPERATION_INITIATED_WITH_USER_ID + admin.getId());
            account.setStatus(AccountStatus.BLOCKED);
            accountDAO.saveOrUpdate(account);
        } else {

            throw new NoEnoughPermissionsException(MessageTemplates.YOU_HAVE_NOT_PERMISSIONS);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void blockAccounts(@NonNull final Account admin, @NonNull final Iterable<Account> accounts) {
        if (isAccountCorrespondsToRoles(admin, AccountRole.SUPER_USER, AccountRole.ADMIN)) {
            //TODO: изучить батчевую передачу запроса через гибернейт
        } else {

            throw new NoEnoughPermissionsException(MessageTemplates.YOU_HAVE_NOT_PERMISSIONS);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void changeAccountRole(
            @NonNull final Account admin,
            @NonNull final Account account,
            @NonNull final AccountRole role) {

        if (isAccountCorrespondsToRoles(admin, AccountRole.ADMIN, AccountRole.SUPER_USER)) {
            logger.info(MessageTemplates.OPERATION_INITIATED_WITH_USER_ID + admin.getId());
            account.setRole(role);
            accountDAO.saveOrUpdate(account);
        } else {

            throw new NoEnoughPermissionsException(MessageTemplates.YOU_HAVE_NOT_PERMISSIONS);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAccountCorrespondsToRole(@NonNull final Account account, @NonNull final AccountRole role) {

        return account.getRole() == role;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isAccountCorrespondsToRoles(@NonNull final Account account,@NonNull final AccountRole... roles) {
        for (AccountRole role : roles) {
            if (isAccountCorrespondsToRole(account, role)) {

                return true;
            }
        }

        return false;
    }
}
