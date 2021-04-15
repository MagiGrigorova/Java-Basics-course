import java.util.Scanner;

public class Building2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floors = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());

        for (int floor = floors; floor > 0; floor--) {
            for (int room = 0; room < rooms; room++) {
                if (floor == floors) {
                    System.out.printf("L%d%d ", floor, room);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, room);
                } else {
                    System.out.printf("A%d%d ", floor, room);
                }
            }
            System.out.println();     // слагаме празен ред, за да може като излезе от 2рия цикъл, да премине на следващия ред
        }
    }
}
