import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AgeChecking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        int option;

        do {
            System.out.println();
            System.out.println("-----------------");
            System.out.println("1. Check age");
            System.out.println("2. Quit");
            System.out.println();
            System.out.print("What you want to do?:");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1:
                    System.out.println("Age to check: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    if (age <= 13) {
                        System.out.println("Child");
                    } else if (age <= 18) {
                        System.out.println("Teenager");
                    } else {
                        System.out.println("Adult");
                    }
                    break;
                case 2:
                    break;
            }
        } while (option != 2);
    }
}
