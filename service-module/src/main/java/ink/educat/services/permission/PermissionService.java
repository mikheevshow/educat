package ink.educat.services.permission;

import ink.educat.dao.account.Account;
import ink.educat.dao.account.roles.AccountRole;
import org.springframework.lang.NonNull;

public interface PermissionService {

    boolean isAccountCorrespondsToRole(@NonNull Account account, @NonNull AccountRole roles);

    /**
     * Показывает, соответствует ли аккаунт хотя бы одной из передавамой ролей
     * @param account - аккаунт
     * @param roles - роли
     * @return - true/false (соответствует/несоответсвует)
     */
    boolean isAccountCorrespondsToRoles(@NonNull Account account, @NonNull AccountRole... roles);

}
