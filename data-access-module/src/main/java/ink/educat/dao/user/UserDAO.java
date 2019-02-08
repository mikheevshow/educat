package ink.educat.dao.user;

import ink.educat.core.AbstractDAO;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.time.LocalDate;

public interface UserDAO extends AbstractDAO<User> {

    void updateUserFirstName(@NonNull User user, @NonNull String firstName);

    void updateUserSecondName(@NonNull User user, @NonNull String secondName);

    void updateUserMiddleName(@NonNull User user, @Nullable String firstName);

    void updateUserEmail(@NonNull User user, @NonNull String email);

    void updateUserEmailConfirmationStatus(@NonNull User user, @NonNull Boolean status);

    void updateUserBirthDate(@NonNull User user, @NonNull LocalDate birthDate);

    void updateUserPhone(@NonNull User user, @NonNull String phone);

}
