package abstractfa;

public class TombTeszt {
    
    public static void main (String [] args) {
        AbstractFa erdo [] = new AbstractFa[100];
        int i;
        
        System.out.println("Referenciákat tároló tömbök bemutatása: ");
        erdo[0] = new Orokzold(125);
        System.out.println("Örökzöld: "+erdo[0].getKora()+" éves, "+erdo[0].getLevele("nyar"));
        for(i=1;i<10;i++) {
            erdo[i] = new Orokzold(100+i);
        }
        for(i=10;i<20;i++) {
            erdo[i] = new Lombhullato(20+i);
        }
        String evszak="tel";
        for(i=0;erdo[i]!=null;i++) {
            System.out.println(i+". "+erdo[i]+" :"+erdo[i].getKora()+" éves,"+erdo[i].getLevele(evszak));
        }
    }

}
