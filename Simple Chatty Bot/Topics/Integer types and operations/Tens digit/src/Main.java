import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ten = 10;
        final int hundred = 100;

        int n = scanner.nextInt();

        System.out.println(n % hundred / ten);
    }
}