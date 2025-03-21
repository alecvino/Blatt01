import java.time.*;
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("--------------------Aufgabe 1: Dozierende und Studenten anlegen / Frage und Antwort-------------------------");

        Dozierender dozierender = new Dozierender("Hans", "Informatik", 1234, "Montag",LocalDate.of(2021, 3, 15), LocalTime.of(10, 0), LocalTime.of(12, 0));
        Studierender studierender = new Studierender("Peter", 123456, "UXD");
        Studierender studierender2 = new Studierender("Juliana", 984323, "Architektur");
        Studierender studierender3 = new Studierender("Maxi", 789625, "Informatik");

        studierender.frageStellen(dozierender, "Was ist die Antwort auf die Frage nach dem Leben, dem Universum und dem ganzen Rest?");
        dozierender.frageBeantworten(studierender, "42");

        System.out.println("\n--------------------Aufgabe 2: Sprechstunden und Feedback-------------------------");
        System.out.println("\n--------------------Dozierender-Info-------------------------");
        dozierender.getDetails();
        System.out.println("\n--------------------Studierender-SprechstundenAnfrage-------------------------");
        studierender.sprechstundenAnfrage(dozierender, "Ich habe ein Problem", "Mittwoch", LocalDate.of(2021, 6, 1), LocalTime.of(10, 0), studierender);
        System.out.println("\n");
        dozierender.feedbackErhalten(studierender, "Das war super", true);
        dozierender.feedbackErhalten(studierender2, "Das war schlecht", false);
        dozierender.getFeedback();

        System.out.println("\n--------------------Aufgabe 3.1: Lehrveranstaltung / Teilnehmerliste-------------------------");

        Lehrveranstaltung lehrveranstaltung = new Lehrveranstaltung("UXD", "Hans", "Peter");
        lehrveranstaltung.studierenderHinzufuegen(studierender);
        lehrveranstaltung.studierenderHinzufuegen(studierender2);
        lehrveranstaltung.studierenderHinzufuegen(studierender3);
        lehrveranstaltung.getTeilnehmerliste();
        lehrveranstaltung.StudierenderEntfernen(studierender2);
        lehrveranstaltung.getTeilnehmerliste();

        System.out.println("\n--------------------Aufgabe 3.2: Vorlesungsstunde-------------------------");
        Vorlesungsstunde vorlesungsstunde = new Vorlesungsstunde("Java", LocalDate.of(2021, 3, 15), LocalTime.of(10, 0), "A123");
        vorlesungsstunde.getDetails();

        System.out.println("\n--------------------Aufgabe 3.3: Praktikumsstunde / AufgabenListe-------------------------");
        
        Praktikumsstunde praktikumsstunde = new Praktikumsstunde("Java", LocalDate.of(2021, 3, 15), LocalTime.of(10, 0), "A123");
        praktikumsstunde.getDetails();
        praktikumsstunde.hinzufuegenAufgaben("Aufgabe 1");
        praktikumsstunde.hinzufuegenAufgaben("Aufgabe 2");
        praktikumsstunde.getAufgaben();
        
    }
}