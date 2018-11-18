public interface UserOperations {
    void add(User user);
    void delete(User user);
    void block(User user);
    boolean isDeleted(User user);
    boolean isBlocked(User user);
    boolean givePremisisons(User user, UserStatus status);
}
