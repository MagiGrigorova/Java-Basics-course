import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inputNumber = Double.parseDouble(scan.nextLine());
        String inputUnit = scan.nextLine();
        String outputUnit = scan.nextLine();

        double tempInMM = 0;

        if (inputUnit.equals("mm")) {
            tempInMM = inputNumber;
        } else if (inputUnit.equals("m")) {
            tempInMM = inputNumber*1000;
        } else if (inputUnit.equals("cm")) {
            tempInMM = inputNumber*10;
        }

        double result = 0;

        if (outputUnit.equals("m")) {
            result = tempInMM/1000;
        } else if (outputUnit.equals("cm")) {
            result = tempInMM / 10;
        } else if (outputUnit.equals("mm")) {
            result = tempInMM;
        }

        System.out.printf("%.3f", result);
    }
}
