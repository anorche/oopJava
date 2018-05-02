package abstractfa;

public abstract class AbstractFa {
    private int eletkor;
    
    public AbstractFa(int eletkor) {
        this.eletkor = eletkor;
    }
    
    public int getKora() {
        return eletkor;
    }
    
    public abstract String getLevele(String evszak);    //TombTeszt-nél van szerepe
}