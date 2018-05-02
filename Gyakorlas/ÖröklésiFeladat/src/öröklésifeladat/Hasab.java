package öröklésifeladat;

public class Hasab extends Test {
    private double a,k,m;
    
    public Hasab(double a, double k, double m) {
        this.a = a;
        this.k = k;
        this.m = m;
        felszinSzamit();
        terfogatSzamit();
    }
    
    public void felszinSzamit() {
        felszin = (2*a*a)+(k*m);    /*2*T+k*m*       T=a*a*/
    }
    
    public void terfogatSzamit() {
        terfogat = a*a*m;
    }
}