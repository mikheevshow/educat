package ink.educat.user;

import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class UserDAOImpl implements UserDAO {

    public UserDAOImpl() {

    }

    @Override
    public User findById(long id) {
        return null;
    }

    @Override
    public Collection<User> findByIDs(long[] ids) {
        return null;
    }

    @Override
    public void saveOrUpdate(Iterable<User> users) {

    }

    @Override
    public void saveOrUpdate(User user) {

    }
}
