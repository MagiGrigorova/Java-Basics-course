import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        //        Напишете програма, която прочита от конзолата име, фамилия, възраст и град и печата съобщение от следния вид:
        //        "You are <firstName> <lastName>, a <age>-years old person from <town>."
        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();

        System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");
    }
}
