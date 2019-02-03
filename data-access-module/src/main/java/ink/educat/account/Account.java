package ink.educat.account;

import ink.educat.user.User;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Сущность, отражающая аккаунт пользователя
 */
@Entity
@Table(name = "ACCOUNTS")
public class Account {

    @Id
    private long id;

    @Column(name = "Username")
    private String username;

    @Column(name = "STATUS")
    private AccountStatus accountStatus;

    @Column(name = "ACCOUNT_PASSWORD")
    private String password;

    @OneToOne
    @JoinColumn(name = "USER_ID")
    @Lazy
    private User user;

    @Column(name = "STATUS")
    private AccountStatus status;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationTime;

    @Column(name = "LAST_LOGIN_DATE")
    private LocalDateTime lastLoginDate;

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

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
}
