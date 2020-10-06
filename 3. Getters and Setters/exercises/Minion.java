package exercises;

public class Minion {
    private String name; 
    private int eyes; 
    private String color; 
    private String master;

    // Constructor
    Minion(String name, int eyes, String color, String master) {
        this.name = name;
        this.eyes = eyes;
        this.color = color;
        this.master = master;
        
    }

    // Getters
    public String getName() {
        return this.name;
    }
    public String getMaster() {
        return this.master;
    }
    public String getColor() {
        return this.color;
    }

    public int getEyes() {
        return this.eyes;
    }

    // Setters
    public void setMaster(String master) { 
        this.master = master;
    }
    
}
