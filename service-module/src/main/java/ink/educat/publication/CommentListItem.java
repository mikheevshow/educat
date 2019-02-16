package ink.educat.publication;


import jdk.internal.jline.internal.Nullable;
import org.springframework.lang.NonNull;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/**
 * <p>Сущность, отражающая элемент списка комментариев к публикации. Сериализуется/десериализуется в/из JSON.
 *
 * Внимание! При внесение изменений в данный класс, желательно перегенерировать serialVersionUID.</p>
 */
public class CommentListItem implements Serializable {

    private static final long serialVersionUID = 2410912455673760675L;

    @NonNull
    private long commentId;

    @NonNull
    private String authorInitials;

    @Nullable
    private String iconLink;

    @NonNull
    private LocalDate commentDate;

    @NonNull
    private String content;

    @Nullable
    private List<CommentListItem> answers;

    private int likesCount;

    public CommentListItem() {
    }

    public static long getSerialVersionUID() {

        return serialVersionUID;
    }

    public long getCommentId() {

        return commentId;
    }

    public void setCommentId(long commentId) {

        this.commentId = commentId;
    }

    public String getAuthorInitials() {

        return authorInitials;
    }

    public void setAuthorInitials(String authorInitials) {

        this.authorInitials = authorInitials;
    }

    public String getIconLink() {

        return iconLink;
    }

    public void setIconLink(String iconLink) {

        this.iconLink = iconLink;
    }

    public LocalDate getCommentDate() {

        return commentDate;
    }

    public void setCommentDate(LocalDate commentDate) {

        this.commentDate = commentDate;
    }

    public String getContent() {

        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public List<CommentListItem> getAnswers() {

        return answers;
    }

    public void setAnswers(List<CommentListItem> answers) {

        this.answers = answers;
    }

    public int getLikesCount() {

        return likesCount;
    }

    public void setLikesCount(int likesCount) {

        this.likesCount = likesCount;
    }
}
