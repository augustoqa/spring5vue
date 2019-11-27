package app.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * MessageService.java is the application service that provides API's
 * for its clients.
 */
@Component
public class MessageService {
    private MessageRepository repository;

    @Autowired
    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

//    @Autowired
//    public void setRepository(MessageRepository repository) {
//        this.repository = repository;
//    }

    public void save(String text) {
        this.repository.saveMessage(new Message(text));
    }
}
