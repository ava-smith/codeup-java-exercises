import java.util.Random;

public class ServerNameGenerator {

    public static String getRandomNoun() {
        String[] nouns = {
                "Lion", "Flower", "Moon", "Star", "Leaf", "Snake", "Cow", "Dog", "Cat", "Tree"
        };

        Random random = new Random();

        int randomElement = random.nextInt(nouns.length);
        return nouns[randomElement];
    }

    public static String getRandomAdjective() {
        String[] adjectives = {
                "Pretty", "Dumb", "Cold", "Great", "Tired", "Lazy", "Silly", "Funny", "Bold", "Cool"
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
