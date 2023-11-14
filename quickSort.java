import java.util.Scanner;

public class quickSort {
    public static void quickSort(int arr[], int low, int high){
        if(low<high){
            int pi = partion(arr, low, high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
            
        }
    }
    public static int partion(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("enter an unsorted array of size 6");

        //intput
        for(int i=0; i<6; i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;

        quickSort(arr, 0, n-1);

        //print
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
