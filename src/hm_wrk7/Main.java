package hm_wrk7;

public class Main {
    static int biggestOfThree(int x, int y, int z) {
        if (x >= y && x >= z)
            return x;
        else if (y >= x && y >= z)
            return y;
        else
            return z;
    }
    public static void main(String[] args) {
        int a, b, c, max;
        a = 5;
        b = 10;
        c = 3;
        max = biggestOfThree(a, b, c);
        System.out.println(max + " is the largest number.");
    }
}