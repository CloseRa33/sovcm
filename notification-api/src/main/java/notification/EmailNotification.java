package notification;

import java.io.Serializable;

public class EmailNotification extends Notification implements Serializable {
    private String text = "Мы потеряли ваше письмо... С уважением почта России!";
    private String sendTo;

    public EmailNotification() {
        super();
    }

    public EmailNotification(String sendTo) {
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
