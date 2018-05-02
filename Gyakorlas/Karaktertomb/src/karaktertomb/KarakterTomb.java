package karaktertomb;

public class KarakterTomb {
    
    public static void main (String [] args) {
        char [] [] honapok = new char[12][];
        char [] ho = {'F','e','b','r','u','á','r'};
        honapok[0] = new char[6];
        honapok[0][0] = 'J';
        honapok[0][1] = 'a';
        honapok[0][2] = 'n';
        honapok[0][3] = 'u';
        honapok[0][4] = 'á';
        honapok[0][5] = 'r';
        
        honapok[1] = ho;
        
        ho = new char [] {'M','á','r','c','i','u','s'};
        honapok[2] = ho;
        
        honapok[3] = ho;
        honapok[3][0]='X';
        
        for (int i=0; i<honapok.length;i++) {
            for(int j=0;j<honapok[i].length;j++) {
                System.out.print(honapok[i][j]);
            }
            System.out.println();
        }
    }
}