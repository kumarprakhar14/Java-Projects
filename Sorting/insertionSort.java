package Sorting;

public class insertionSort {
    public static void printArray(int arr[]){
        System.out.println("Sorted array is:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        //insertion sort
        //time complexity = n^2

        for(int i=1; i<arr.length; i++){
            int currentElement = arr[i];
            int j = i-1;
            while(j>=0 && currentElement<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = currentElement;
        }
        printArray(arr);
}
}
