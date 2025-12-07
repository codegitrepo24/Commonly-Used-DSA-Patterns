import java.util.Scanner;

public class LinearSearch {
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

        boolean found = false;
        for (int num : arr) {
            if (num == t) {
                found = true;
                break;
            }
        }
        System.out.println("Found? " + found);

        sc.close();
    }
}
