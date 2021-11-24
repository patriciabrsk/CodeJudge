import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class PepTalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            translateWord(word);
            System.out.print(" ");
        }
        scanner.close();
    }

    private static void translateWord(String wordInput) {
        String p = "p";
        // check if regex matches pattern
        Matcher match = Pattern.compile("[^aeiou]?[aeiou]((ng|[^aeiou])(?![aeiou]))?", 
                           Pattern.CASE_INSENSITIVE).matcher(wordInput);

        int syllable = 0;
        // find following expression that matches pattern
        while (match.find()) {
            // if first letter of syllable starts with vowel, add p before repetition
            char firstLetter = match.group().charAt(0);
            if (firstLetter == 'a' || firstLetter =='i' 
                || firstLetter == 'o' || firstLetter == 'e' || firstLetter == 'u') {
                System.out.print(wordInput.substring(syllable, match.end()).trim() 
                + p + wordInput.substring(match.start(), match.end()).trim());
            } else {
                // // if first letter of syllable starts with consonant, then add p before repetition + remove consonant from repetition
                System.out.print(wordInput.substring(syllable, match.end()).trim() 
                + p + wordInput.substring(match.start(), match.end()).substring(1).trim());
            }
        // syllable = match.end();
        syllable = match.end();

        }
    }        
}

