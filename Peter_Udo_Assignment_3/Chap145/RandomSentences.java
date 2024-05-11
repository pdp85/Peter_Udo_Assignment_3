package Chap145;

import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {
        // Arrays of words
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};

        // Random number generator
        Random random = new Random();

        // Generate and display 20 sentences
        for (int i = 0; i < 20; i++) {
            StringBuilder sentence = new StringBuilder();

            // Construct the sentence
            sentence.append(capitalize(articles[random.nextInt(articles.length)])).append(" ");
            sentence.append(nouns[random.nextInt(nouns.length)]).append(" ");
            sentence.append(verbs[random.nextInt(verbs.length)]).append(" ");
            sentence.append(prepositions[random.nextInt(prepositions.length)]).append(" ");
            sentence.append(articles[random.nextInt(articles.length)]).append(" ");
            sentence.append(nouns[random.nextInt(nouns.length)]).append(".");

            // Output the sentence
            System.out.println(sentence);
        }
    }

    // Capitalize the first letter of a string
    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

