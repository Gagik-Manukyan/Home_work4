package hm_wrk11;

public class Main {
    public static void main(String[] args){
        int result = showTotalAmount(201 );
    }
    public static int showTotalAmount( int x) {
        int result = 0;
        for (int i = 1; i < x; i++) {
            result = i;
            System.out.println(result);

        }
        return result;
    }
}