import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfDogs = Integer.parseInt(scan.nextLine());
        int numberOfAnimals = Integer.parseInt(scan.nextLine());

        double priceForDogFood = numberOfDogs * 2.50;
        double priceForAnimalFood = numberOfAnimals * 4.00;

        double sum = priceForAnimalFood + priceForDogFood;

        System.out.printf("%.2f lv.", sum);
    }
}
