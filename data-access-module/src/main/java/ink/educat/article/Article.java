package ink.educat.article;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Сущность, отражающая произвольную статью на портале
 */
@Entity
@Table(name = "ARTICLES")
public class Article implements Serializable {

    @Id
    private long id;

    @Column(name = "HEADER")
    private String header;

    @Column(name = "CONTENT")
    private String articleText;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;


    private Author author;

    private ArticleStatus articleStatus;

    @Column(name = "TAGS")
    private String tags;
}
