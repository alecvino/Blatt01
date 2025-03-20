import java.time.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Dozierender dozierender = new Dozierender("Hans", "Informatik", 1234);
        Studierender studierender = new Studierender("Peter", 123456, "UXD");

        studierender.frageStellen(dozierender, "Was ist die Antwort auf die Frage nach dem Leben, dem Universum und dem ganzen Rest?");
        dozierender.frageBeantworten(studierender, "42");
        studierender.sprechstundenAnfrage(dozierender, "Ich habe ein Problem", LocalDate.of(2021, 6, 1), LocalTime.of(10, 0), studierender);
        dozierender.feedbackErhalten(studierender, "Das war super", true);
        dozierender.feedbackErhalten(studierender, "Das war schlecht", false);
        dozierender.feedbackErhalten(studierender, "Das war mittel", true);
    }
}