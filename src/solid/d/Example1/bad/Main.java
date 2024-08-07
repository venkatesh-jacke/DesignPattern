package solid.d.Example1.bad;


//Dependency Inversion - bad code
public class Main {
    public static void main(String[] args) {

    }
}

class NotificationService {
    EmailService emailService = new EmailService();

    void notifyUser() {
        emailService.sendEmail();
    }
}

class EmailService {
    void sendEmail() {
        System.out.println("Sending email...");
    }
}

class SmsService {
    void sendSms() {
        System.out.println("Sending Sms...");
    }
}