import java.time.*;
public class Vorlesungsstunde {

    private String thema;
    private LocalDate datum;
    private LocalTime uhrzeit;
    private String raum;

    public Vorlesungsstunde(String thema, LocalDate datum, LocalTime uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void getDetails() {
        System.out.println("Thema: " + thema + "\nDatum: " + datum + "\nUhrzeit: " + uhrzeit + "\nRaum: " + raum);
    }
    
}
