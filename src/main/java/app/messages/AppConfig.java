package app.messages;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * AppConfig.java is the configuration metadata Spring will use to instantiate the container
 */

//@Configuration annotation to tell Spring that this AppConfig.java is for defining beans.
@Configuration
//@Configuration to tell Spring the base package for scanning for annotated components.
@ComponentScan("app.messages")
public class AppConfig {

    @Bean
    public FilterRegistrationBean<AuditingFilter> auditingFilterRegistrationBean() {
        FilterRegistrationBean<AuditingFilter> registration = new FilterRegistrationBean<>();
        AuditingFilter filter = new AuditingFilter();
        registration.setFilter(filter);
        registration.setOrder(Integer.MAX_VALUE);
        registration.setUrlPatterns(Arrays.asList("/messages/*"));
        return registration;
    }

}
