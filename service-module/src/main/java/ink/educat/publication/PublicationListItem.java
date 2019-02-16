package ink.educat.publication;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * <p>Отражает элемент списка публикаций на клиенте. Сериализуется/десериализуется в/из JSON.
 *
 * Внимание! При внесение изменений в данный класс, желательно перегенерировать serialVersionUID.</p>
 */
public class PublicationListItem implements Serializable {

    private static final long serialVersionUID = 6937374422811981978L;

    @NonNull
    private long id;

    @NonNull
    private String Header;

    @Nullable
    private String imageLink;

    @Nullable
    private String authorInitials;

    @Nullable
    private LocalDate publicationDate;

    @Nullable
    private LocalTime readingTime;

    @Nullable
    private String Tag;

    public PublicationListItem() {
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public static long getSerialVersionUID() {

        return serialVersionUID;
    }

    public String getHeader() {

        return Header;
    }

    public void setHeader(String header) {

        Header = header;
    }

    public String getImageLink() {

        return imageLink;
    }

    public void setImageLink(String imageLink) {

        this.imageLink = imageLink;
    }

    public String getAuthorInitials() {

        return authorInitials;
    }

    public void setAuthorInitials(String authorInitials) {

        this.authorInitials = authorInitials;
    }

    public LocalDate getPublicationDate() {

        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {

        this.publicationDate = publicationDate;
    }

    public LocalTime getReadingTime() {

        return readingTime;
    }

    public void setReadingTime(LocalTime readingTime) {

        this.readingTime = readingTime;
    }

    public String getTag() {

        return Tag;
    }

    public void setTag(String tag) {

        Tag = tag;
    }
}
