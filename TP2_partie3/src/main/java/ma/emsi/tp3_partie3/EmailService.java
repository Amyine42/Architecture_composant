package ma.emsi.tp3_partie3;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements NotificationService{



    @Override
    public void notify(Employee e) {

        System.out.println("Email de "+e.getName()+", status: "+e.getStatus());
    }
}
