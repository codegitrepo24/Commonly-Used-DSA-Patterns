package  Arrays_Core_Patterns;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int t = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int rem = t - arr[i];
            if (map.containsKey(rem)) {
                System.out.print("Indices: " + map.get(rem) + ", " + i);
                return;
            }
            map.put(arr[i], i);

        }
        System.out.print("No pair found.");
        sc.close();
    }
}
