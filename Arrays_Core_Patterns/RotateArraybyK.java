package Arrays_Core_Patterns;

import java.util.Scanner;

public class RotateArraybyK {
    static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    static void rotateByk(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
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

         System.out.print("Enter K: ");
        int k = sc.nextInt();

        rotateByk(arr, k);

        System.out.print("Reveresed Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
