import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        final int four = 4;
        String[] words = new String[four];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < four; i++) {
            words[i] = scanner.next();
        }

        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}