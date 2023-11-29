
public class Administration implements AdministrationInterface{
    Person[] liste;

    public Administration(Person...liste) {
        setListe(liste);
    }

    public void setListe(Person[] liste) {
        this.liste = liste;
    }

    @Override
    public Person[] sortList(Person[] list) throws NullPointerException, IllegalStateException {
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

    @Override
    public int countFemale(Person[] list) throws NullPointerException, IllegalStateException {
        if (list == null) throw new NullPointerException("Array darf nicht null sein!");
        if (list.length == 0) throw new IllegalStateException("Liste darf nicht leer sein!");
        int counter = 0;
        for (Person person : list) {
            if (person.getGeschlecht() == 'f') {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public Docent[] getDocents(int department) throws NullPointerException, IllegalStateException, IllegalArgumentException {
        return new Docent[0];
    }

    @Override
    public void printList(Person[] list) throws NullPointerException {
        if (list == null) throw new NullPointerException("Liste darf nicht null sein");
        for (Person person : list) {
            System.out.println(person);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
