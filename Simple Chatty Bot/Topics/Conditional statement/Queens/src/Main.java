import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean onX = x1 == x2;
        boolean onY = y1 == y2;
        boolean onDiagonal = Math.abs(x1 - x2) == Math.abs(y1 - y2);

        if (onX || onY || onDiagonal) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}