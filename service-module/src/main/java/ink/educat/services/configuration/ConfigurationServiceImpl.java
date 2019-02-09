package ink.educat.services.configuration;


import ink.educat.dao.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Сервис для работы с настройками пользователей и портала
 * Подробное описание методов смотрите в {@link ink.educat.services.configuration.ConfigurationService}
 */
@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    private static final Logger logger = LoggerFactory.getLogger(ConfigurationServiceImpl.class);

    public ConfigurationServiceImpl() {
    }

    ;

    @Override
    public Object readConfigurationByNameForUser(String configName, User user, Class clazz) {
        return null;
    }
}
