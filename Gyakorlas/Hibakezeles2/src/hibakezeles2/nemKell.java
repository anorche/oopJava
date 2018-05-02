package hibakezeles2;

public class nemKell extends Exception {
    public nemKell(String u) {
        super(u);
    }
    
    public String toString() {
        return "'nemKell' típusú kivétel keletkezett!";
    }
}