import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        // Read a string from stdin
        // Задание №1
        System.out.print("Enter your number: ");
        int number = new Scanner(System.in).nextInt();
        isNumberMoreThenSeven(number);

        // Задание №2
        System.out.print("Введите имя: ");
        String name = new Scanner(System.in).nextLine();
        isNameCorrect(name);

        // Задание №3
        System.out.print("Введите размер массива: ");
        int length = new Scanner(System.in).nextInt();
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            System.out.print("Введите элемент массива #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        getMultiplesThree(array);

//   Задание №4
// # [((())()(())]] нет, она не правильна
// # Пример исправленной последовательности
// # [((())()(()))]
    }

    private static void isNameCorrect(String name) {
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }


    public static void isNumberMoreThenSeven(int number) {
        if (number > 7) {
            System.out.println("Привет");
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