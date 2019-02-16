package ink.educat.dao.article;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Сущность, отражающая произвольную статью на портале
 */
@Entity
@Table(name = "ARTICLES")
public class Article implements Serializable {

    private static final long serialVersionUID = 6368136092201275131L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "HEADER")
    private String header;

    @Column(name = "CONTENT")
    private String articleText;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    private Author author;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private ArticleStatus articleStatus;

    @Column(name = "TAGS")
    private String tags;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
