package hibakezeles2;

public class Kell extends Exception {
    public Kell(String u) {
        super(u);
    }
    
    public String toString() {
        return "'Kell' típusú kivétel keletkezett!";
    }
}