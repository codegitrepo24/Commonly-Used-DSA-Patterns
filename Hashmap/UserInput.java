package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.put(name, marks);
        }

        System.out.print("Search student name: ");
        String key = sc.nextLine();

        if(students.containsKey(key)){
            System.out.println("Marks = " + students.get(key));
        }else{
            System.out.println("Student not found.");
        }
        sc.close();
    }
}
