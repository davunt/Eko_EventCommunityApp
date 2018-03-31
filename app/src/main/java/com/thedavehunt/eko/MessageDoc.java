package com.thedavehunt.eko;

public class MessageDoc {

    private String messageID;
    private String timestamp;
    private String senderID;
    private  String messageData;
    private String messageType;

    public MessageDoc(String messageID, String timestamp, String senderID, String messageData, String messageType) {
        this.messageID = messageID;
        this.timestamp = timestamp;
        this.senderID = senderID;
        this.messageData = messageData;
        this.messageType = messageType;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public String getMessageData() {
        return messageData;
    }

    public void setMessageData(String messageData) {
        this.messageData = messageData;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
