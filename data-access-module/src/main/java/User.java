import java.time.LocalDate;
import java.time.OffsetDateTime;

public class User {

    private String firstName;
    private String secondName;
    private String middleName; //Optional parameter
    private UserStatus userStatus;
    private LocalDate birthDate;
    private OffsetDateTime registrationDate;
    private Boolean sendNotifications;


    public User(String firstName) {
        this.firstName = firstName;
    }
}
