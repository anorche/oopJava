package hibakezeles3;

public class VeremMegteltException extends Exception {
    
    private Object utolso;
    
    public VeremMegteltException(Object o) {
        utolso = o;
    }
    
    public Object miVolt() {
        return utolso;
    }
}