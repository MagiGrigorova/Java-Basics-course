import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double income = Double.parseDouble(scan.nextLine());
        double avgGrade = Double.parseDouble(scan.nextLine());
        double minSalary = Double.parseDouble(scan.nextLine());

        double excellentResultScholarship = 0.0;
        double socialScholarship = 0.0;

        if (avgGrade >= 5.50) {
            excellentResultScholarship = avgGrade * 25;
        }
        if (income < minSalary && avgGrade > 4.50) {
            socialScholarship = minSalary * 0.35;
        }

        if (excellentResultScholarship == 0 && socialScholarship == 0) {
            System.out.println("You cannot get a scholarship!");
        } else if (excellentResultScholarship >= socialScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentResultScholarship));
        } else if (socialScholarship > excellentResultScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
        }
    }
}
