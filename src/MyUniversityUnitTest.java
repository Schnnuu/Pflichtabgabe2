import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MyUniversityUnitTest {

    //Testet, wie die sortList() Methode reagiert, wenn man ein leeres Array eingibt
    @Test
    public void testSortListWithEmptyArray() {
        Administration admin = new Administration();

        assertThrows(IllegalStateException.class, () ->{admin.sortList();});
    }

    //Testet, wie die sortList() Methode reagiert, wenn man ein null-Array eingibt
    @Test
    public void testSortListWithNullArray() {
        Administration admin = null;

        assertThrows(NullPointerException.class, () ->{admin.sortList();});
    }

    //(Normalfall) Testet, wie die sortList() Methode reagiert, wenn man eine unsortierte Liste eingibt
    @Test
    public void testSortListWithUnsortedNames() {
        Student student1 = new Student("Clara", 'f', 203670);
        Student student2 = new Student("Jennifer", 'f', 203671);
        Student student3 = new Student("David", 'm', 203672);

        Administration originalList = new Administration(student1, student2, student3);
        Administration expectedList = new Administration(student1, student3, student2);

        originalList.sortList();

        assertEquals(originalList.toString(), expectedList.toString());
    }

    //(Grenzfall) Testet, wie die sortList() Methode reagiert, wenn man eine sortierte Liste eingibt
    @Test
    public void testSortListWithSortedNames() {
        Student student1 = new Student("Clara", 'f', 203670);
        Student student2 = new Student("David", 'm', 203672);
        Student student3 = new Student("Jennifer", 'f', 203671);

        Administration originalList = new Administration(student1, student2, student3);
        Administration expectedList = new Administration(student1, student2, student3);

        originalList.sortList();

        assertEquals(expectedList.toString(),originalList.toString());
    }

    //(Normalfall) Testet, wie die sortList() Methode reagiert, wenn man sowohl Dozent:Innen als auch Student:Innen eingibt
    @Test
    public void testSortListWithMixedTypes() {
        Student student1 = new Student("Clara", 'f', 203670);
        Docent docent1 = new Docent("Jakob", 'm', 1);
        Student student2 = new Student("David", 'm', 203671);

        Administration originalList = new Administration(student1, docent1, student2);
        Administration expectedList = new Administration(student1, student2, docent1);

        originalList.sortList();

        assertEquals(originalList.toString(), expectedList.toString());
    }

    //(Grenzfall) Testet, wie die sortList() Methode reagiert, wenn nur das erste Objekt falsch sortiert ist
    @Test
    public void testSortListWithFirstObjectUnsorted() {
        Student student1 = new Student("Zacharia", 'm', 203670);
        Student student2 = new Student("Anna", 'f', 203671);
        Student student3 = new Student("Clara", 'f',203672);
        Student student4 = new Student("David", 'm', 203673);
        Student student5 = new Student("Jakob", 'm',203674);
        Student student6 = new Student("Merlin", 'm', 203675);

        Administration originalList = new Administration(student1, student2, student3, student4, student5, student6);
        Administration expectedList = new Administration(student2, student3, student4, student5, student6, student1);

        originalList.sortList();

        assertEquals(originalList.toString(), expectedList.toString());
    }

    //(Grenzfall) Testet, wie die sortList() Methode reagiert, wenn nur das letzte Objekt falsch sortiert ist
    @Test
    public void testSortListWithLastObjectUnsorted() {
        Student student1 = new Student("Clara", 'f',203672);
        Student student2 = new Student("David", 'm', 203673);
        Student student3 = new Student("Jakob", 'm',203674);
        Student student4 = new Student("Merlin", 'm', 203675);
        Student student5 = new Student("Zacharia", 'm', 203670);
        Student student6 = new Student("Anna", 'f', 203671);

        Administration originalList = new Administration(student1, student2, student3, student4, student5, student6);
        Administration expectedList = new Administration(student6, student1, student2, student3, student4, student5);

        originalList.sortList();

        assertEquals(originalList.toString(), expectedList.toString());
    }
}
