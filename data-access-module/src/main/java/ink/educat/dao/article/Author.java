package ink.educat.dao.article;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHORS", schema = "PUBLIC")
public class Author {

    private String firstName;
    private String secondName;

    public Author() {

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
}
