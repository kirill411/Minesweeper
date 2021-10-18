import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean inAscending = h1 <= h2 && h2 <= h3;
        boolean inDescending = h1 >= h2 && h2 >= h3;
        boolean inOrder = inAscending || inDescending;

        System.out.println(inOrder);
        scanner.close();
    }
}