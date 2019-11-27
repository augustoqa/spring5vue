package app.messages;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * MessageRepository.java is a demo of the repository that is responsible
 * for saving messages.
 */
@Component
public class MessageRepository {
    private final static Log log = LogFactory.getLog(MessageRepository.class);

    public void saveMessage(Message message) {
        // Save message to a database
        log.info("Saved message: " + message.getText());
    }
}
