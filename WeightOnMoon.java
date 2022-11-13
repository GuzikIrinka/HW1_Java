// Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая
// вычислила бы ваш вес на Луне.

import java.util.Scanner;

public class WeightOnMoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weight:");
        System.out.printf("Your weight on the moon is: " + "%.2f", scanner.nextDouble() * 0.17);
    }
}
