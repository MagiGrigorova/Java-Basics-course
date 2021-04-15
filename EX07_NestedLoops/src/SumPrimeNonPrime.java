import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int primeSum = 0;
        int nonPrimeSum = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            boolean isPrime = true;               //слагаме boolean тук, за да може да се обновява на true всеки път, когато влезе в цикъла (иначе си стои със стойност false,ако сме влязи в тази проверка)
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scan.nextLine();  // трябва да си обновим променливата, иначе ще влезем в безкраен цикъл (ще се връщаме в while с едно и също отрицателно число)
                continue;      // когато стигнем до continue се връщаме в началото на while цикъла
            }

            for (int i = 2; i < number; i++) {    //едно число е просто, когато се дели само на себе си и на 1! - затова започваме цикъла от 2 до < от числото
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeSum += number;
            } else {
                nonPrimeSum += number;
            }

            input = scan.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);

    }
}
