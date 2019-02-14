package ink.educat.configuration;

import ink.educat.dao.account.Account;
import ink.educat.dao.user.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.springframework.context.annotation.*;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <p>Конфигурация слоя доступа к данным.
 * Здесь конфигурируется DAO контекст приложения.</p>
 *
 * <p>В проекте используется Hibernate 5, поэтому разработчик должен учитывать
 * особенности конфигурирования фабрики сеансов в данной версии, а также добавления
 * новых сущностей при написании модулей DAO.</p>
 */
@Configuration
@ComponentScan({"ink.educat.dao"})
@EnableTransactionManagement
public class DataAccessModuleConfiguration {

    @Bean
    public StandardServiceRegistry standardServiceRegistry() {

        return new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    }

    @Bean
    public Metadata metaData() {

        return new MetadataSources(standardServiceRegistry())
                .addAnnotatedClass(Account.class)
                .addAnnotatedClass(User.class)
                .getMetadataBuilder()
                .build();
    }

    @Bean
    public SessionFactory sessionFactory() {

        return metaData().buildSessionFactory();
    }
}
