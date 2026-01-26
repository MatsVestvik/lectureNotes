package testclasses;
public class Main {
    public static void main(String[] args) {
        Creaturecard creature = new Creaturecard("Dragon", 5, "A fierce dragon", 8, 10);
        Itemcard item = new Itemcard("Health Potion", 2, "Restores health", "Restore 5 health points");

        Deck deck = new Deck();
        deck.addCard(creature);
        deck.addCard(item);
        deck.getRandomCard().play();
    }
}