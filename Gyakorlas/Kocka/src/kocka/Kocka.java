/*
 Osztály készítése egy kocka térfogatának és felszínének meghatározására.
 */
package kocka;

public class Kocka {
    private double a;
    
    public Kocka(double a) {
        this.a = a;
    }
    
    public double getFelszin() {
        return 6*a*a;
    }
    
    public double getTerfogat() {
        return a*a*a;
    }
    
    public static void main (String [] args) {
        Kocka k1 = new Kocka(10);
        
        System.out.println("A kocka felszíne: "+k1.getFelszin()+"\n"+"A kocka térfogata: "+k1.getTerfogat());
    }
}

