import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = Integer.parseInt(scan.nextLine());
        double bonusPoints = 0;

//•	Ако числото е до 100 включително, бонус точките са 5.
//•	Ако числото е по-голямо от 100, бонус точките са 20% от числото.
//•	Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
//
//•	Допълнителни бонус точки (начисляват се отделно от предходните):
//o	За четно число -> + 1 т.
//o	За число, което завършва на 5 -> + 2 т.

        if (score <= 100) {
            bonusPoints = 5;
        } else if (score > 1000) {
            bonusPoints = score * 0.10;
        } else {
            bonusPoints = score * 0.20;
        }

        if (score % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        } else if (score % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }
        System.out.println(bonusPoints);
        System.out.println(score + bonusPoints);
    }
}
