import java.time.*;
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("--------------------Aufgabe 1: Dozierende und Studenten anlegen / Frage und Antwort-------------------------");

        Dozierender dozierender = new Dozierender("Hans", "Informatik", 1234);
        Studierender studierender = new Studierender("Peter", 123456, "UXD");
        Studierender studierender2 = new Studierender("Juliana", 984323, "Architektur");
        Studierender studierender3 = new Studierender("Maxi", 789625, "Informatik");

        studierender.frageStellen(dozierender, "Was ist die Antwort auf die Frage nach dem Leben, dem Universum und dem ganzen Rest?");
        dozierender.frageBeantworten(studierender, "42");

        System.out.println("\n--------------------Aufgabe 2: Sprechstunden und Feedback-------------------------");

        studierender.sprechstundenAnfrage(dozierender, "Ich habe ein Problem", LocalDate.of(2021, 6, 1), LocalTime.of(10, 0), studierender);
        dozierender.feedbackErhalten(studierender, "Das war super", true);
        dozierender.feedbackErhalten(studierender, "Das war schlecht", false);
        dozierender.feedbackErhalten(studierender, "Das war mittel", true);
        dozierender.getFeedback();

        System.out.println("\n--------------------Aufgabe 3: Lehrveranstaltung / Praktikumstunde / Vorlesungsstunde-------------------------");

        Lehrveranstaltung lehrveranstaltung = new Lehrveranstaltung("UXD", "Hans", "Peter", new Vorlesungsstunde(), new Praktikumsstunde());
        lehrveranstaltung.hinzufuegen(studierender);
        lehrveranstaltung.hinzufuegen(studierender2);
        lehrveranstaltung.hinzufuegen(studierender3);
        lehrveranstaltung.getTeilnehmerliste();
        lehrveranstaltung.entfernen(studierender2);
        lehrveranstaltung.getTeilnehmerliste();
    }
}