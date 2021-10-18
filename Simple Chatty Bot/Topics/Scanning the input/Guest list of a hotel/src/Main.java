import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int eight = 8;
        String[] guests = new String[eight];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < eight; i++) {
            guests[i] = scanner.next();
        }

        for (int i = eight - 1; i >= 0; i--) {
            System.out.println(guests[i]);
        }

        scanner.close();
    }
}