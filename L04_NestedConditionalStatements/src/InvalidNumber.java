import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        boolean isValid = (number >= 100 && number <= 200) || number == 0;

        if (!isValid) {
            System.out.println("invalid");
        }
//        } else {
//            System.out.println("Valid"); --- ако условието е валидно
//        }
//
//        if (isValid) {
//            System.out.println("Valid"); --- ако условието е валидно, но не вкарваме отрицанието (!)
//        }

    }
}
