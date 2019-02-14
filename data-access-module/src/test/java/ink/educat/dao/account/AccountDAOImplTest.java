package ink.educat.dao.account;

import ink.educat.configuration.DataAccessModuleConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataAccessModuleConfiguration.class})
public class AccountDAOImplTest {

    @Autowired
    @Qualifier("accountDAOImpl")
    private AccountDAO accountDAO;

    @Test
    public void testFindById() {

        final Account account = accountDAO.findById(3L);

        Assert.assertNull(account);
    }

    @Test
    public void testFindByIds() {

        final List<Long> ids = new ArrayList<>();
        ids.add(1L);
        final Collection accounts = accountDAO.findByIDs(ids);

        Assert.assertEquals(1, accounts.size());
    }

}
