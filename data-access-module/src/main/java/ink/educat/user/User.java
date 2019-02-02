package ink.educat.user;

import ink.educat.user.UserStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;

/**
 * Карточка пользователя портала
 */

@Entity
@Table(name = "USERS", schema = "PUBLIC")
public class User implements Serializable {

    @Id
    private Integer id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "SECOND_NAME")
    private String secondName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "EMAIL_CONFIRMED")
    private boolean emailConfirmed;

    @Column(name = "PHONE")
    private Long phone;

    @Column(name = "USER_STATUS")
    private UserStatus userStatus;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    private Boolean sendNotifications;

    private String instaLink;

}
