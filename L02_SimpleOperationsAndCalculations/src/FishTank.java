import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //        От конзолата се четат 4 реда:
//        1.	Дължина в см – цяло число в интервала [10 … 500]
//        2.	Широчина в см – цяло число в интервала [10 … 300]
//        3.	Височина в см – цяло число в интервала [10… 200]
//        4.	Процент  – реално число в интервала [0.000 … 100.000]

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

//        Трябва да се пресметне колко литра вода ще събира аквариума,
//        ако се знае, че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа.
//        Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.

//        Да се отпечата на конзолата едно число:
//•	литрите вода, които ще  събира аквариума, форматирани до третия знак след десетичната запетая.

        int totalVolumeOfTankInCubicCm = length * width * height;
        double totalVolumeOfTankInLiters = totalVolumeOfTankInCubicCm * 0.001;
        double percentWDP = percent * 0.01;
        double tankWaterVolume = totalVolumeOfTankInLiters - totalVolumeOfTankInLiters * percentWDP;

        System.out.printf("%.3f", tankWaterVolume);
    }
}
