public abstract class Animale {
    public final String GRADINA_ZOOLOGICA = "GRADINA TARGU-MURESEANA";
    private int id;
    private String nume;
    private int varsta;
    private double greutate;

    public Animale(int id, int varsta, double greutate) {
        this.id = id;
        this.nume = "Fara nume";
        this.varsta = varsta;
        this.greutate = greutate;
    }

    public Animale(int id,String nume, int varsta, double greutate) {
        this.id = id;
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
    }

    public int getID() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public double getGreutate() {
        return greutate;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setGreutate(double greutate) {
        this.greutate = greutate;
    }

    public String toString() {
        String msg = "Datele animalului sunt: ";
        msg = msg + "ID: " + id;
        msg = msg + ", Nume: " + nume;
        msg = msg + ", Varsta: " + varsta;
        msg = msg + ", Greutate: " + greutate;
        return msg;
    }
}
