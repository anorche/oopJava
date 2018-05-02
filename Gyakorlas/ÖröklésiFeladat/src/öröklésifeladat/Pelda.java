package öröklésifeladat;

public class Pelda {
    public static void main (String [] args) {
        Gomb g = new Gomb(5);
        Hasab h = new Hasab(5,2,7);
        Henger he = new Henger(5,17);
        Teglatest t = new Teglatest(5,12,7);
        
        System.out.println("Gömb felszíne: "+g.getFelszin()+"\ntérfogata: "+g.getTerfogat()+"\n\n");
        System.out.println("Hasáb felszíne: "+h.getFelszin()+"\ntérfogata: "+h.getTerfogat()+"\n\n");
        System.out.println("Henger felszíne: "+he.getFelszin()+"\ntérfogata: "+he.getTerfogat()+"\n\n");
        System.out.println("Teglatest felszíne: "+t.getFelszin()+"\ntérfogata: "+t.getTerfogat()+"\n\n");
    }
}