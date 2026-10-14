import java.util.Scanner;

// Task 2: Digital clock - time after one second
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0-23): ");
        int h = sc.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int m = sc.nextInt();
        System.out.print("Enter seconds (0-59): ");
        int s = sc.nextInt();

        // Add one second and carry over to minutes/hours
        s++;
        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            m = 0;
            h++;
        }
        if (h == 24) {
            h = 0;
        }

        System.out.println("After one second: h = " + h + ", m = " + m + ", s = " + s);
        System.out.printf("Clock shows: %02d:%02d:%02d%n", h, m, s);

        sc.close();
    }
}
