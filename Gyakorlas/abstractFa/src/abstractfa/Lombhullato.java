package abstractfa;

public class Lombhullato extends AbstractFa {
    
    public Lombhullato (int eletkor) {
        super(Math.max(0,Math.min(250, eletkor)));       // [0-250] közötti szám
    }
    
    public String getLevele(String evszak) {
        if(evszak.equals("tavasz")) {               //evszak == "tavasz"
            return "A lombhullató fák tavasszal hozzák leveleiket!";
        }
        else if(evszak.equals("nyar")) {
            return "A lombhullatók nyáron dúsan zöldellenek";
        }
        else if(evszak.equals("osz")) {
            return "A lombhullatok ősszel lehullajtják leveleiket!";
        }
        else if(evszak.equals("tel")) {
            return "A lombhullatóknak télen nincs levele";
        }
        else {
            return "Nem ismerek ilyen évszakot!";
        }
    }
    
    public String toString() {
        return "Lombhullató: "+getKora()+" éves.";
    }

}