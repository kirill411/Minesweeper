import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int a = 5;
        final int b = 4;
        final int c = 3;
        final int d = 2;
        int countD = 0;
        int countC = 0;
        int countB = 0;
        int countA = 0;

        int students = scanner.nextInt();
        for (int i = students; i > 0; i--) {
            int grade = scanner.nextInt();
            if (grade == a) {
                countA++;
            }
            if (grade == b) {
                countB++;
            }
            if (grade == c) {
                countC++;
            }
            if (grade == d) {
                countD++;
            }
        }
        System.out.println(countD + " " + countC + " " + countB + " " + countA);
        scanner.close();
    }
}