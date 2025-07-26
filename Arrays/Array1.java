import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enetr the length of an array");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<=arr.length-1;i++){//this is to accepting the string of array
            arr[i]=sc.nextInt();
           

        }
         for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);//this is to print string of and array
           

        }
        
    }
}