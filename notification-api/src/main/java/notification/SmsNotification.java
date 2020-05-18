package notification;

import java.io.Serializable;

public class SmsNotification extends Notification implements Serializable {
    private String text = "Количество случаев короновируса в Саратовской области выросло. Соблюдайте самоизоляцию! MCHS";
    private String sendTo;

    public SmsNotification() {
        super();
    }

    public SmsNotification(String sendTo) {
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
