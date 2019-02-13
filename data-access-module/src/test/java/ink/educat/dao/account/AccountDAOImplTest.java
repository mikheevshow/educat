package ink.educat.dao.account;

import ink.educat.configuration.DataAccessModuleConfiguration;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDateTime;

@ContextConfiguration(classes = {AccountDAOTestContext.class})
public class AccountDAOImplTest {



    @Autowired
    private AccountDAO accountDAO;

    @Test
    public void testSaveOrUpdate() {
        final Account account = new Account();
        account.setStatus(AccountStatus.VALID);
        account.setId(2L);
        account.setCreationTime(LocalDateTime.now());
        account.setEmailConfirmed(false);

        accountDAO.saveOrUpdate(account);
    }

}
