import java.util.ArrayList;

public class Lehrveranstaltung {
    
    private String titel;
    private String dozierende;
    private String studierende;
    private Vorlesungsstunde vorlesungsstunden;
    private Praktikumsstunde praktikumsstunde;

    ArrayList<String> teilnehmerliste = new ArrayList<>();

    public Lehrveranstaltung(String titel, String dozierende, String studierende) {
        this.titel = titel;
        this.dozierende = dozierende;
        this.studierende = studierende;
    }


    public void studierenderHinzufuegen(Studierender studierender) {
        teilnehmerliste.add(studierender.getName());
        System.out.println("Studierender hinzugefügt: " + studierender.getName());
    }

     public void StudierenderEntfernen(Studierender studierender) {
        teilnehmerliste.remove(studierender.getName());
     }

    public void getTeilnehmerliste() {
        System.out.println("Teilnehmerliste: " + teilnehmerliste);
    }

    public void getDetails() {
        System.out.println("Titel: " + titel + "\nDozierende: " + dozierende + "\nStudierende: " + studierende);
    }
}
