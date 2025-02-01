import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int[] payments = {25000, 20000, 15500, 11500, 5500};
        int summa = 0;
        for (int amount2: payments) {
            summa += amount2;
        }
            System.out.println("Сумма трат за месяц составила " + summa + "рублей");


        System.out.println();

        System.out.println("Task 2");
        int[] weekend = {6000, 5000, 4000, 3000, 2000};
        int amount = -1;
        int amount2= 1;
        int i3 = 0;
        for (int i = 1; i < weekend.length; i++) {
            if (weekend[i] > amount) {
                amount = weekend[i];
            }
            if (weekend[i] < amount2) {
                amount = weekend[i];
            }

                System.out.println("Минимальная сумма трат за неделю составила"+ amount2 +"рублей");
            System.out.println("Максимальная сумма трат за неделю составила"+ amount+ "рублей");

            System.out.println("Task 3");


            {
                double[] payments2 = {25000, 20000, 15500, 11500, 5500};
                int sum = 0;
                for (int i1 = 0; i < payments2.length; i++) {
                    sum += payments2[i];
                    sum = sum / 5;

                }
                System.out.print("Средняя сумма трат за месяц составила" + sum + "рублей");

                System.out.println();
                System.out.println("Task4");

                char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int i4 = 0; i < reverseFullName.length - 1; i++) {
                    int temp = reverseFullName[i];
                    reverseFullName[i] = reverseFullName[i + 1];
                    System.out.println(reverseFullName[i]);
                }

            }

        }
    }
}








