package ink.educat.Issues;

import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class TaskDAOImpl implements TaskDAO {

    @Override
    public GeneralTaskEntity findById(long id) {

        return null;
    }

    @Override
    public Collection<GeneralTaskEntity> findByIDs(long[] ids) {

        return null;
    }

    @Override
    public void saveOrUpdate(Iterable<GeneralTaskEntity> generalIssueEntities) {

    }

    @Override
    public void saveOrUpdate(GeneralTaskEntity generalTaskEntity) {

    }

}
