import java.util.Scanner;

public class DemoTrials {
    public static void main(String[] args) {
//        int a= 5;
//        int b = 10;
//        System.out.println(a < b); // true
//        System.out.println(b==2*5); // true

//        String a = "Example";
//        String b = a;
//        System.out.println(a == b); // true

//        Scanner scan = new Scanner(System.in);
//        String a = scan.nextLine();
//        String b = scan.nextLine();
//        System.out.println(a==b); // false - сравняваме текст с "equals"
//        System.out.println(a.equals(b)); // true

//        String color = "red";
//        if (color.equals("red")) {
//            System.out.println("tomato");
//        } else {
//            System.out.println("banana");
//            System.out.println("bye");
//        }

        Scanner scan = new Scanner(System.in);

        String currentDay = scan.nextLine();
        double salary = 0.0;

        if (currentDay.equals("Monday")) {
            salary = Double.parseDouble(scan.nextLine()); //1000
        } else if (currentDay.equals("Friday")) {
            salary =  Double.parseDouble(scan.nextLine()); //500
        }
        System.out.println(salary);

    }
}
