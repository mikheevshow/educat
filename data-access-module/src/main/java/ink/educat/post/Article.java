package ink.educat.post;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/*
Сущность, отражающа запись в таблице POSTS
 */

@Entity
@Table(name = "ARTICLES")
public class Article implements Serializable {

    @Id
    private long id;

    private String postText;

    private LocalDateTime creationDate;

    private Author author;

    private ArticleStatus articleStatus;

    public Article() {

    }

    public Article(long id, String postText, LocalDateTime creationDate, Author author, ArticleStatus articleStatus) {
        this.id = id;
        this.postText = postText;
        this.creationDate = creationDate;
        this.author = author;
        this.articleStatus = articleStatus;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public ArticleStatus getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(ArticleStatus articleStatus) {
        this.articleStatus = articleStatus;
    }
}
