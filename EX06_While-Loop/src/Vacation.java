import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scan.nextLine());
        double currentMoney = Double.parseDouble(scan.nextLine());

        int totalDaysCount = 0;
        int daysSpent = 0;


        while (neededMoney > currentMoney) {
            String command = scan.nextLine();
            double dayMoney = Double.parseDouble(scan.nextLine());
            totalDaysCount++;

            if (command.equals("save")) {
                currentMoney += dayMoney;
                daysSpent = 0;
            } else if (command.equals("spend")) {
                currentMoney -= dayMoney;   // currentMoney = Math.max(0, currentMoney - dayMoney); ->
                if (currentMoney < 0) {     // -> Math.max ще вземе максимума от двете стойности:
                    currentMoney = 0;       //   0 или разликата между 2те променливи
                }
                daysSpent++;
            }

            if (daysSpent == 5) {
                break;
            }
        }

        if (neededMoney <= currentMoney) {
            System.out.printf("You saved the money for %d days.", totalDaysCount);
        } else {
            System.out.println("You can't save the money.");
            System.out.println(totalDaysCount);
        }
    }
}
