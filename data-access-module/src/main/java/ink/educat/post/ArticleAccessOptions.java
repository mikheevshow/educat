package ink.educat.post;

/**
 * Параметры доступа для поста
 */
public enum ArticleAccessOptions {

    ALL("Доступен для всех"),
    FOR_USER_GROUP("Доступен для группы лиц"),
    NOBODY("Недоступен никому");

    private String accessOption;

    ArticleAccessOptions(String accessOption) {
        this.accessOption = accessOption;
    }

    public String getAccessOption() {
        return accessOption;
    }
}
