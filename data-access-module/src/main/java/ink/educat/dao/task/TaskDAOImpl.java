//package ink.educat.dao.task;
//
//import org.hibernate.SessionFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.Collection;
//
//@Repository
//public class TaskDAOImpl implements TaskDAO {
//
//    private static final Logger logger = LoggerFactory.getLogger(TaskDAOImpl.class);
//    private SessionFactory sessionFactory;
//
//    @Autowired
//    public TaskDAOImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    public TaskDAOImpl() {
//    }
//
//
//    @Override
//    public GeneralTaskEntity findById(long id) {
//
//        return null;
//    }
//
//    @Override
//    public Collection<GeneralTaskEntity> findByIDs(long[] ids) {
//
//        return null;
//    }
//
//    @Override
//    public void saveOrUpdate(Iterable<GeneralTaskEntity> generalIssueEntities) {
//
//    }
//
//    @Override
//    public void saveOrUpdate(GeneralTaskEntity generalTaskEntity) {
//
//    }
//
//}
