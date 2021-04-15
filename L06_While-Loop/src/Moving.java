import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int volume = length * width * height;

        String input = scan.nextLine();

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            volume = volume - boxes;   // обемът на свободното място ще намалява всеки път с обема на кутиите
            if (volume < 0) {
                break;
            }
            input = scan.nextLine();
        }

        if (volume < 0) {
            int spaceNeeded = Math.abs(volume);
            System.out.printf("No more free space! You need %d Cubic meters more.", spaceNeeded);
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}
