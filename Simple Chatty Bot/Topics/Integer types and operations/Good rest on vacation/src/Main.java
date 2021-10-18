import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int foodPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightInHotel = scanner.nextInt();

        System.out.println(days * foodPerDay + flightCost * 2 + nightInHotel * (days - 1));

        scanner.close();
    }
}