public class Docent extends Person{
    private int fachbereich;

    //Defensiver Standard Konstruktor für ein Objekt vom Typ Docent
    public Docent(String name, char geschlecht, int fachbereich) throws IllegalArgumentException, NullPointerException{
        super(name, geschlecht);
        setFachbereich(fachbereich);
    }

    //parameterloser Konstruktor für ein Objekt vom Typ Docent
    public Docent(){
        fachbereich = 0;
        System.out.println("Warnung! Parameterloser Konstruktor der Klasse Docent wurde aufgerufen");
    }

    //Getter & Setter Methode für Fachbereich
    public int getFachbereich() {
        return fachbereich;
    }

    public void setFachbereich(int fachbereich) throws IllegalArgumentException{
        if (fachbereich < 1 || fachbereich > 6) throw new IllegalArgumentException("Fachbereichsnummer muss zwischen 1 und 6 liegen");
        this.fachbereich = fachbereich;
    }

    // toString Methode für die Klasse Docent
    @Override
    public String toString() {
        return super.toString() + ", Aktivität= Dozent, Fachbereich= " + getFachbereich();
    }
}
