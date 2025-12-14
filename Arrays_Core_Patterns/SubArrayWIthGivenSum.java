package Arrays_Core_Patterns;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayWIthGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sum of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements.");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        // HashMap used to staore prefixSum and index
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // Case 1: subarray from index 0
            if (prefixSum == target) {
                System.out.print("Subarray found from index 0 to " + i);
                found = true;
                break;
            }

            // case 2: subarray exists in between
            if (map.containsKey(prefixSum - target)) {
                int start = map.get(prefixSum - target) + 1;
                System.out.print("Subarray found from index " + start + " to " + i);
                found = true;
                break;
            }

            // Store prefix sum
            map.put(prefixSum, i);
        }

        if (!found) {
            System.out.println("No subarray with given sum found.");
        }

        sc.close();

    }
}
