package ink.educat.post;

/**
 * Перечисление, отоображающее статус документа
 */
public enum ArticleStatus {

    NOT_FOUND("Пост не найден"),
    DELETED("Пост удален"),
    MODERATION("Пост на модерации"),
    PUBLISHED("Пост опубликован"),
    WAITING_FOR_PUBLISH("Пост ожидает публикации"),
    EDITED("Пост редактируется");

    private String status;
    ArticleStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
