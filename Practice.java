import java.util.Random;
import java.util.Queue;
import java.util.*;
public class Practice{
    public static void main(String[]args){
        System.out.println("Wake up Mr. West");
        Random rn = new Random();
        int[] arr= new int[5];
        int temp=0;
        int[] h= new int[arr.length];
        for (int i=0; i<5; i++){
            arr[i]=rn.nextInt(100);
            temp =  arr[i];
            arr[i] = h[h.length-1];
            h[h.length-1]=temp;
            System.out.println(arr[i]);
        }
        int ans = BinarySearch(arr, arr[4]);
        System.out.println("Found: "+ ans);
        //mergeSort(arr, h, 0, 5);
        linkedQueue();

        int[] array= {3,1,2,3,4,3,5,6,3};
        quicksort(array,0,array.length-1);

    }

    public static void quicksort(int[] array, int left, int right){
        if(left<right){
            int pivot = partition(array,left,right);
            quicksort(array, left, pivot+1, right);
        }
    }

    public static int partition(int[] array, int left, int right){
        int pivot= array[right];
        int i = left - 1;
        for(int j= left; j<right; j++){
            if(array[j]<pivot){
                i++;
                int temp=array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[right];
        array[right] = temp;
        return i+1;
    }
    
    public static void mergeSort(int[] array, int[] helper, int low, int high){
        if(low< high){
            int middle= low+(high-low)/2;
            mergeSort(array, helper, low, middle);
            mergeSort(array, helper, middle+1, high);
            merge(array, helper, low, middle, high);
        }
    }
    public static void merge(int[] array,int[] helper, int low, int middle, int high){
        for(int i=low; i <= high; i++){
            helper[i] = array[i];
        }
        int hLeft = low;
        int hRight = middle+1;
        int current = low; 

        while(hLeft <= middle && hRight<= high){
            if (helper[hLeft] <= helper[hRight]){
                array[current] = helper[hLeft];
                hLeft++;
            }
            else{
                array[current] = helper[hRight];
                hRight++;
            }
            current++;
        }
        int remaining = middle - hLeft;
        for (int i = 0 ; i<= remaining; i++){
            array[current + 1] = helper[hLeft + i];
        }

        for(int i= 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int BinarySearch(int[] array, int x){
        int low = 0;
        int high = array.length -1;
        int mid;
        while(low <= high){
            mid = low + (high-low)/2;
            if (array[mid] < x){
                low = mid + 1;
            }
            else if (array[mid] > x){
                high = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void linkedQueue(){
        Queue myQueue = new Queue();
        myQueue.enqueue("Jim");
        myQueue.enqueue("Jess");
        myQueue.enqueue("Jill");
        myQueue.enqueue("Jane");
        String name = myQueue.dequeue();
        myQueue.enqueue(name);
        myQueue.enqueue(myQueue.Front.key);
        System.out.println("Front"+myQueue.Front.key);
    }
}