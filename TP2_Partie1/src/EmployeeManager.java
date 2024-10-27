public class EmployeeManager {
    private EmailService emailService = new EmailService();
    private SMSService smsService = new SMSService();

    public void changeEmployeeStatus(Employee e, String status){
        e.setStatus(status);
        emailService.sendEmail(e);
        smsService.sendSMS(e);
    }
}
