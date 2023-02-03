package hm_wrk9;
 public class Main {

     public static void main(String[] args) {
         int x = 0;
         while (x++ < 10) {
             do {
                 x = 7;
             }while(x>10);
             x++;
             System.out.println(x);
             return;
         }
     }
 }