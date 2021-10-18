import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short desksRequired;
        short studentsInClass1 = scanner.nextShort();
        short studentsInClass2 = scanner.nextShort();
        short studentsInClass3 = scanner.nextShort();

        desksRequired = (short) (studentsInClass1 / 2 + studentsInClass1 % 2
                                + studentsInClass2 / 2 + studentsInClass2 % 2
                                + studentsInClass3 / 2 + studentsInClass3 % 2);

        System.out.println(desksRequired);

        scanner.close();
    }
}