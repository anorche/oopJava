package ketdimenziostomb;

public class KetdimenziosTomb {
    public static void main (String [] args) {
        int [][] matrix;
        matrix = new int [10][10];   //int [][] matrix=new int [10][10];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                matrix[i][j] = i*2+j;
            }
        }
        
        System.out.println("A MÁTRIX");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print("   "+matrix[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
    } 
}

    