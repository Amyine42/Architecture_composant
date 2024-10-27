package ma.emsi.tp3_partie3;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements NotificationService{

    @Override
    public void notify(Employee e) {

        System.out.println("SMS de "+e.getName()+", status: "+e.getStatus());
    }
}
