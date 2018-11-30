import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * Карточка пользователя портала
 */

public class User {
    private Integer id;
    private String firstName;
    private String secondName;
    private String middleName; //Optional parameter
    private String email;
    private Integer phone;
    private UserStatus userStatus;
    private LocalDate birthDate;
    private OffsetDateTime registrationDate;
    private Boolean sendNotifications;
}
