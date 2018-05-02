package fainterfacees;

public abstract class Fa implements Evszakok {
    protected int eletkor;
    
    public Fa(int eletkor) {
        this.eletkor = eletkor;
    }
    
    public Fa() {
        this(0);
    }
    
    public String getLevele(String evszak) {
        if(evszak.equals("tavasz")) {
            return getLevele(TAVASZ);
        } else if (evszak.equals("nyar")) {
            return getLevele(NYAR);
        } else if (evszak.equals("osz")) {
            return getLevele(OSZ);
        } else if (evszak.equals("tel")) {
            return getLevele(TEL);
        } else {
            return getLevele(-1);
        }
    }
    
    public abstract String getLevele(int evszak);
    
    public int getKora() {
        return eletkor;
    }
}