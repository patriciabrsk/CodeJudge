import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       
        int N = scanner.nextInt();
        scanner.close();
        int hearts = 3+5*(N-1);
        Top top = new Top(hearts, N);
        top.run();
        Bottom bottom = new Bottom (hearts, N);
        bottom.run();
    }
}

