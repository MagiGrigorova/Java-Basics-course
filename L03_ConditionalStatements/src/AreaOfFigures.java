import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = scan.nextLine();

//        "square", "rectangle", "circle" или "triangle"
        double area = 0;

        if (figure.equals("square")) {
            double side = Double.parseDouble(scan.nextLine());
            area = side*side;

        } else if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(scan.nextLine());
            double sideB = Double.parseDouble(scan.nextLine());
            area = sideA * sideB;

        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scan.nextLine());
            area = Math.PI * r * r;

        } else if (figure.equals("triangle")) {
            double sideA = Double.parseDouble(scan.nextLine());
            double heightA = Double.parseDouble(scan.nextLine());
            area = sideA * heightA/2;
        }

        System.out.printf("%.3f", area);
    }
}
