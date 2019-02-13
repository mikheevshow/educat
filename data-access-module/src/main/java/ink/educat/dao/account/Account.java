package ink.educat.dao.account;

import ink.educat.dao.account.roles.AccountRole;
import ink.educat.dao.user.User;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Сущность, отражающая аккаунт пользователя
 */
@Entity
@Table(name = "ACCOUNTS")
public class Account implements Serializable {

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

//    @OneToOne(fetch = FetchType.LAZY)
//    @MapsId
//    private User user;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(Boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", emailConfirmed=" + emailConfirmed +
                ", status=" + status +
                ", creationTime=" + creationTime +
                ", lastLoginDate=" + lastLoginDate +
                '}';
    }
}
