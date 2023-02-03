package hm_wrk2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x>0) {
            System.out.println("Число положительное");
        }
        else if (x<0){
            System.out.println("Число отрицательное");
        }
    }
}
