package hibakezeles1;

public class ExceptionTeszt {
    
    public static void main (String [] args) {
        try {
            throw new Exception("Valamilyen Hiba!");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        try {
            throw new MyException();
        }
        catch(MyException me) {
            System.out.println("MyException Hiba! A hiba szövege: ");
            System.out.println(me);
            me.printStackTrace();
        }
    }
}