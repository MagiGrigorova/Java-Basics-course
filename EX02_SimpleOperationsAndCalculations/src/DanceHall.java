import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sideL = Double.parseDouble(scan.nextLine());
        double sideW = Double.parseDouble(scan.nextLine());
        double sideA = Double.parseDouble(scan.nextLine());

        double areaOfTheHall = sideL * sideW * 10000;
        double areaOfTheWardrobe = sideA * sideA * 10000;
        double areaOfTheBench = areaOfTheHall / 10;
        double freeSpaceArea = areaOfTheHall - areaOfTheWardrobe - areaOfTheBench;
        double spaceForOnePerson = 40 + 7000;

        double numberOfPeople = freeSpaceArea / spaceForOnePerson;

        System.out.printf("%.0f", Math.floor(numberOfPeople));
    }
}
