import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double worldRecordInSec = Double.parseDouble(scan.nextLine());
        double distanceInMeters = Double.parseDouble(scan.nextLine());
        double timeInSecFor1Meter = Double.parseDouble(scan.nextLine());

        // съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
        // Когато се изчислява колко пъти Иванчо ще се забави,
        // в резултат на съпротивлението на водата,
        // резултатът трябва да се закръгли надолу до най-близкото цяло число.

        double timeInSec = timeInSecFor1Meter * distanceInMeters;
        double delayInSec = Math.floor(distanceInMeters / 15) * 12.5;
        double sumOfTimeInSec = timeInSec + delayInSec;

        // •	Ако Иван е подобрил Световния рекорд отпечатваме:
        //o	" Yes, he succeeded! The new world record is {времето на Иван} seconds."
        //•	Ако НЕ е подобрил рекорда отпечатваме:
        //o	"No, he failed! He was {недостигащите секунди} seconds slower."
        //Резултатът трябва да се форматира до втория знак след десетичната запетая.

        if (sumOfTimeInSec < worldRecordInSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sumOfTimeInSec);
        } else if (sumOfTimeInSec >= worldRecordInSec) {
            double timeNeededToSucceed = sumOfTimeInSec - worldRecordInSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeNeededToSucceed);
        }

    }
}
