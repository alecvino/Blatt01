import java.util.ArrayList;
import java.time.*;

public class Dozierender {

    ArrayList<String> feedback = new ArrayList<String>();

    private String name;
    private String fakultaet;
    private int bueronummer;
    private String wochentag;
    private LocalDate datum;
    private LocalTime sprechstundenAnfang; 
    private LocalTime sprechstundenEnde;

    public Dozierender(String name, String fakultaet, int bueronummer, String wochentag, LocalDate datum, LocalTime sprechstundenAnfang, LocalTime sprechstundenEnde) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
        this.wochentag = wochentag;
        this.sprechstundenAnfang = sprechstundenAnfang;
        this.sprechstundenEnde = sprechstundenEnde;
        this.datum = datum;
    }

    public String getName() {
        return name;
    }

    public String getWochentag() {
        return wochentag;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void frageBeantworten(Studierender studierender, String antwort) {
        System.out.println("Antwort an: " + studierender.getName() + " - " + antwort);
    }

    public void sprechstundenAntwort(LocalDate datum, LocalTime time) {
        if( datum.equals(this.datum) && time.isAfter(this.sprechstundenAnfang) && time.isBefore(this.sprechstundenEnde)) {
            System.out.println("Sprechstundenanfrage angenommen");
        } else {
            System.out.println("Sprechstundenanfrage abgelehnt. Bitte zu den festgelegten Sprechstundenzeiten kommen.");
        }
    }

    public void feedbackErhalten(Studierender studierender, String feedback, boolean behalten) {
        System.out.println("Feedback von: " + studierender.getName() + " - " + feedback + " - " + behalten);

        if(behalten) {
            this.feedback.add(feedback);
            System.out.println("Feedback wird behalten");
        } else {
            System.out.println("Feedback wird nicht behalten");
        }
        
        
    }

    public void getFeedback() {
        System.out.println("Feedback: " + feedback);
    }

    public void getDetails() {
        System.out.println("Name: " + name + "\nFakultaet: " + fakultaet + "\nBueronummer: " + bueronummer + "\nSprechstunde:\nWochentag: " + wochentag + "\nUhrzeit von: " + sprechstundenAnfang + " bis " + sprechstundenEnde);
    }
}
