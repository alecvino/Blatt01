import java.time.*;

public class Studierender {
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public void frageStellen(Dozierender dozierender, String frage) {
        System.out.println("Frage an: " + dozierender.getName() + " - " + frage);

    }

    public void sprechstundenAnfrage(Dozierender dozierender, String anliegen, String wochentag, LocalDate datum, LocalTime time, Studierender studierender) {
        System.out.println("Sprechstundenanfrage an: " + dozierender.getName() + "\nAnliegen: " + anliegen + "\nWochentag: " + wochentag + "\nDatum: " + datum + "\nUhrzeit: " + time + "\nVon: " + studierender.getName());
        dozierender.sprechstundenAntwort(datum, time);
    }

}


