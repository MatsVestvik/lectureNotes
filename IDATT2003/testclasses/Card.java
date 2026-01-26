package testclasses;

public class Card{
    String name;
    int cost;
    String description;

    public Card(){
        this.name = "Default Card";
        this.cost = 0;
        this.description = "This is a default card.";
    }

    public Card(String name, int cost, String description){
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Cost: " + cost + ", Description: " + description;
    }
}
