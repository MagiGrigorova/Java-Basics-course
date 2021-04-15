import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());

        for (int f = floors; f >= 1; f--) {
            for (int r = 0; r < rooms; r++) {
                if (f == floors) {
                    if (r == rooms - 1) {
                        System.out.printf("L%d%d%n", f, r);
                    } else {
                        System.out.printf("L%d%d ", f, r);
                    }
                } else if (f % 2 == 0) {
                    if (r == rooms - 1) {
                        System.out.printf("O%d%d%n", f, r);
                    } else {
                        System.out.printf("O%d%d ", f, r);
                    }
                } else {
                    if (r == rooms - 1) {
                        System.out.printf("A%d%d%n", f, r);
                    } else {
                        System.out.printf("A%d%d ", f, r);
                    }
                }
            }
        }
    }
}
