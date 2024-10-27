public class EmployeeManager {

    NotificationService notif;
    public EmployeeManager(NotificationService notificationService){
        this.notif=notificationService;

    }

    public void changeEmployeeStatus(Employee e, String status){
        e.setStatus(status);

        notif.notify(e);
    }
}
