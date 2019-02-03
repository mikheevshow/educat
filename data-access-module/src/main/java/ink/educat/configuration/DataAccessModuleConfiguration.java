package ink.educat.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;
//TODO: 1) Посмотреть как конфигурируется контекст прилжение через java класс
//TODO: 2) Посмотреть как конфигурируется hibernate при помощи аннотаций
//TODO: 3) Посмотреть как можно связать java сущность и другую таблицу без создания
//         сущности ко второй таблице (просто вытащить данные из второй таблицы и вставить
//         в поле сущености относящейся к первой таблице)

/**
 * Конфигурация слоя доступа к данным.
 * Здесь конфигурируется DAO контекст приложения, а также Hibernate.
 */
@Configuration
@ComponentScan({"ink.educat"})
@PropertySource({"classpath:hibernate.properties"})
public class DataAccessModuleConfiguration {

    @Bean
    public LocalSessionFactoryBean sessionFactoryBean() {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource());
        sessionFactoryBean.setHibernateProperties(hibernateProperties());
        return sessionFactoryBean;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        return dataSource;
    }

    @Bean
    public Properties hibernateProperties(){
        Properties properties = new Properties();

        return properties;
    }
}
