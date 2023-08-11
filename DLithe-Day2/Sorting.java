import java.util.*;
public class Sorting {

    static int selectionSort(int arr,int n){
        for(int i=0;i<n-1;i++){
            int pos=0;
            int min = a[i];
            for(int j=i+1;j<n;j++){
                if(min>a[j]){
                    min = a[i];
                    pos=j;
                }
            }
            if(pos!=i){
                temp = a[pos];
                a[pos]=a[i];
                a[i]=temp;
            }
        }

         System.out.println("Array After Sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }


    // static int quickSort(int arr,int n){
        

    //      System.out.println("Array After Sorting");
    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i] + " ");
    //     }

    // }

    // static int insertionSort(int arr,int n){

    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Array Before Sorting");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(selectionSort(arr, n));

    }
}