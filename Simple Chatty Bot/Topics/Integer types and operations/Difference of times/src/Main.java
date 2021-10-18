import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int secondInHour = 3600;
        final int secondsInMinute = 60;

        int hoursDay1 = scanner.nextByte();
        int minutesDay1 = scanner.nextByte();
        int secondsDay1 = scanner.nextByte();

        int hoursDay2 = scanner.nextByte();
        int minutesDay2 = scanner.nextByte();
        int secondsDay2  = scanner.nextByte();

        int totalSecDay1 = hoursDay1 * secondInHour + minutesDay1 * secondsInMinute + secondsDay1;
        int totalSecDay2 = hoursDay2 * secondInHour + minutesDay2 * secondsInMinute + secondsDay2;

        System.out.println(totalSecDay2 - totalSecDay1);

        scanner.close();
    }
}