import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

//@Entity
public class Post implements Postable, Serializable {
    private final String postText;
    private final LocalDate creationDate;
    private final Author author;

    public Post(String postText, LocalDate creationDate, Author author) {
        this.postText = postText;
        this.creationDate = creationDate;
        this.author = author;
    }


    @Override
    public Post getPostById(double id) {
        return null;
    }

    @Override
    public List<Post> getPostsByIDs(Long[] IDs) {
        return null;
    }

    @Override
    public void addPost(Post post) {

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
