/** 
* ProfanityFilter.java
*
* @author Patricia Bresku
*
* @version 11.10.2021
*/

import java.util.*;

// Input (stdin)
// hate fudgesicles / First line of input for the swearwords to be filtered
// I bleeping hate those fudgesicles. / Second line of input for the whole sentence.
// Expected Output
// I bleeping *&#$ those *&#$%*&#$%*.

public class ProfanityFilter {

    public static void main(String[] args) {
        // The swear words that must be filtered out are given as the first line of the standard input.
        Scanner scanner = new Scanner(System.in); // Scanner input
        String[] swearWords = scanner.nextLine().toLowerCase().split(" "); // Input from Next String
        // Split first line input String to store the 2 bad words to filter out, in the second line:
        String swordOne = swearWords[0].toLowerCase();
        String swordTwo = swearWords[1].toLowerCase();  
        String[] phrase = scanner.nextLine().replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
        // String[] phrase = scanner.nextLine().split(" "); // Input from Next String

        for(int i = 0; i < phrase.length; i++) {
            String word = phrase[i];
            // String punctuation = word.replaceAll(("\\p{P}"), "");
            boolean isSwear = Arrays.asList(swearWords).contains(word.toLowerCase());
            if(!isSwear) {
                System.out.print(word + " "); // + punctuation);
                // System.out.print(word + " ");
            }
            int length = word.length();
            int j = 0;
            String s2 = "";
            if(isSwear) {
                while(j < length) {
                    String s1 = "*&#$%*&#$%**&#$%*&#$%*";
                    s2 = s2 + (s1.substring(j, j + 1));
                    j++;
                }
                System.out.print(s2 + " "); // + punctuation);

            }
            // String punctuation = word.substring(word.length() - 1);
            // if (punctuation.matches("[\\.\\,\\!\\?\\]"))
            // The input text also contains punctuation marks (,.!?), which should not be affected by your filter. These will only show up at the end of words, and only one at a time.

        }

    }
}
    // To replace swearwords printed in stout with the characters *&#$% repeated to the length of the swear word:
    // Thus, if fudgesicles is a swearword, it must be replaced by *&#$%*&#$%*. 

    // public String replaceWord(int length) {
    //     String s1 = "*&#$%*&#$%**&#$%*&#$%*";
    //     int i = 0;
    //     String s2 = "";
    //     while(i < length){
    //         s2 = s2 + (s1.substring(i, i++));
    //     }
    //     return s2;

// A swear word is still a swear word, if it is written in a different case, e.g., 
// in upper case, lower case, or a mix of these. However, a word should not be filtered, if it merely contains a swearword.

// The input text also contains punctuation marks (,.!?), which should not be affected by your filter. 
// These will only show up at the end of words, and only one at a time.