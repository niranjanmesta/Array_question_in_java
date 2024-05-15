//Java Program to take input and print elements of array

import java.util.Scanner;

public class Print_element {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
         Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int n =sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter " +(n)+ " array elements: ");
      for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
     }
     System.out.println("Elements in array are: ");
     for(int i=0; i<n; i++) {
        System.out.println(arr[i]);
     }
    }
}