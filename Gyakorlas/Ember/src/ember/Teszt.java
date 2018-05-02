package ember;

public class Teszt {
    public static void main (String [] args) {
        Ember pisti = new Ember("Pisti");
        Ember mari = new Ember("Mari");
        
        System.out.println("Pisti: "+pisti);
        System.out.println("Mari: "+mari);
        System.out.print("pisti.mozgat(jobbkar)-->");
        pisti.mozgat("jobbkar");
        System.out.println("--------");
        System.out.print("pisti.iras()-->");
        pisti.iras("nem szeretem a spenótot");
        System.out.println("--------------");
        System.out.print("mari.iras()-->");
        mari.iras("Kedvencem a palacsinta");
        System.out.println("--------------");
        mari.mozgat("töröttkar");
        System.out.println("-------------");
        System.out.println("Van fejlődés?");
        pisti.evolucio();
        System.out.println("Pisti: "+pisti);
        System.out.println("Mari: "+mari);
    }
}