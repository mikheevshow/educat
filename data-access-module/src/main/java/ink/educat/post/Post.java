package ink.educat.post;

import org.hibernate.Session;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

/*
Сущность, отражающа запись в таблице POSTS
Этот объект так же отражает публикации пользователей в системе
 */

@Entity
public class Post implements Serializable {

    @Id
    private final long id;


    private final String postText;


    private final LocalDateTime creationDate;


    private final Author author;

    private final PostStatus postStatus;

    public Post () {

    }

    public Post(long id, String postText, LocalDateTime creationDate, Author author, PostStatus postStatus) {
        this.id = id;
        this.postText = postText;
        this.creationDate = creationDate;
        this.author = author;
        this.postStatus = postStatus;
    }

    public long getId() {
        return id;
    }

    public PostStatus getPostStatus() {
        return postStatus;
    }

    public String getPostText() {
        return postText;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public Author getAuthor() {
        return author;
    }



}
