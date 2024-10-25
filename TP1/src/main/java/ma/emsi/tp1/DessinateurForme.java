package ma.emsi.tp1;

public class DessinateurForme {
    private Forme f;

    public DessinateurForme(Forme f){
        this.f=f;
    }

    public void dessinerForme(){
        f.dessiner();
    }
}
