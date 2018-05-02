package öröklésifeladat;

public class Henger extends Test {
    private double r,m;
    
    public Henger(double r, double m) {
        this.r = r;
        this.m = m;
        felszinSzamit();
        terfogatSzamit();
    }
    
    public void felszinSzamit() {
        felszin = 2*r*Math.PI*(r+m);
    }
    
    public void terfogatSzamit() {
        terfogat = r*r*Math.PI*m;
    }
    
    
}