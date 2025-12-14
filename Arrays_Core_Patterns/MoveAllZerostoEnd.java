package Arrays_Core_Patterns;

import java.util.Scanner;

public class MoveAllZerostoEnd {
    public static void moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + "elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);

        System.out.println("Array after moving zeros: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();

    }
}
