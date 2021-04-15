import java.util.Scanner;

public class TheOldLibrary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String favoriteBook = scan.nextLine();
        int libraryCapacity = Integer.parseInt(scan.nextLine());

        int bookCount = 0;
        boolean isFound = true;
        String currentBook = scan.nextLine();

        while (!currentBook.equals(favoriteBook)) {
            bookCount++;
            if (bookCount == libraryCapacity) {
                isFound = false;
                break;
            }
            currentBook = scan.nextLine();
        }

        if (isFound) {
            System.out.printf("You checked %d books and found it.", bookCount);
        } else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", bookCount);
        }


    }
}
