package hibakezeles2;

public class tobbMetodus {
    public static void main (String [] args) {
        tobbMetodus tm = new tobbMetodus();
        tm.kulso();
    }
    
    public void kulso() {
        try {
            belso();
        } catch (nemKell n) {
            System.out.println("kulso nemKell: "+n);
        } catch (Exception e) {
            System.out.println("kulso Exception: "+e);
        }
    }
    
    public void belso() throws nemKell {
        try {
            if (true) throw new nemKell("belso-ben kivaltott nemKell kivétele!");
            if (false) throw new Kell("belso-ben kivaltott Kell kivétele!");
        } catch (Kell k) {
            System.out.println("belso kell: "+k);
        }
    }
}