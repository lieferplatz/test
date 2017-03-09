package de.lieferplatz.products.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;

/**
 * Created by n0mer on 10/15/15 at 04:01
 */
@Configuration
public class TransactionManagerConfig {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Primary
    @Bean(name = "jpaTransactionManager")
    public PlatformTransactionManager jpaTransactionManager() {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory);
        return txManager;
    }

    @Bean
    public PersistenceExceptionTranslator persistenceExceptionTranslator(){
        return new HibernateExceptionTranslator();
    }

}
