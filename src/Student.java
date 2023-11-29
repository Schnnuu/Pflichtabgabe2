public class Student extends Person{
    private int matrikelnummer;

    //Defensiver Standard Konstruktor für ein Objekt vom Typ Student
    public Student(String name, char geschlecht, int matrikelnummer) throws IllegalArgumentException, NullPointerException{
        super(name, geschlecht);
        setMatrikelnummer(matrikelnummer);
    }

    //parameterloser Konstruktor für ein Objekt vom Typ Student
    public Student(){
        matrikelnummer = 0;
        System.out.println("Warnung! Parameterloser Konstruktor der Klasse Student wurde aufgerufen");
    }

    //Getter & Setter Methode für Matrikelnummer
    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) throws IllegalArgumentException {
        if (matrikelnummer < 100000 || matrikelnummer > 999999) throw new IllegalArgumentException("Matrikelnummer muss eine positive, sechsstellige Zahl ohne führende 0 sein");
        this.matrikelnummer = matrikelnummer;
    }

    // toString Methode für die Klasse Student
    @Override
    public String toString() {
        return  super.toString() + ", Aktivität= Student, Matrikelnummer= " + getMatrikelnummer();
    }
}
