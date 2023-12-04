
public class Administration implements AdministrationInterface{
    Person[] list;

    //Defensiver Standard Konstruktor für ein Objekt vom Typ Administration
    public Administration(Person...liste) throws NullPointerException, IllegalStateException{
        setList(liste);
    }

    //Setter Methode für Liste
    public void setList(Person[] list) throws NullPointerException, IllegalStateException {
        if (list == null) throw new NullPointerException("Array darf nicht null sein!");
        if (list.length == 0) throw new IllegalStateException("Liste darf nicht leer sein!");
        this.list = list;
    }


    //Methode um eine Liste von Personen (Dozent:Innen & Student:Innen), alphabetisch zu sortieren
    public Person[] sortList() throws NullPointerException, IllegalStateException {
        if (list == null) throw new NullPointerException("Array darf nicht null sein!");
        if (list.length == 0) throw new IllegalStateException("Liste darf nicht leer sein!");

        int index;
        for (int i = 0; i <list.length; i++){
            index = i;
            for (int j = i ; j <= list.length-1; j++){
                if (list[j].getName().compareTo(list[index].getName()) < 0){
                    index = j;
                }
            }
            Person temp = list[i];
            list[i] = list[index];
            list[index] = temp;
        }
        return list;
    }

    //Methode um die Anzahl an Studentinnen aus einer Liste zu erfahren
    @Override
    public int countFemale() throws NullPointerException, IllegalStateException {
        if (list == null) throw new NullPointerException("Array darf nicht null sein!");
        if (list.length == 0) throw new IllegalStateException("Liste darf nicht leer sein!");

        int counter = 0;
        for (Person person : list) {
            if (person.getGeschlecht() == 'f' && person instanceof Student) {
                counter++;
            }
        }
        return counter;
    }

    // Methode um die Anzahl der Dozenten aus einer List zu erhalten
    @Override
    public Person[] getDocents(int department) throws NullPointerException, IllegalStateException, IllegalArgumentException {
        //Exceptionhandeling für die Methode getDocent
        if (list == null) throw new NullPointerException("Array darf nicht null sein!");
        if (list.length == 0) throw new IllegalStateException("Liste darf nicht leer sein!");
        if (1 <= department && department <= 6) throw new IllegalArgumentException("Fachbereichsnummer ist nicht bekannt");

        int counter = 0;
        //For-Loop zählt die Menge an Dozenten in der Liste, um die Länge des neuen Arrays herauszufinden
        for (Person person : list) {
            if (person instanceof Docent && ((Docent)person).getFachbereich() == department){
                counter++;
            }
        }
        //Erstellt ein neues Array mit der Länge gleich der Anzahl der Dozenten und setzt den Counter wieder auf null
        Person[] docentVonFachbereich = new Person[counter];
        counter = 0;
        //Fügt alle Dozenten, in das neu erstelle Array
        for (Person person : list) {
            if (person instanceof Docent && ((Docent)person).getFachbereich() == department){
                docentVonFachbereich[counter++] = person;
            }
        }
        return docentVonFachbereich;
    }

    //printList Methode für die Klasse Administration
    @Override
    public void printList() throws NullPointerException {
        if (list == null) throw new NullPointerException("Liste darf nicht null sein");
        for (Person person : list) {
            System.out.println(person);
        }
    }

    // toString Methode für die Klasse Administration
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Person person : list) {
            result.append(person.toString()).append("\n");
        }
        return result.toString();
    }
}
