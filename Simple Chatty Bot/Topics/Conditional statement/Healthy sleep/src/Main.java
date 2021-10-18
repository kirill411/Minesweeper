import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        boolean isNormal = a <= h && h <= b;
        boolean isExcess = b < h;

        if (isNormal) {
            System.out.println("Normal");
        } else if (isExcess) {
            System.out.println("Excess");
        } else {
            System.out.println("Deficiency");
        }
        scanner.close();
    }
}