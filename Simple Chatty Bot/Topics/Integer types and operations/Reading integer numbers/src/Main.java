import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

        scanner.close();
    }
}