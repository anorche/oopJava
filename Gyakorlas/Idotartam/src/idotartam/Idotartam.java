/*
 Egy megadott számról írassuk ki, hogy az hány órának, percnek, és másodpercnek 
 felel meg a valóságban, tehát a szám egy másodpercben beírt érték legyen.
 */
package idotartam;

public class Idotartam{
    private int óra;
    private int perc;
    private int másodperc;
    
    public int getÓra() {
        return óra;
    }
    
    public int getPerc() {
        return perc;
    }
    
    public int getMásodperc() {
        return másodperc;
    }
    
    public Idotartam(int megadott_ido) {
        óra = megadott_ido/(60*60);
        perc = megadott_ido/60%60;
        másodperc = megadott_ido % 60;
    }
    
    public static void main (String [] args) {
        Idotartam pelda= new Idotartam(1000000);
        System.out.println(pelda.getÓra()+" óra "+pelda.getPerc()+" perc "+pelda.getMásodperc()+" másodperc");
    } 
}