import java.util.Scanner;

// You must be able to print the lyrics to any song with a title of the form "<N> <container>s of <drink>".
// Input (stdin) ex: 99 bottles of beer

public class DrinkingSongGen {
    //int N; 
    //String container;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner input
        String title = scanner.nextLine(); // Input from Next String
        
        // String[] parts = title.split("(?<=\\d)(?=\\D)");
        // System.out.println(parts[0]);
        // System.out.println(parts[1]);

        /*
            Parse contents of the input string like this:
            - we assume that the content is in the format "N container(s) of drink"
            1) split string into separate words such that we achieve this:
                [0] -> N
                [1] -> containers
                [2] -> of 
                [3] -> drink
            2) put everything in appropriate variables 
            (read N as integer, put container in a string, put "of" and "drink" back together)
            3) have fun with the looopywoopy

        */
        String[] parts = title.split(" "); // Split String with whitespace - split string in separate words
        int N = Integer.parseInt(parts[0]); // Parse (read) String as an integer
        String container = parts[1]; // container is index 1
        String drink = parts[2] + " " + parts[3]; // drink is rest of string (ex. bottles o)

        while (N > 0) {
            System.out.println(getVerse(N, container, drink) + " on the wall");
            System.out.println(getVerse(N, container, drink));
            System.out.println("Take one down, pass it around");
            System.out.println(getVerse(--N, container, drink) + " on the wall");
            System.out.println();
        }
    }

        /*
            Below I created a method called getVerse that returns the song's appropriate verse String for N == 0 and N == 1
            to manage the singular removal of 's' in the container. 
            getVerse method gets called in the main to print the song.
        */

    private static String getVerse(int N, String container, String drink) {
        if(N == 0)
            return "No more " + container + " " + drink;
        if(N == 1)
            return "One " + container.substring(0, container.length() - 1) + " " + drink;
        return N + " " + container + " " + drink;
    }
}