import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isTriangleValid = a + b > c && a + c > b && b + c > a;

        if (isTriangleValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}