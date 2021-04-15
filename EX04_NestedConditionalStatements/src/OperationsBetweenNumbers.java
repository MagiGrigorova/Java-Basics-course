import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N1 = Integer.parseInt(scan.nextLine());
        int N2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        double result = 0.0;

        if (operator.equals("+")) {
            result = N1 + N2;
        } else if (operator.equals("-")) {
            result = N1 - N2;
        } else if (operator.equals("*")) {
            result = N1 * N2;
        } else if (operator.equals("/")) {     //result = N1 * 1.0 / N2;    при делене на "0" result = infinity
            if (N2 != 0) {
                result = N1 * 1.0 / N2;
                System.out.printf("%d %s %d = %.2f", N1, operator, N2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", N1);
            }
        } else if (operator.equals("%")) {
            if (N2 != 0) {
                result = N1 % N2;
                System.out.printf("%d %s %d = %.0f", N1, operator, N2, result);
            } else {
                System.out.printf("Cannot divide %d by zero", N1);
            }
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                System.out.printf("%d %s %d = %.0f - even", N1, operator, N2, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", N1, operator, N2, result);
            }
        }
    }
}

