public class Game {

    public static void main(String args[]) {
        Character toad = new Character("Toad", 100, 50);
        Character mario = new Character("Mario", 100, 20);

        // System.out.println(toad.getName() + "\n" + toad.getattackPoints() + "\n" +
        // toad.getLifePoints());

        // System.out.println(mario.getName() + "\n" + mario.getattackPoints() + "\n" +
        // mario.getLifePoints());

        toad.display();
        mario.display();

        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);

    }
}