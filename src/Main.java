import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int[] payments = {25000, 20000, 15500, 11500, 5500};
        int summa = 0;
        int i2=0;
        for (int i= 0; i <payments.length;i++); {
            summa += payments[i2];
            System.out.println("Сумма трат за месяц составила " + summa + "рублей");

        }
        System.out.println();

        System.out.println("Task 2");
        int[] weekend = {6000, 5000, 4000, 3000, 2000};
        int minAmount = weekend[0];
        int maxAmount = weekend[0];

        for (int i = 1; i < weekend.length; i++) {
            if (weekend[i] < minAmount) {
                minAmount = weekend[i];
            }
            if (weekend[i] < maxAmount) {
                maxAmount = weekend[i];
                System.out.println("Минимальная сумма трат за неделю составила " + minAmount + " рублей.");
                System.out.println("Максимальная сумма трат за неделю составила " + maxAmount + " рублей.");
            }
        }
        System.out.println("Task 3");
        double[] payments2 = {25000, 20000, 15500, 11500, 5500};
        int month = 30 / 7;
        double expenses = summa / month;
        System.out.print(" Средняя сумма трат за месяц составила" + expenses + " рублей");
        System.out.println();
        System.out.println("Task4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char name2 =0;
        for(int i1 = reverseFullName.length - 1; i1 >= 0; i1--)
        System.out.print(reverseFullName[i1]);

    }
}






