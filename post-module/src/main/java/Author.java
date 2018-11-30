import java.io.Serializable;

public class Author implements Serializable {
    private final String firstName;
    private final String secondName;
    private final String avatarUrl; //Можно попробовать выделить отдельный класс для описания адресов

    public Author(String firstName, String secondName, String avatarUrl) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.avatarUrl = avatarUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }
}
