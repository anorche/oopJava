package Hazi3het;

public class Feladat02FolyamatosSzamologep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		boolean e=true;
		String r;
		do {
		masodikBeolvas();
		System.out.println("Akarsz m�g szomolni? i/n");
		r=keyboard.nextLine();
		System.out.printf("%s",r);
		if(r.equals("i")) {
			e=true;
		}
		else e=false;
			
		}while(e);
		
	}

	public static void masodikBeolvas(){

		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.println("K�rem a sz�mokat �s a m�veletet ");
		String sor=keyboard.nextLine();
		System.out.println(sor);
		String[] karakterek=sor.split(" ");
		int a=Integer.parseInt(karakterek[0]);
		String muvelet=karakterek[1];
		int b=Integer.parseInt(karakterek[2]);
		double eredmeny=0;
		switch (muvelet){
			case "+":
				eredmeny=a+b;
				break;
			case "-":
				eredmeny=a-b;
				break;

			case "/":
				if(b!=0){
					eredmeny=(double)a/b;
				}
				break;
			case "*":
				eredmeny=a*b;
				break;
				default:
					System.out.println("Rossz m�velet");

		}
		System.out.println("Az eredm�ny: "+eredmeny);

	}
	
	
}
