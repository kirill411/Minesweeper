import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int thousand = 1000;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 0; i < thousand; i++) {
            if (a * (i * i * i) + b * (i * i) + c * i + d == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}