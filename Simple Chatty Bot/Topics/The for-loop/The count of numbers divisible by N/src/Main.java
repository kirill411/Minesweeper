import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int divider = scanner.nextInt();

        int result = max / divider - (min - 1) / divider;
        System.out.println(result);
        scanner.close();
    }
}