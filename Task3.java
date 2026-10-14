import java.util.Scanner;

// Task 3: Leap year checker
// Non-century years: leap if divisible by 4.
// Century years: leap only if divisible by 400.
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year (366 days).");
        } else {
            System.out.println(year + " is a non-leap year (365 days).");
        }

        sc.close();
    }
}
