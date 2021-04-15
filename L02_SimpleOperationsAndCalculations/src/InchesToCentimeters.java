import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine(); // "3.66"
        double inches = Double.parseDouble(input); // 3.66
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
}
