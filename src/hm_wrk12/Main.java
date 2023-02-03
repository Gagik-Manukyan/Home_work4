package hm_wrk12;

public class Main {
    public static int main(int x) {
        while (x >= 10)
            x /= 10;
        return x;
    }
    public static void main(String[] args) {
        int x = 1593;
        System.out.println(main(x));
    }
}
