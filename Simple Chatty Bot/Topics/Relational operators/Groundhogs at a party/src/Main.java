import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int weekdayMin = 10;
        final int weekdayMax = 20;
        final int weekendMin = 15;
        final int weekendMax = 25;

        int reeseCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean weekdaySuccessParty = weekdayMin <= reeseCups && reeseCups <= weekdayMax && !isWeekend;
        boolean weekendSuccessParty = weekendMin <= reeseCups && reeseCups <= weekendMax && isWeekend;
        boolean successParty = weekdaySuccessParty || weekendSuccessParty;

        System.out.println(successParty);
    }
}