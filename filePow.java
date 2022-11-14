// Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя
// количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.io.*;

public class filePow {

    public static void main(String[] args) {
        int b = 3;
        int a = 2;
        String text = "b = " + b + "\na = " + a;
        try (FileOutputStream fos = new FileOutputStream("input.txt");
                PrintStream printStream = new PrintStream(fos)) {
            printStream.println(text);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.printf("It's done");
        try (FileOutputStream fos = new FileOutputStream("output.txt");
                PrintStream printStream = new PrintStream(fos)) {
            printStream.println(Math.pow(b, a));
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}