/*
 * Egy a,b,c oldalhosszúságival adott háromszögről eldöntjük, hogy a háromszög
 * egyenlőtlenségnek eleget tesz-e, azaz szerkeszthető-e?
 */
package haromszog;

public class Haromszog {
    private double a;
    private double b;
    private double c;
    
    public Haromszog(double oldal_a, double oldal_b, double oldal_c) {
        a = oldal_a;
        b = oldal_b;
        c = oldal_c;
    }
    
    public double getKerulet() {
        return a+b+c;
    }
    
    public double getTerulet() {
        double s=(getKerulet()/2);
        return (Math.sqrt(s*(s-a)*(s-c)*(s-c)));
    }
    
    public boolean isSzerkesztheto() {
        return ( a+b>c && a+c>b && b+c>a );
    }
    
    public static void main(String [] args) {
        Haromszog h1 = new Haromszog(3,4,5);
        Haromszog h2 = new Haromszog(3,14,50);
        
        System.out.println("A h1 kerülete: "+h1.getKerulet()+"   területe: "+h1.getTerulet());
        System.out.println("A h2 kerülete: "+h2.getKerulet()+"   területe: "+h2.getTerulet());
        if(h1.isSzerkesztheto()) {
            System.out.println("h1 szerkeszthető");
        }
        else {
            System.out.println("h1 nem szerkeszthető");
        }
        if(h2.isSzerkesztheto()) {
            System.out.println("h2 szerkeszthető");
        }
        else {
            System.out.println("h2 nem szerkeszthető");
        }
    }
}

