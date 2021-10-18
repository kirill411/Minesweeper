import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String ref = "J";
        String input = scanner.next();
        System.out.println(ref.equalsIgnoreCase(input.substring(0, 1)));
        scanner.close();
    }
}