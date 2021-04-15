import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int max = Integer.MIN_VALUE;

        int i = 0;

        while (i < n) {
            int currentNumber = Integer.parseInt(scan.nextLine());
            if (currentNumber > max) {
                max = currentNumber;
            }
            i++;
        }
        System.out.println(max);
    }

}
