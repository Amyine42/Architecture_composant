package ma.emsi.tp1_bis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1BisApplication {

    public static void main(String[] args) {
        IoCContainer container = new IoCContainer();

        container.registerService(EmailService.class,new EmailService());
        container.registerService(SMSService.class,new SMSService());


        UserController userControllerEmail = new UserController(container.getService(EmailService.class));
        userControllerEmail.notifyUser();

        UserController userControllerSMS = new UserController(container.getService(SMSService.class));
        userControllerSMS.notifyUser();
    }

}
