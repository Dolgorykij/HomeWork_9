//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        {
            int[] monthlyExpenses = {35000, 29300, 41050, 29600, 32000};
            int sum = 0;
            for (int element : monthlyExpenses) {
                sum = sum + element;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        System.out.println("Задание 2");
        int [] weeklyExpenses = {4500, 5200, 3800, 9000, 6900};
        int maxExpenses = 0;
        int minExpenses = 999999999;
        for (int i = 0; i < weeklyExpenses.length; i++ ) {
            if (weeklyExpenses[i] > maxExpenses) {
                maxExpenses = weeklyExpenses[i];
            }
            if (weeklyExpenses[i] < minExpenses) {
                minExpenses = weeklyExpenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");

        System.out.println("Задание 3");
        {
            int[] monthlyExpenses2 = {32000, 35400, 28500, 29100, 41300};
            int sum = 0;
           for (int i : monthlyExpenses2) {
                sum = sum + i;
           }
            int mid = monthlyExpenses2.length;
            double sumMid = (double) sum / mid;
            System.out.println("Средняя сумма трат за месяц составила " + sumMid + " рублей");
        }
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}