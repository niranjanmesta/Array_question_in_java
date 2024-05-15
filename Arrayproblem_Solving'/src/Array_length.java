import java.util.Scanner;

public class Array_length {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " +(n)+ " array elements: ");
        for(int i=0; i<n; i++) {
          arr[i] = sc.nextInt();
       }
       System.out.println("Elements in array are: ");
       System.out.println(arr.length);
    }
}
