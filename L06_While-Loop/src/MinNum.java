import java.util.Scanner;

public class MinNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int min = Integer.MAX_VALUE;

        int i = 0;

        while (i < n) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber < min) {
                min = currentNumber;
            }
            i++;
        }
        System.out.println(min);
    }
}
