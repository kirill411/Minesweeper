import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int twenty = 20;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isSumTwenty = a + b == twenty || a + c == twenty || b + c == twenty;
        System.out.println(isSumTwenty);
        scanner.close();
    }
}