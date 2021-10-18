import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int magicNumber = 4;
        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (input % magicNumber == 0 && result < input) {
                result = input;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}