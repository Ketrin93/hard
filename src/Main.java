import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        int[] payments = {25000, 20000, 15500, 11500, 5500};
        int summa = 0;
        for (int amount : payments) {
            summa += amount;
        }
        System.out.println("Сумма трат за месяц составила " + summa + "рублей");


        System.out.println("Task 2");
        int[] weekend = {6000, 5000, 4000, 3000, 2000};
        int minAmount = -1;
        int maxAmount = 1;
        for (int i = 1; i < weekend.length; i++) {
            if (weekend[i] > minAmount) {
                minAmount = weekend[i];
            }
            if (weekend[i] < maxAmount) {
                maxAmount = weekend[i];
            }

            System.out.println("Минимальная сумма трат за неделю составила" + maxAmount + "рублей");
            System.out.println("Максимальная сумма трат за неделю составила" + minAmount + "рублей");


            System.out.println("Task 3");

            double[] payments2 = {25000, 20000, 15500, 11500, 5500};
            int sum = 0;
            for (int i1 = 0; i < payments2.length; i++) {
                sum += payments2[i];
                sum = sum / payments2.length;
            }
            System.out.print("Средняя сумма трат за месяц составила - " + sum + "рублей");
        }
        System.out.println();
            System.out.println("Task 4");

            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1;i>=0; i--) {
                System.out.print(reverseFullName[i]);
            }
                System.out.println();
                int n = reverseFullName.length;
                char temp;
                for (int i=0; i< n /2;i++) {
                    temp = reverseFullName[n - i - 1];
                    reverseFullName[n - i - 1] = reverseFullName[i];
                    reverseFullName[i] = temp;
                }
                 System.out.println(Arrays.toString(reverseFullName));

                 System.out.println(reverseFullName);

                }
            }













