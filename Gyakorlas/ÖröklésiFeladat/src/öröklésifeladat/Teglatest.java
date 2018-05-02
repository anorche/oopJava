package öröklésifeladat;

public class Teglatest extends Test {
    private double a, b, c;
    
    public Teglatest(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        felszinSzamit();
        terfogatSzamit();
    }
    
    public void felszinSzamit() {
        felszin = 2*(a*b+a*c+b*c);
    }
    
    public void terfogatSzamit() {
        terfogat = a*b*c;
    }
}