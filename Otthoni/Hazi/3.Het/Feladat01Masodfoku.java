package Hazi3het;

public class Feladat01Masodfoku {

	public static void main(String[] args) {
		
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.println("Egyben(0) vagy kulon(1) irod be a szamok?");
		int a =keyboard.nextInt();
		
		switch (a) {
		case 0: {
			egyben();
			break;
		}
		case 1: {
			egyenkent();
			break;
		}
		}
		
	}
	
	public static void egyenkent() {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		
		System.out.println("Kerem 'a' -t: ");
		int a =keyboard.nextInt();
		if(a==0) {
			System.out.println("Ez nem masodfoku");
			return;
		}
		
		System.out.println("Kerem 'b' -t: ");
		int b =keyboard.nextInt();
		System.out.println("Kerem 'c' -t: ");
		int c =keyboard.nextInt();
		
		double disz = (Math.pow(b, 2))-(4*a*c);
		System.out.println("Diszkriminans:" + disz);
		
		if(disz<0) System.out.println("Nincs megoldas R -ben");
		else if(disz==0) {
			double x=((-b)+Math.sqrt(disz))/(2*a);
			System.out.println("Egy megoldás van, x=" + x);
		}
		else {
			double x1=((-b)+Math.sqrt(disz))/(2*a);
			double x2=((-b)-Math.sqrt(disz))/(2*a);
			System.out.println("Két megoldas van, x1=" + x1 + " x2=" + x2);
		}
		keyboard.close();
	}
	
	public static void egyben() {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		
		System.out.println("Kerem a szamokat, vesszovel elvalasztva, pl.: 1,5,6");
		String line=keyboard.nextLine();
		String[] numbers=line.split(",");
		int a =Integer.parseInt(numbers[0]);
		int b =Integer.parseInt(numbers[1]);
		int c =Integer.parseInt(numbers[2]);
		
		double disz = (Math.pow(b, 2))-(4*a*c);
		System.out.println("Diszkriminans:" + disz);
		
		if(disz<0) System.out.println("Nincs megoldas R -ben");
		else if(disz==0) {
			double x=((-b)+Math.sqrt(disz))/(2*a);
			System.out.println("Egy megoldás van, x=" + x);
		}
		else {
			double x1=((-b)+Math.sqrt(disz))/(2*a);
			double x2=((-b)-Math.sqrt(disz))/(2*a);
			System.out.println("Két megoldas van, x1=" + x1 + " x2=" + x2);
		}
		keyboard.close();
		
		
	}
	
}
