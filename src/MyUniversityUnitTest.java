import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyUniversityUnitTest {

    Student student1 = new Student("Max Mustermann", 'm', 540450);
    Student student2 = new Student("Jakob Mackob", 'm', 540434);
    Student student3 = new Student("Martha Mönchenhaus", 'f', 553462);
    Student student4 = new Student("Andrea Gaballier", 'f', 573567);
    Student student5 = new Student("Karla Kolumna", 'f', 100000);
    Student student6 = new Student("Merlin Zauberer", 'd', 999999);

    Docent docent1 = new Docent("Erica Musterfrau", 'f',1);
    Docent docent2 = new Docent("Egon Müller", 'm',1);
    Docent docent3 = new Docent("Mohammed Fatah", 'm',2);
    Docent docent4 = new Docent("Sergey Riskowa", 'm',3);
    Docent docent5 = new Docent("Sandra Mercho", 'f',2);
    Docent docent6 = new Docent("Selina Baur", 'f',4);


    Person[] liste1 = new Person[]{student1, student2, student3, student4, student5, student6, docent1, docent2, docent3, docent4, docent5, docent6};

    public Person[] getListe1() {
        return liste1;
    }

    @Test
    public void setListe() {
    }

    @Test
    public void testSortList() {
        Person[] liste2 = liste1.sortList();
    }

    @Test
    public void countFemaleNormalfall() {

    }

    @Test
    public void getDocents() {
    }

    @Test
    public void printList() {

    }

    @Test
    public void testToString1() {
    }
}
