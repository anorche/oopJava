package ember;

public class Ember {
    private String nev;
    private Agy agyvelo;
    private Kar jobbkar,balkar;
    
    private static class Elohely {
            //minden ember a Földön él, ezért statikus
        private static String bolygo = "Föld";
        private static String faj = "homo sapiens";
        
        private static String getElohely() {
            return "Élőhely: "+bolygo+" faja: "+faj;
        }
        
        private static void evolucio() {
            faj = "homo sapiens sapiens";
        }
    }
    
    private class Kar {
            //minden embernek saját keze van, ezért nem statikus
        private String karneve;
        
        private Kar(String neve) {
            karneve = neve;
        }
        
        private void mozgat() {
            System.out.println("Mozog a "+karneve);
        }
    }
    
    private class Agy {
        private void irasVezerles(String mit) {
            System.out.print("Íráshoz felkészülök: ");
            Ember.this.jobbkar.mozgat();
            System.out.println("Leírtam: "+mit+" aláírás: "+nev);
        }
    }
    
    public Ember(String neve) {
        nev = neve;
        agyvelo = new Agy();
        jobbkar = new Kar("jobbkar");
        balkar = new Kar("balkar");
    }
    
    public void iras(String mit) {
        agyvelo.irasVezerles(mit);
    }
    
    public void mozgat(String melyik) {
        if( melyik == jobbkar.karneve ) {
            jobbkar.mozgat();
        } else if (melyik == balkar.karneve) {
            balkar.mozgat();
        } else {
            System.out.println("Nem tudom mozgatni: "+melyik);
        }
    }
    
    public void evolucio() {
        Elohely.evolucio();
    }
    
    public String toString() {
        return "Nevem: "+nev+" "+Elohely.getElohely();
    }
}