package solid.d.Example1.good;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        SmsService smsService= new SmsService();
        NotificationService notificationService = new NotificationService(smsService);
        notificationService.notifyUser();
    }
}

interface IMessageService {
    void sendMessage();
}

class NotificationService {
    private IMessageService messageService;

    public NotificationService(IMessageService messageService) {
        this.messageService = messageService;
    }

    void notifyUser() {
        messageService.sendMessage();
    }
}

class EmailService implements IMessageService {

    @Override
    public void sendMessage() {
        System.out.println("Sending Email ...");
    }
}

class SmsService implements IMessageService {

    @Override
    public void sendMessage() {
        System.out.println("Sending Sms ...");
    }
}