package ink.educat.services.UGEService;

import ink.educat.task.TaskDAO;
import ink.educat.services.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Сервис для предоставления ЕГЭ/ОГЭ пользовательских услуг
 * Подробное описание методов смотрите в {@link ink.educat.services.UGEService.UGEService}
 */
@Service
public class UGEServiceImpl implements UGEService {

    private UserService userService;

    private TaskDAO taskDAO;

    @Autowired
    public UGEServiceImpl(UserService userService, TaskDAO taskDAO) {
        this.userService = userService;
        this.taskDAO = taskDAO;
    }


}
