import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int totalSteps = 0;

        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            totalSteps += steps;

            if (totalSteps >= 10000) {
                break;
            }
            input = scan.nextLine();
        }

        if (input.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scan.nextLine());
            totalSteps += stepsToHome;
        }

        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            int neededSteps = 10000 - totalSteps;
            System.out.printf("%d more steps to reach goal.", neededSteps);
        }


    }
}
