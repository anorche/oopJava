package interfacees;

public class RepuloGep extends Gep implements IRepulo {
    
    public RepuloGep(String neve) {
        super(neve);
    }
    
    public String hasznalatiUtasitas() {
        return "A repülőgép légi közlekedési eszköz.";
    }
    
    public void felszall() {
        System.out.println("A repülőgép kifutópályáról száll fel.");
    }
    
    public void repul() {
        System.out.println("A repülőgép 10000m magasan repül 800-900 km/h-val");
    }
    
    public void leszall() {
        System.out.println("A repülőgép kifutópályára száll le, erős fékezéssel");
    }   
}