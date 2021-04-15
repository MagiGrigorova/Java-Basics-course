import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int currentNumber = 1;
        boolean isReached = false;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(currentNumber + " ");
                if (currentNumber == n) {
                    isReached = true;
                    break;
                }
                currentNumber++;
            }
            System.out.println();
            if (isReached) {
                break;
            }
        }
    }
}
