import java.io.Serializable;
import java.time.LocalDate;

//@Entity
public class Post implements Serializable {
    private final String postText;
    private final LocalDate creationDate;
    private final Author author;

    public Post(String postText, LocalDate creationDate, Author author) {
        this.postText = postText;
        this.creationDate = creationDate;
        this.author = author;
    }

    public String getPostText() {
        return postText;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Author getAuthor() {
        return author;
    }
}
