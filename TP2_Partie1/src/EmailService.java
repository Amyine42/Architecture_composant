public class EmailService {


    public void sendEmail(Employee e){
        System.out.println("Email de "+e.getName()+", status: "+e.getStatus());
    }
}
