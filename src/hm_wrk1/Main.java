package hm_wrk1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Введите целое число: ");
        if (sc.hasNextInt())
        {
            i = sc.nextInt();
            if (i%1==-0){
                System.out.println("Число" + " " + i + " " + "положительное");
            } else {
                System.out.println("Вы ввели  отрицательное число");
            }
        }
    }
}