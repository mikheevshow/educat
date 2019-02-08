package ink.educat.dao.account;

public enum AccountRole {
        SUPER_USER(0, "Суперпользователь"),
        SCHOOL(1, "Школьник"),
        STUDENT(2, "Студент"),
        TEACHER(3, "Учитель"),
        BLOGGER(4, "Блоггер"),
        ARTICLE_MODERATOR(5, "Модератор постов");

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
