package ma.emsi.tp3_partie3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeManager {

    private final List<NotificationService> notifs;

    @Autowired
    public EmployeeManager(List<NotificationService> notifs){
        this.notifs=notifs;

    }

    public void changeEmployeeStatus(Employee e, String status){
        e.setStatus(status);
        for (NotificationService notif : notifs){
        notif.notify(e);
        }
    }
}
