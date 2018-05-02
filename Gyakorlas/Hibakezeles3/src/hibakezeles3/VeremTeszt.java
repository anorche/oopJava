package hibakezeles3;

public class VeremTeszt {
    
    public static void main (String [] args) {
        Verem v = new Verem();
        System.out.println("A verem feltöltése");
        for(int i=0;i<12;i++) {
            v.betesz("i = "+i);
        }
        System.out.println("\nA verem tartalma: ");
        System.out.println(v.toString());
    }
}