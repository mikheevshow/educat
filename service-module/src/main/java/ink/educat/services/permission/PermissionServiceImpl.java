package ink.educat.services.permission;

import ink.educat.dao.account.Account;
import ink.educat.dao.account.roles.AccountRole;
import org.springframework.lang.NonNull;

public class PermissionServiceImpl implements PermissionService {

    public PermissionServiceImpl() {
    }

    @Override
    public boolean isAccountCorrespondsToRole(@NonNull final Account account, @NonNull final AccountRole role) {
        return account.getRole == role;
    }

    @Override
    public boolean isAccountCorrespondsToRoles(@NonNull final Account account, @NonNull final AccountRole... roles) {
        for (AccountRole role : roles) {
            if (isAccountCorrespondsToRole(account, role)) return true;
        }
        return false;
    }
}
