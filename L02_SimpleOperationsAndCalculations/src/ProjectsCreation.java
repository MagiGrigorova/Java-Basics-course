import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int numberOfProjects = Integer.parseInt(scan.nextLine());

        int totalHours = numberOfProjects * 3;

        //  "The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
        System.out.printf("The architect %s will need %d hours to complete %d project/s.%n", name, totalHours, numberOfProjects);
    }
}
