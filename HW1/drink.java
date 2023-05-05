package HW1;

public abstract class drink {
    private String drink;
    private double volume;
    private Boolean sugar;


    public drink(){
    }

    public drink(String drink, double volume, Boolean sugar) {
        this.drink = drink;
        this.volume = volume;
        this.sugar = sugar;
        
    }

    public String getDrink() {return drink;}
    public double getVolume() {return volume;}
    public Boolean getSugar() {return sugar;}
    
}