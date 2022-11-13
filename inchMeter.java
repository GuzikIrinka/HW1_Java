// таблиuа перевода дюймов в метры. Выведите значения длины до
// 12 футов через каждый дюйм. После каждых 12 дюймов выведите пустую строку.
// (Один метр приблизительно равен 39,37 дюйма.)

/**
 * inchMeter
 */
public class inchMeter {
    public static void main(String args[]) {
        double meter, inch;
        int counter = 0;

        for (inch = 1; inch <= 144; inch++) {
            meter = inch * 39.37;
            System.out.println(inch + " inches is " + meter + "meters.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
