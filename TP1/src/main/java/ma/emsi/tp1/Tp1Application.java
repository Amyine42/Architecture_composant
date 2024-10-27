package ma.emsi.tp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1Application {

    public static void main(String[] args) {

        Forme c = new Cercle();
        Forme t = new Triangle();
        c.dessiner();
        t.dessiner();

        DessinateurForme dessinateurCercle = new DessinateurForme(c);
        DessinateurForme dessinateurTriangle = new DessinateurForme(t);

        dessinateurCercle.dessinerForme();
        dessinateurTriangle.dessinerForme();
    }
    }

