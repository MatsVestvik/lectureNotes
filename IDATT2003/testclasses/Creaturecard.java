package testclasses;

public class Creaturecard extends Card{
    int attack;
    int health;

    public Creaturecard(){
        super();
        this.attack = 0;
        this.health = 0;
    }

    public Creaturecard(String name, int cost, String description, int attack, int health){
        super(name, cost, description);
        this.attack = attack;
        this.health = health;
    }    
}
