package Chap146;

import java.util.Random;

public class RandomLimericks {
    public static void main(String[] args) {
        // Arrays of rhyming words for each position in the limerick
        String[] line1 = {"the", "a", "one", "some", "any"};
        String[] line2 = {"boy", "girl", "dog", "town", "car"};
        String[] line3 = {"drove", "jumped", "ran", "walked", "Skipped"};
        String[] line4 = {"to", "from","over","under", "on"};
        String[] line5 = {"pat", "man", "can", "tan", "pan"};

        // Random number generator
        Random random = new Random();

        // Generate and display 10 limericks
        for (int i = 0; i < 10; i++) {
            String limerick = generateLimerick(line1, 
            line2, line3, line4, line5, random);
            System.out.println(limerick);
            System.out.println();
        }
    }

    // Generate a random limerick using the given arrays of rhyming words
    private static String generateLimerick(String[] line1, 
    String[] line2, String[] line3, String[] line4, String[] 
    line5, Random random) {
        StringBuilder limerick = new StringBuilder();

        // Construct the limerick
        limerick.append(line1[random.nextInt(line1.length)]).append(" ");
        limerick.append(line2[random.nextInt(line2.length)]).append(",\n");
        limerick.append(line3[random.nextInt(line3.length)]).append(" ");
        limerick.append(line4[random.nextInt(line4.length)]).append(" ");
        limerick.append("and ");
        limerick.append(line5[random.nextInt(line5.length)]).append(",\n");
        limerick.append("But alas, ").append(line2[random.nextInt(line2.length)]).append(" ");

        // Ensure line 5 starts with a capital letter
        String line5Word = line5[random.nextInt(line5.length)];
        limerick.append(Character.toUpperCase(line5Word.charAt(0)))
        .append(line5Word.substring(1)).append(".");

        return limerick.toString();
    }
}
