package abstractfa;

public class Orokzold extends AbstractFa {
    
    public Orokzold(int eletkor) {
        super(eletkor);
    }
    
    public String getLevele(String evszak) {
        return "Az örökzöldek minden évszakban zöldellenek";
    }
    
    public String toString() {
        return "Örökzöld: "+getKora()+" éves.";
    }
}