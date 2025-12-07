
import java.util.Scanner;

public class BinarySearch {
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

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == t) {
                found = true;
                break;
            } else if (arr[mid] < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Found?: " + found);
        sc.close();
    }
}
