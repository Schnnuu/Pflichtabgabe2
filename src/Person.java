public abstract class Person {
    private String name;
    private char geschlecht;

    //Defensiver Standard Konstruktor für ein Objekt vom Typ Person
    public Person(String name, char geschlecht) throws NullPointerException, IllegalArgumentException{
        setName(name);
        setGeschlecht(geschlecht);
    }

    //parameterloser Konstruktor für ein Objekt vom Typ Person
    public Person(){
        setName("Unbekannt");
        setGeschlecht('d');
        System.out.println("Warnung! Parameterloser Konstruktor der Klasse Person wurde aufgerufen");
    }

    //Getter & Setter Methode für Name
    public String getName() {
        return name;
    }
    public void setName(String name) throws NullPointerException, IllegalArgumentException{
        if(name == null) throw new NullPointerException("Name darf nicht null sein");
        if(name.isEmpty()) throw new IllegalArgumentException("Name darf nicht leer sein!");
        this.name = name;
    }

    //Getter & Setter Methode für Geschlecht
    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) throws IllegalArgumentException {
        if(geschlecht != 'm' && geschlecht != 'f' && geschlecht != 'd') throw new IllegalArgumentException("Bitte gib 'm' für male, 'f' für female oder 'd' für divers an");
        this.geschlecht = geschlecht;
    }

    // toString Methode für die Klasse Person
    @Override
    public String toString() {
        return  "Name= '" + name + '\'' +
                ", Geschlecht= " + geschlecht +" ";
    }
}