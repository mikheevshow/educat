package ink.educat.configuration;

import ink.educat.documents.DocumentService;
import ink.educat.documents.DocumentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <p>Конфигурация сервис слоя портала.
 * Здесь конфигурируется сервисный слой приложения + поднимается DAO контекст,
 * подробнее про конфигурацию DAO {@link ink.educat.configuration.DataAccessModuleConfiguration}
 * </p>
 *
 * @author Илья Михеев
 */
@Configuration
@ComponentScan("ink.educat.services")
@Import(DataAccessModuleConfiguration.class)
public class ServiceModuleConfiguration {

    @Bean
    public DocumentService documentService() {

        return new DocumentServiceImpl();
    }

}
