import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        double p1 = 0.0;   //задавамe стойностите на "p" в "double", за да може после да се преобразуват в проценти - "double"
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;

        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scan.nextLine());
            if (current < 200) {
                p1 += 1;
            } else if (current < 400) {
                p2 += 1;
            } else if (current < 600) {
                p3 += 1;
            } else if (current < 800) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        p1 = p1 / n * 100;
        p2 = p2 / n * 100;
        p3 = p3 / n * 100;
        p4 = p4 / n * 100;
        p5 = p5 / n * 100;

        System.out.printf("%.2f%%%n", p1);   // слагаме %% в средата, за да се прочете след това като % , след това имаме %n за нов ред
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
