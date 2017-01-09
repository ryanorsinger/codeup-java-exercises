import java.util.Scanner;

/**
 * Piglatin is a fun way of making a fake language
 * get a word from somebody
 * if the word starts with a vowel, then add "way" to the end of the word
 * if the word has a vowel or vowels, we take the word up until the first vowel and add it the first part to the end of the word with "ay"
 * ex. aloha becomes alohaway
 * hello becomes ellohay
 * */
public class PigLatin {
    public static void main(String[] args) {
        String word;
        System.out.println("Welcome to PigLatin");
        System.out.println("Please input a word you want to translate");
        Scanner scan = new Scanner(System.in);

        word = scan.nextLine();
        System.out.println(word);

        word = word.toLowerCase();
        System.out.println(word);

        word = translate(word);

        System.out.println("Your translation is below:");
        System.out.println(word);

    }

    private static int findVowel(String word) {
        for (int i = 0; i < word.length(); i += 1) {
            // get the character of the letter at that index
            char letter = word.toLowerCase().charAt(i);

            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter =='u') {
                return i;
            }
        }
        return -1;
    }

    private static String translate(String word) {
        // Declare local variables
        String translatedWord;

        // get index of first vowel
        int firstVowelIndex;
        firstVowelIndex = findVowel(word);

        if(firstVowelIndex == 0) {
            translatedWord = word + "way";
        } else if(firstVowelIndex == -1) {
            translatedWord = "{untranslatable} " + word;
        } else {
            String lastPart = word.substring(0, firstVowelIndex);
            String firstPart = word.substring(firstVowelIndex);
            translatedWord = firstPart + lastPart + "ay";
        }

        return translatedWord;
    }
}
