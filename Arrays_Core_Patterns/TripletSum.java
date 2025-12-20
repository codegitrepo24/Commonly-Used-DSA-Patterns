package Arrays_Core_Patterns;

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    found = true;
                    break;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }

            }
            if (found) {
                break;
            }
        }

        if (!found) {

            System.out.println("No Triplet found.");
        }
        sc.close();
    }

}
