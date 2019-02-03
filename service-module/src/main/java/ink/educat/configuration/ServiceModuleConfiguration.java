package ink.educat.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Конфигурация сервис слоя портала.
 * Здесь конфигурируется сервисный слой приложения + поднимается DAO контекст,
 * подробнее про конфигурацию DAO {@link ink.educat.configuration.DataAccessModuleConfiguration}
 */
@Configuration
@ComponentScan
public class ServiceModuleConfiguration {

}
