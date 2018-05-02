package fainterfacees;

public class Orokzold extends Fa {
    
    public Orokzold(int kor) {
        super(Math.max(0,Math.min(500, kor)));
    }
    
    public Orokzold() {
        super();
    }
    
    public String getLevele(int evszak) {
        return "Az örökzöldeknek minden évszakban van levele.";
    }
    
    public String toString() {
        return "Örökzöld: "+getKora()+" éves.";
    }
}