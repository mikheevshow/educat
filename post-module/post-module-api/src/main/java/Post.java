import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

//@Entity
public class Post implements Postable, Serializable {

    private final long id;
    private final String postText;
    private final LocalDate creationDate;
    private final Author author;

    public Post(long id, String postText, LocalDate creationDate, Author author) {
        this.id = id;
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
