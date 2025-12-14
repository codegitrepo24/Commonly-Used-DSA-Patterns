package Arrays_Core_Patterns;

import java.util.Scanner;

public class RotateArraybyOne {
    public static void rotateByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
            arr[arr.length - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rotateByOne(arr);

        System.out.print("Array after rotation by 1: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
