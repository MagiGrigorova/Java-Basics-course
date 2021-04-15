import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeOfProjection = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        double price = 0;

        if (typeOfProjection.equals("Premiere")) {
            price = 12.00;
        } else if (typeOfProjection.equals("Normal")) {
            price = 7.50;
        } else if (typeOfProjection.equals("Discount")) {
            price = 5.00;
        }

        double income = price * rows * columns;
        System.out.printf("%.2f leva", income);

    }
}
