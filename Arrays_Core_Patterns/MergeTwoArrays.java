package Arrays_Core_Patterns;

import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array : ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.print("Enter " + n1 + " elements in 1st array: ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the size of 2nd array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];

        System.out.print("Enter " + n2 + " elements in 2nd array: ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int i = 0, j = 0;

        // Comapare elements from bot arrays
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(b[j] + " ");
                j++;
            }
        }

        // Remaining elements of first array
        while (i < a.length) {
            System.out.print(a[i] + " ");
            i++;
        }

        // Remaining elements of first array
        while (j < b.length) {
            System.out.print(b[j] + " ");
            j++;
        }

        System.out.println();
    }

}
