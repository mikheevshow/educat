package ink.educat.dao.account;

import ink.educat.dao.account.roles.AccountRole;
import ink.educat.dao.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Сущность, отражающая аккаунт пользователя
 */
@Entity
@Table(name = "ACCOUNTS")
public class Account {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "Username", nullable = false)
    private String username;

    @Column(name = "ACCOUNT_PASSWORD", nullable = false)
    private String password;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "EMAIL_CONFIRMED")
    private Boolean emailConfirmed;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    private AccountStatus status;

//    @Enumerated(EnumType.ORDINAL)
//    @ManyToOne(fetch = FetchType.EAGER)
//    private AccountRole role;

    @Column(name = "CREATION_DATE", nullable = false)
    private LocalDateTime creationTime;

    @Column(name = "LAST_LOGIN_DATE")
    private LocalDateTime lastLoginDate;

    public Account() {
    }




}
