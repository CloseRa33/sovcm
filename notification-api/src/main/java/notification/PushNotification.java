package notification;

import java.io.Serializable;

public class PushNotification extends Notification implements Serializable {
    private String text = "Мы отправили вам push уведомление! Наверное...";
    private String sendTo;

    public PushNotification() {
        super();
    }

    public PushNotification(String sendTo) {
        super(sendTo);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }
}
