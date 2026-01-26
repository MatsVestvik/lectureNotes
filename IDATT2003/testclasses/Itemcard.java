package testclasses;

public class Itemcard extends Card{
    String effect;

    public Itemcard(){
        super();
        this.effect = "No effect";
    }

    public Itemcard(String name, int cost, String description, String effect){
        super(name, cost, description);
        this.effect = effect;
    }    
    @Override
    public void play(){
        System.out.println("Using item: " + name + " with Effect: " + effect);
    }
}