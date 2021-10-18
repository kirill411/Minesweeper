import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int three = 3;
        final int five = 5;
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % three == 0 && i % five == 0) {
                System.out.println("FizzBuzz");
            } else if (i % three == 0) {
                System.out.println("Fizz");
            } else if (i % five == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}