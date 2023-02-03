  package hm_wrk4;
  import java.util.Scanner;
  public class Main {
        public static void main(String[]args) {
            int n;
            Scanner s = new Scanner(System.in);
            System.out.print("Ввести число:");
            n = s.nextInt();
            if ( n%7==01) {
                System.out.println(n + " делится на 5");
            } else {
                System.out.println(n + " не делится на 5");
            }
            if (n%7==0){
                System.out.println(n + " делится на 7");
            } else {
                System.out.println(n + " не делится на 7");
            }
        }
    }