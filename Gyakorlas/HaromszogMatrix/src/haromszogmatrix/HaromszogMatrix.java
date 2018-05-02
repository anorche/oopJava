package haromszogmatrix;

public class HaromszogMatrix {
    public static void main (String [] args) {
        int [][] alsoMatrix = new int[10][];
        for(int i=0;i<alsoMatrix.length;i++) {
            alsoMatrix[i] = new int[i+1];
            for(int j=0;j<alsoMatrix[i].length;j++) {
                alsoMatrix[i][j] = i*j;
            }
        }
        
        System.out.println("A MÁTRIX");
        for(int i=0;i<alsoMatrix.length;i++) {
            for(int j=0;j<alsoMatrix[i].length;j++) {
                System.out.print(alsoMatrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n------------------");
    }
}