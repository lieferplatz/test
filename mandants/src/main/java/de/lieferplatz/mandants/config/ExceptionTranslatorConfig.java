package de.lieferplatz.mandants.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;

/**
 * Created by n0mer on 10/15/15 at 04:01
 */
@Configuration
public class ExceptionTranslatorConfig {

    @Bean
    public PersistenceExceptionTranslator persistenceExceptionTranslator(){
        return new HibernateExceptionTranslator();
    }

}
