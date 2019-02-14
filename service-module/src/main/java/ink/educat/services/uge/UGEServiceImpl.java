package ink.educat.services.uge;

import ink.educat.dao.task.TaskDAO;
import ink.educat.services.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервис для предоставления ЕГЭ/ОГЭ пользовательских услуг
 * Подробное описание методов смотрите в {@link ink.educat.services.uge.UGEService}
 */
@Service
public class UGEServiceImpl implements UGEService {

    private static final Logger logger = LoggerFactory.getLogger(UGEServiceImpl.class);
    private final UserService userService;
    private final TaskDAO taskDAO;

    @Autowired
    public UGEServiceImpl(UserService userService, TaskDAO taskDAO) {

        this.userService = userService;
        this.taskDAO = taskDAO;
    }

}
