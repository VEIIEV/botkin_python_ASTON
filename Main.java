import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        // Read a string from stdin
        // ������� �1
        System.out.print("Enter your number: ");
        int number = new Scanner(System.in).nextInt();
        isNumberMoreThenSeven(number);

        // ������� �2
        System.out.print("������� ���: ");
        String name = new Scanner(System.in).nextLine();
        isNameCorrect(name);

        // ������� �3
        System.out.print("������� ������ �������: ");
        int length = new Scanner(System.in).nextInt();
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.print("������� ������� ������� #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        getMultiplesThree(array);

//   ������� �4
// # [((())()(())]] ���, ��� �� ���������
// # ������ ������������ ������������������
// # [((())()(()))]
    }

    private static void isNameCorrect(String name) {
        if (name.equals("��������")) {
            System.out.println("������, ��������");
        } else {
            System.out.println("��� ������ �����");
        }
    }


    public static void isNumberMoreThenSeven(int number) {
        if (number > 7) {
            System.out.println("������");
        }
    }

    public static void getMultiplesThree(int[] array) {
        for (int i : array) {
            if (i % 3 == 0 && i != 0) {
                System.out.println(i);
            }
        }
    }
}