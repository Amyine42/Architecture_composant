public class SMSService implements NotificationService{

    @Override
    public void notify(Employee e) {
        System.out.println("SMS de "+e.getName()+", status: "+e.getStatus());
    }
}
