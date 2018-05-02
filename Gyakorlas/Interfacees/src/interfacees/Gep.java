package interfacees;

public abstract class Gep {
    protected String nev;
    
    public Gep(String nev) {
        this.nev = nev;
    }
    
    public String getNeve() {
        return nev;
    }
    
    public abstract String hasznalatiUtasitas();
}