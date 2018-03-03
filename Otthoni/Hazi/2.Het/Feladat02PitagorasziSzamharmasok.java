package hazi2het;

public class Feladat02PitagorasziSzamharmasok {

	public static void main(String[] args) {
		int N =50;
		boolean help;
		
		for (int i=1; i<=N;i++) {
			for(int j=i;j<=N;j++) {
				for(int k=j;k<=N;k++) {
					help=(i*i+j*j==k*k);
					if(help) {
					System.out.println(i +" " + j +" " + k);
					}
				}
			}
		}
		
		
		

	}

}
