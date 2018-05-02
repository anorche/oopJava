package interfacees;

public abstract class Eloleny {
    protected  String nev;
    
    public Eloleny(String nev) {
        this.nev = nev;
    }
    
    public String getNeve() {
        return nev;
    }
    
    public abstract String taplalkozik();
}