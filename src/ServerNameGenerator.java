import java.util.Random;

public class ServerNameGenerator {

    public static String getRandomNoun() {
        String[] nouns = {
                "Pencil", "Book", "Moon", "Star", "Chips", "Plate", "Door", "Dog", "Cat", "Tree"
        };

        Random random = new Random();

        int randomElement = random.nextInt(nouns.length);
        return nouns[randomElement];
    }

    public static String getRandomAdjective() {
        String[] adjectives = {
                "Pretty", "Hot", "Cold", "Great", "Tired", "Lazy", "Silly", "Funny", "Bold", "Amazing"
        };
        Random random = new Random();

        int randomElement = random.nextInt(adjectives.length);
        return adjectives[randomElement];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", getRandomAdjective(), getRandomNoun());
    }
}
