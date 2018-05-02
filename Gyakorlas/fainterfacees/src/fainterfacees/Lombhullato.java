package fainterfacees;

public class Lombhullato extends Fa {
    private String [] tevekenyseg = {
        "A lombhullató fák tavasszal hozzák leveleiket.",
        "A lombhullató fák nyáron dúsan zöldellenek",
        "A lomhullató fák levelei ősszel lehullanak",
        "A lombhullató ák ágai télen üresek"
    };
    
    public Lombhullato(int eletkor) {
        super(Math.max(0,Math.min(250, eletkor)));
    }
    
    public Lombhullato() {
        super();
    }
       
    public String getLevele(int evszak) {
        if(evszak >= TAVASZ && evszak <= TEL) {
            return " "+tevekenyseg[evszak];
        } else {
            return "Nincs ilyen evszak";
        }
    }
    
    public String toString() {
        return "Lombhullató: "+getKora()+" éves.";
    }
}
