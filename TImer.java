public class Timer {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter seconds for the timer:");

        java.util.Scanner input = new java.util.Scanner(System.in);
        int seconds = input.nextInt();

        System.out.println("Timer started...");

        Thread.sleep(seconds * 1000); // Waits in milliseconds

        System.out.println("Time's up!");

        input.close();
    }
}
