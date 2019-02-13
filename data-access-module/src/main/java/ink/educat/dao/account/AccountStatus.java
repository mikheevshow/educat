package ink.educat.dao.account;

public enum AccountStatus {
    VALID("Активный"),
    BLOCKED("Заблокированный"),
    DELETED("Удаленный");

    private String description;

    AccountStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
