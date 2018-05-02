package fainterfacees;

public class FaInterfaceesTeszt {
    public static void main (String [] args ) {
        Lombhullato tolgy = new Lombhullato(39);
        Lombhullato oregtolgy = new Lombhullato(255);
        Lombhullato cseresznye = new Lombhullato(-8);
        
        Orokzold fenyo = new Orokzold(1000);
        Orokzold tuja = new Orokzold(-5);
        Orokzold fagyal = new Orokzold(4);
        
        System.out.println("Fenyő: "+fenyo+fenyo.getLevele(Evszakok.TAVASZ));
        System.out.println("Tuja: "+tuja+tuja.getLevele(Evszakok.TEL));
        System.out.println("Fagyal: "+fagyal+fagyal.getLevele(Evszakok.NYAR));
        System.out.println("Tölgy: "+tolgy+tolgy.getLevele(Evszakok.TAVASZ));
        System.out.println("Tölgy: "+tolgy+tolgy.getLevele(Evszakok.OSZ));
        System.out.println("Tölgy: "+tolgy+tolgy.getLevele(Evszakok.TEL));
        System.out.println("Tölgy: "+tolgy+tolgy.getLevele(Evszakok.NYAR));
        System.out.println("Öregtölgy: "+oregtolgy+oregtolgy.getLevele(Evszakok.NYAR));
        System.out.println("Cserenye: "+cseresznye+cseresznye.getLevele(Evszakok.NYAR));
        System.out.println("Cserenye: "+cseresznye+cseresznye.getLevele(Evszakok.TEL));
    }
}