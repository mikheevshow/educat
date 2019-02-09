package ink.educat.dao.user;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
    private SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public UserDAOImpl() {
    }

    ;

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
