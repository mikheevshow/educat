/**
 * Параметры доступа для поста
 */
public enum PostAccessOptions {

    ALL("Доступен для всех"),
    FOR_USER_GROUP("Доступен для группы лиц"),
    NOBODY("Недоступен никому");

    private String accessOption;

    PostAccessOptions(String accessOption) {
        this.accessOption = accessOption;
    }

    public String getAccessOption() {
        return accessOption;
    }
}
