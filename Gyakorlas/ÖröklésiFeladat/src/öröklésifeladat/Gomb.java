package öröklésifeladat;

public class Gomb extends Test {
    private double r;
    
    public Gomb(double r) {
        this.r = r;
        felszinSzamit();
        terfogatSzamit();
    }
    
    public void felszinSzamit() {
        felszin = 4*r*r*Math.PI;
    }
    
    public void terfogatSzamit() {
        terfogat = (4*r*r*r*Math.PI)/3;
    }
}