import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int piecesOfCake = width * height;
        String input = scan.nextLine();

        while (!input.equals("STOP")) {
            int piecesTaken = Integer.parseInt(input);
            piecesOfCake -= piecesTaken;

            if (piecesOfCake < 0) {
                break;
            }

            input = scan.nextLine();
        }

        int leftPieces = Math.abs(piecesOfCake);

        if (piecesOfCake >= 0) {
            System.out.printf("%d pieces are left.", leftPieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", leftPieces);
        }

    }
}
