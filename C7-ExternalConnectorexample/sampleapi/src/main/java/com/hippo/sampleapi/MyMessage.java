package com.hippo.sampleapi;

public class MyMessage {
    private String user;
    private String message;

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "MyMessage [user=" + user + ", message=" + message + "]";
    }
    
}
