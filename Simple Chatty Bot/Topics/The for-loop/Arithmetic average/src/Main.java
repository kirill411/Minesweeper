import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int magicNumber = 3;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        int counter = 0;

        for (int i = a; i <= b; i++) {
            if (i % magicNumber == 0) {
                sum += i;
                counter++;
            }
        }

        float average = (float) sum / counter;
        System.out.println(average);
        scanner.close();
    }
}