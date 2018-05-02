package abstractfa;

public class Teszt {
    
    public static void main(String [] args) {
        Orokzold fenyo = new Orokzold(1000);
        Orokzold tuja = new Orokzold(1);
        Orokzold fagyal = new Orokzold(4);
        
        Lombhullato tolgy = new Lombhullato(39);
        Lombhullato oregtolgy = new Lombhullato(255);
        Lombhullato cseresznye = new Lombhullato(1);
        
        System.out.println("Fenyő: ");
        System.out.println(fenyo);
        System.out.println(" "+fenyo.getLevele("tavasz"));
        System.out.println("Tuja: "+tuja+" "+tuja.getLevele("tel"));
        System.out.println("Fagyal: "+fagyal+" "+fagyal.getLevele("nyar"));
        System.out.println("Tölgy: "+tolgy+" "+tolgy.getLevele("tavasz"));
        System.out.println("Tölgy: "+tolgy+" "+tolgy.getLevele("osz"));
        System.out.println("Tölgy: "+tolgy+" "+tolgy.getLevele("tel"));
        System.out.println("Tölgy: "+tolgy+" "+tolgy.getLevele("nyar"));
        System.out.println("Öregtölgy: "+oregtolgy+" "+oregtolgy.getLevele("nyar"));
        System.out.println("Cseresznye: "+cseresznye+" "+cseresznye.getLevele("nyar"));
        System.out.println("Cseresznye: "+cseresznye+" "+cseresznye.getLevele("valamikor"));
    }
}