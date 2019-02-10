package ink.educat.dao.account.roles;

public enum AccountRole {
    SUPER_USER(0, "Суперпользователь"),
    SCHOOL(1, "Школьник"),
    STUDENT(2, "Студент"),
    TEACHER(3, "Учитель"),
    WRITER(4, "Писатель"),
    ARTICLE_MODERATOR(5, "Модератор постов"),
    EDU_ORGANIZATION_MEMBER(6, "Представитель образовательной организации"),
    ADMIN(7, "Администратор");

    private long dataBaseId;
    private String definition;

    AccountRole(long dataBaseId, String definition) {
        this.dataBaseId = dataBaseId;
        this.definition = definition;
    }

    public long getDataBaseId() {
        return dataBaseId;
    }

    public String getDefinition() {
        return definition;
    }
}
