package Hazi3het;

public class Feladat03ArrayOsztaly {

	public static void main(String[] args) {
		double[] duplatomb= {1.1, -13.8, 0, 6.2, 101.101};
		int[] inttomb= {5, 9, -3, 86};
		char[] csartomb= {'z','q','a','b','f','+'};
		int[] inttomb2= {5, 9, -3, 86};
		
		boolean asd= java.util.Arrays.equals(inttomb2, inttomb);
		System.out.println(asd);
		
		
		
		java.util.Arrays.sort(duplatomb);
		java.util.Arrays.sort(inttomb);
		java.util.Arrays.sort(csartomb);
		
		
		for(int i=0;i<duplatomb.length;i++) {
			System.out.println(duplatomb[i]);
			
		}
		
		System.out.println();
		
		for(int i=0;i<inttomb.length;i++) {
			System.out.println(inttomb[i]);
			
		}
		
		System.out.println();
		
		for(int i=0;i<csartomb.length;i++) {
			System.out.println(csartomb[i]);
			
		}
		System.out.println();
		
		int index=java.util.Arrays.binarySearch(duplatomb, 6.2);
		System.out.println(index);
		
		index=java.util.Arrays.binarySearch(inttomb, 86);
		System.out.println(index);
		
		index=java.util.Arrays.binarySearch(csartomb, 'q');
		System.out.println(index);
		
		System.out.println();
		

		
		
	}

}
