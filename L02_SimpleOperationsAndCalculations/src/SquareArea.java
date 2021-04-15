import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine(); // "6"
        int side = Integer.parseInt(input); // 6
        int area = side * side; // 36
        System.out.println(area);
    }
}
