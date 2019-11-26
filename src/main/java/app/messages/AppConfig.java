package app.messages;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig.java is the configuration metadata Spring will use to instantiate the container
 */

//@Configuration annotation to tell Spring that this AppConfig.java is for defining beans.
@Configuration
//@Configuration to tell Spring the base package for scanning for annotated components.
@ComponentScan("app.messages")
public class AppConfig {

    @Bean
    public MessageRepository messageRepository() {
        return new MessageRepository();
    }

    @Bean
    MessageService messageService() {
        return new MessageService(messageRepository());
    }
}
