import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int five = 5;
        String[] words = new String[five];

        for (int x = 0; x < five; x++) {
            words[x] = scanner.next();
        }
        
        for (String word : words) {
            System.out.println(word);
        }

        // It is important to close Scanner, so it won't occupy resources.
        scanner.close();
    }
}
