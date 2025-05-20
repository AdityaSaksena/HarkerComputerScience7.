import java.util.Scanner;

public class SImpleTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of seconds
        System.out.print("Enter the number of seconds for the timer: ");
        int seconds = scanner.nextInt();

        System.out.println("Timer started...");

        // Wait for the given number of seconds
        try {
            Thread.sleep(seconds * 1000); // sleep expects milliseconds
        } catch (InterruptedException e) {
            System.out.println("The timer was interrupted.");
        }

        System.out.println("Time's up!");

        scanner.close();
    }
}