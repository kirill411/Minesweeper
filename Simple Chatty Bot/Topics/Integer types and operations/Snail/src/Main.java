import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte countDays = 0;
        byte tempHeight = 0;
        byte poleHeight = scanner.nextByte();
        byte perDay = scanner.nextByte();
        byte perNight = scanner.nextByte();

        while (tempHeight < poleHeight) {
            tempHeight += perDay;
            if (tempHeight < poleHeight) {
                tempHeight -= perNight;
            }
            countDays++;
        }

        System.out.println(countDays);

        scanner.close();
    }
}