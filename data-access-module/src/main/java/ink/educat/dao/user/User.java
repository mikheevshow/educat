package ink.educat.dao.user;

import ink.educat.dao.account.Account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Карточка пользователя портала
 */
@Entity
@Table(name = "USERS", schema = "PUBLIC")
public class User implements Serializable {

    private static final long serialVersionUID = 2424516030192447869L;

    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "SECOND_NAME", nullable = false)
    private String secondName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private Long phone;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "VK_LINK")
    private String vkLink;

    @Column(name = "FB_LINK")
    private String fbLink;

    @Column(name = "INSTA_LINK")
    private String instaLink;

    @Column(name = "AVATAR_LINK")
    private String userAvatarLink;

    //private Account account;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getVkLink() {
        return vkLink;
    }

    public void setVkLink(String vkLink) {
        this.vkLink = vkLink;
    }

    public String getFbLink() {
        return fbLink;
    }

    public void setFbLink(String fbLink) {
        this.fbLink = fbLink;
    }

    public String getInstaLink() {
        return instaLink;
    }

    public void setInstaLink(String instaLink) {
        this.instaLink = instaLink;
    }

//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", birthDate=" + birthDate +
                ", vkLink='" + vkLink + '\'' +
                ", fbLink='" + fbLink + '\'' +
                ", instaLink='" + instaLink + '\'' +
                ", userAvatarLink='" + userAvatarLink + '\'' +
                '}';
    }
}
