import java.time.*;
import java.util.ArrayList;
public class Praktikumsstunde {
    private String thema;
    private LocalDate datum;
    private LocalTime uhrzeit;
    private String raum;
    private String aufgaben;

    ArrayList<String> aufgabenliste = new ArrayList<>();

    public Praktikumsstunde(String thema, LocalDate datum, LocalTime uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void hinzufuegenAufgaben(String aufgaben) {
        aufgabenliste.add(aufgaben);
    }

    public void getAufgaben() {
        System.out.println("Aufgaben: " + aufgabenliste);
    }

    public void getDetails() {
        System.out.println("Thema: " + thema + "\nDatum: " + datum + "\nUhrzeit: " + uhrzeit + "\nRaum: " + raum);
    }
}
