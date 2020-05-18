package notification;

import java.io.Serializable;

public class Notification implements Serializable {
    private String sendTo;

    public Notification() {
    }

    public Notification(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }
}
