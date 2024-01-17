import java.util.Scanner;
public class Main {
    public static boolean FunctionOfInput(String str) {
        return str.matches("-?\\d+(\\s+-?\\d+)*");
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int Number = 7;
        String Name = "Вячеслав";

        int userChoice;
        do {
            System.out.println("Введите число: ");
            userChoice = myScanner.nextInt();
            myScanner.nextLine();
            if (userChoice <= Number) {
                System.out.println();
            }
        } while (userChoice <= Number);

        System.out.println("Привет");

        String userChoice2;
        do {
            System.out.println("Введите имя: ");
            userChoice2 = myScanner.nextLine();
            if (!userChoice2.equals(Name)) {
                System.out.println("Нет такого имени");
            }
        } while (!userChoice2.equals(Name));
        System.out.println("Привет, Вячеслав.");

        System.out.println("Введите числа через пробел: ");
        String userInput = myScanner.nextLine();
        if (FunctionOfInput(userInput)) {
            String[] input = userInput.split(" ");

            int[] array = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                array[i] = Integer.parseInt(input[i]);
                if (array[i] % 3 == 0) {
                    System.out.println(array[i]);
                }
            }
        } else {
            System.out.println("Кроме чисел я ничего не добавил.");
        }
    }
}




