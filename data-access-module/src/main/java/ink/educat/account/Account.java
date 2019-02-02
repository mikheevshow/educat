package ink.educat.account;

import ink.educat.user.User;
import org.springframework.context.annotation.Lazy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Сущность, отражающая аккаунт пользователя
 */
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    private long id;

    @Column(name = "Username")
    private String username;

    @Column(name = "STATUS")
    private AccountStatus accountStatus;

    @Column(name = "USER")
    @Lazy
    private User user;



}
