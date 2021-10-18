//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int three = 3;
        String[] words = new String[three];

        for (int i = 0; i < three; i++) {
            words[i] = scanner.next();
        }

        for (int i = three - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }

        scanner.close();
    }
}