package ink.educat.services.configuration;

import ink.educat.dao.user.User;

/**
 * Сервис для работы с настройками пользователей и портала
 */
public interface ConfigurationService {

    /**
     * Позволяет читать значение настройки из базы данных для пользователя
     *
     * @param configName - название настройки
     * @param user       - пользователь
     * @param clazz      - класс, к которому кастится настройка
     * @return переменную класса clazz
     */
    public Object readConfigurationByNameForUser(String configName, User user, Class clazz);

}