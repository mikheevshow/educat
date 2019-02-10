package ink.educat.services.account;

import ink.educat.dao.account.Account;
import ink.educat.dao.account.AccountDAO;
import ink.educat.dao.account.roles.AccountRole;
import ink.educat.dao.account.AccountStatus;
import ink.educat.services.permission.PermissionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import java.util.Collection;

public class AccountServiceImpl implements AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
    private AccountDAO accountDAO;
    private PermissionService permissionService;

    public AccountServiceImpl() {
    }

    public AccountDAO getAccountDAO() {
        return accountDAO;
    }

    @Autowired
    public void setAccountDAO(AccountDAO accountDAO, PermissionService permissionService) {
        this.accountDAO = accountDAO;
        this.permissionService = permissionService;
    }


    @Override
    public Account findAccountByNickName(@NonNull final String username) {

        return null;
    }

    @Override
    public Collection<Account> findAllAccountsWithStatus(@NonNull final AccountStatus accountStatus) {

        return null;
    }

    @Override
    public void blockAccount(@NonNull final Account account) {
        account.setStatus(AccountStatus.BLOCKED);
        accountDAO.saveOrUpdate(account);
    }

    @Override
    public void blockAccounts(@NonNull final Iterable<Account> accounts) {

    }

    @Override
    public void changeAccountRole(
            @NonNull final Account admin,
            @NonNull final Account account,
            @NonNull final AccountRole role) {

        if (permissionService.isAccountCorrespondsToRole(admin, AccountRole.A))
        account.setRole(role);
        accountDAO.saveOrUpdate(account);
    }
}
