import java.util.ArrayList;

public class Dozierender {

    ArrayList<String> feedback = new ArrayList<String>();

    private String name;
    private String fakultaet;
    private int bueronummer;

    public Dozierender(String name, String fakultaet, int bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }

    public int getBueronummer() {
        return bueronummer;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public String getName() {
        return name;
    }

    public void setBueronummer(int bueronummer) {
        this.bueronummer = bueronummer;
    }

    public void setFakultaet(String fakultaet) {
        this.fakultaet = fakultaet;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void frageBeantworten(Studierender studierender, String antwort) {
        System.out.println("Antwort an: " + studierender.getName() + " - " + antwort);
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
}
