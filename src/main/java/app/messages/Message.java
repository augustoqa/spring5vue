package app.messages;

import java.util.Date;

/**
 * Message.java defines the Message model
 */
public class Message {
    private Integer id;
    private String text;
    private Date createdDate;

    public Message(String text) {
        this.text = text;
        this.createdDate = new Date();
    }

    public Message(Integer id, String text, Date createdDate) {
        this.id = id;
        this.text = text;
        this.createdDate = createdDate;
    }

    public String getText() {
        return text;
    }

    public Integer getId() {
        return id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }
}
