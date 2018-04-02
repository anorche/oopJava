package otodikFeladat;

public class KonyvHasznalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Konyv book=new Konyv();

		book.setPrice(1500);

		System.out.println("Price: "+book.getPrice());

		book.raisePrice(30);

		System.out.println("Price: "+book.getPrice());

		System.out.println(book.getDetails());

	}



}