import java.util.*;

public class HeartOfHearts {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var N = in.nextInt();
        in.close();
        var width = 5 * N - 2;
        
        //
        //String white = "♡";
        //String black = "♥";

        if (N == 1) { 
          black(0);
          white(1);
          black(0);
          System.out.print("♡");
          System.out.print("♥");
          newline();
          System.out.print("♡");
          System.out.print("♥");
          System.out.print("♡");
        } else if (N == 2) {
          for (int i = 0; i < 1; i++) System.out.print("♡");
          for (int i = 0; i < 2; i++) System.out.print("♥");
          for (int i = 0; i < 2; i++) System.out.print("♡");
          for (int i = 0; i < 2; i++) System.out.print("♥");
          for (int i = 0; i < 12; i++) System.out.print("♡");
          black(1);
          white(2);
          black(2);
          white(2);
          black(1);
          newline(); 
          black(0);
          white(8);
          black(0);
          newline();
          black(1);
          white(6);
          black(1);
          newline();
          black(2);
          white(4);
          black(2);
          newline();
          black(3);
          white(2);
          black(3);
          newline();
        } else if (N == 3) {
          for (int i = 0; i < 2; i++) System.out.print("♡");
          for (int i = 0; i < 3; i++) System.out.print("♥");
          black();
          for (int i = 0; i < 3; i++) System.out.print("♥");
          for (int i = 0; i < 2; i++) System.out.print("♡");
          white(13);
          newline(); 
          for (int i = 1 ; i <= 6 ; i++) {
            black(i);
            white(width - 2 * i);
            black(i);
            newline();
          }
          break;
          }
        }
    private static void newline() {
      System.out.println();
    }
    private static void black(int N) {
      for (int i = 0; i < N; i++) 
        System.out.print("♡");
    }
      private static void white(int N) {
        for (int i = 0; i < N; i++)
          System.out.print("♥");
      }
  }


  /*for (int i  = 0 ; i < 3 ; i++) 
              System.out.print("♡");
            for (int i = 0 ; i < 2 ; i++) 
              System.out.print("♥");
            for (int i  = 0 ; i < 3 ; i++) System.out.print("♡");
            for (int i  = 0 ; i < 1 ; i++) System.out.print("♡");
              System.out.println();*/

          /*} else if (N == 3) {
            System.out.println("♡♡♥♥♥♡♡♡♥♥♥♡♡");
            System.out.println("♡♥♥♥♥♥♡♥♥♥♥♥♡");
            System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥");
            System.out.println("♡♥♥♥♥♥♥♥♥♥♥♥♡");
            System.out.println("♡♡♥♥♥♥♥♥♥♥♥♡♡");
            System.out.println("♡♡♡♥♥♥♥♥♥♥♡♡♡");
            System.out.println("♡♡♡♡♥♥♥♥♥♡♡♡♡");
            System.out.println("♡♡♡♡♡♥♥♥♡♡♡♡♡");
            System.out.println("♡♡♡♡♡♡♥♡♡♡♡♡♡");
          } else if (N == 4) {*/