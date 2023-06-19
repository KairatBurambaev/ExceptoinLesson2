// Задание 1
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        float number = readFloat();
//        System.out.println("Вы ввели число: " + number);
//    }
//    public static float readFloat() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите дробное число: ");
//        try {
//            float number = scanner.nextFloat();
//            return number;
//        } catch (Exception e) {
//            System.out.println("Ошибка: неверный формат числа. Пожалуйста, введите число в формате X.X");
//            return readFloat();
//        }
//    }
//}

// Задание 2 ошибки нет

// Задание 3
//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            if (b != 0) {
//                System.out.println(a / b);
//            } else {
//                System.out.println("Нельзя делить на ноль!");
//            }
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            if (abc.length >= 4) {
//                abc[3] = 9;
//            } else {
//                System.out.println("Размер массива недостаточен!");
//            }
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }
//}

// Задание 4

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input;

    do {
        System.out.print("Введите что-нибудь: ");
        input = scanner.nextLine().trim();
    } while (input.isEmpty());

    System.out.println("Вы ввели: " + input);
}
}