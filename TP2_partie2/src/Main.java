//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IoCContainer container = new IoCContainer();

        container.registerService(EmailService.class,new EmailService());
        container.registerService(SMSService.class,new SMSService());

        Employee e = new Employee("amine","active");
        EmployeeManager email = new EmployeeManager(container.getService(EmailService.class));

        EmployeeManager sms = new EmployeeManager(container.getService(SMSService.class));

        email.changeEmployeeStatus(e,"inactive");
        sms.changeEmployeeStatus(e,"inactive");
    }
}