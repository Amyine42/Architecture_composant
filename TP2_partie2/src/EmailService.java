public class EmailService implements NotificationService{

    @Override
    public void notify(Employee e) {
        System.out.println("Email de "+e.getName()+", status: "+e.getStatus());
    }
}
