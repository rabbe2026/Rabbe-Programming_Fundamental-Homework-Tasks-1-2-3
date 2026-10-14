import java.util.Scanner;

// Task 1: Olympic year checker
// First Summer Olympics: Athens, 1896 (edition 1). One edition every 4 years.
// Cancelled Games (1916, 1940, 1944) still keep their edition number.
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int FIRST_OLYMPIC_YEAR = 1896;

        System.out.print("Enter a year: ");
        int m = sc.nextInt();

        if (m >= FIRST_OLYMPIC_YEAR && (m - FIRST_OLYMPIC_YEAR) % 4 == 0) {
            int edition = (m - FIRST_OLYMPIC_YEAR) / 4 + 1;
            System.out.println(m + " is an Olympic year.");
            System.out.println("Edition number: " + edition);
        } else {
            System.out.println(m + " is not an Olympic year.");
        }

        sc.close();
    }
}
