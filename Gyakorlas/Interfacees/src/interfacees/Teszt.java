package interfacees;

public class Teszt {
    public static void main (String []args) {
        Madar egymadar = new Madar("Galamb");
        RepuloGep egyrepulo = new RepuloGep("MALEV 222");
        
        System.out.println("Madár neve: "+egymadar.getNeve());
        egymadar.taplalkozik();
        egymadar.felszall();
        egymadar.repul();
        egymadar.leszall();
        
        System.out.println("A repülő neve: "+egyrepulo.getNeve());
        egyrepulo.hasznalatiUtasitas();
        egyrepulo.felszall();
        egyrepulo.repul();
        egyrepulo.leszall();
    }
}