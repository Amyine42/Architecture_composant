package ma.emsi.tp3_partie3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Tp3Partie3Application {

    public static void main(String[] args) {
        //Initialise le contexte Spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeManager employeeManager = context.getBean(EmployeeManager.class);//Récupere une instance EmployeeManager du contexte

        Employee e = new Employee("amine","active");

        employeeManager.changeEmployeeStatus(e,"inactive");

        context.close(); //ferme le contexte Spring

    }

}
