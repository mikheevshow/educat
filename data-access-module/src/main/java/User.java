import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * Карточка пользователя портала
 */

public class User implements Serializable {
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
    private Optional<String> instaLink;

}
