package hibakezeles3;

public class Verem {
    final static public int MERET = 10;
    private Object [] tarolo = new Object[MERET];
    private int index = 0;
    
    /*
     betesz metódus egy objektumot a verembe tesz, ha nem sikerül kivételt vált ki
     */
    public void betesz(Object o) {
        try {
            if(index<tarolo.length) {
                tarolo[index++]=o;
            } else {
                throw new VeremMegteltException(o);
            }
        } catch (Exception e) {
            System.out.println("Valamilyen hiba történt!");
        } finally {
            System.out.println("A betesz metódus lefutott");
        }
    }
    
    public String toString() {
        //verem kilistázása
        StringBuffer eredmeny = new StringBuffer();
        for(int i=index-1;i>=0;i--) {
            eredmeny.append("\t").append(tarolo[i]).append("\n");
        }
        return eredmeny.toString();
    }
}