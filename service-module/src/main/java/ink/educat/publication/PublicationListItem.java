package ink.educat.publication;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * <p>Отражает элемент списка в приложении при запросе методов, возвращяющих <code>Collection<PublicationListItem></code>.
 * Сериализуется/десериализуется в/из JSON. Используется при общении с клиентом.</p>
 */
public class PublicationListItem implements Serializable {

    private static final long serialVersionUID = -2279305672617139763L;

    private String Header;

    private String imageLink;

    private String authorInitials;

    private LocalDate publicationDate;

    private LocalTime readingTime;

    private String Tag;

    public PublicationListItem() {
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
