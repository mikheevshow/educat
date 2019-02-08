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
}
