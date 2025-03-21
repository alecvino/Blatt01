import java.util.ArrayList;

public class Lehrveranstaltung {
    
    private String titel;
    private String dozierende;
    private String studierende;
    private Vorlesungsstunde vorlesungsstunden;
    private Praktikumsstunde praktikumsstunde;

    ArrayList<String> teilnehmerliste = new ArrayList();

    public Lehrveranstaltung(String titel, String dozierende, String studierende, Vorlesungsstunde vorlesungsstunden, Praktikumsstunde praktikumsstunde) {
        this.titel = titel;
        this.dozierende = dozierende;
        this.studierende = studierende;
        this.vorlesungsstunden = vorlesungsstunden;
        this.praktikumsstunde = praktikumsstunde;
    }

    public void hinzufuegen(Studierender studierender) {
        teilnehmerliste.add(studierender.getName());
        System.out.println("Studierender hinzugefügt: " + studierender.getName());
    }

     public void entfernen(Studierender studierender) {
        teilnehmerliste.remove(studierender.getName());
     }

    public void getTeilnehmerliste() {
        System.out.println("Teilnehmerliste: " + teilnehmerliste);
    }
}
