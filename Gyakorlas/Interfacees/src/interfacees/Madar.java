package interfacees;

public class Madar extends Eloleny implements IRepulo {
    public Madar(String nev) {
        super(nev);
    }
    
    public String taplalkozik() {
        return "A madarak rovarokkal és magvakkal táplálkoznak";
    }
    
    public void felszall() {
        System.out.println("A madarak sűrű szárnycsapásokkal szállnak fel.");
    }
    
    public void repul() {
        System.out.println("A madarak óránként 20-100 km-t tesznek meg");
    }
    
    public void leszall() {
        System.out.println("A madarak egy gallyra is képesek leszállni.");
    }
} 