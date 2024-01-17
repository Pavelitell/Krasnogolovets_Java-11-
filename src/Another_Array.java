import java.util.Scanner;

public class Another_Array {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num;
        System.out.println("Напишите число, оно будет конечным элементом и запустит массив:");
        num = myScanner.nextInt();

        int[] arr = new int[]{3, 8, 9, 12, 47, 55, 63, 72, 87, 7, 6, 18};
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = num;

        arr = newArr;

        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] % 3 == 0) {
                System.out.println(newArr[i]);
            }
        }
    }
}