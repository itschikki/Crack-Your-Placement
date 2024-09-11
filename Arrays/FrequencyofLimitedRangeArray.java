//GFG 
//You are given an array arr[] containing positive integers. These integers can be from 1 to p, and some numbers may be repeated or absent. Your task is to count the frequency of all numbers that lie in the range 1 to n.
import java.util.*;
        
class FrequencyofLimitedRangeArray {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
               int feq = map.get(arr[i]);
                map.put(arr[i],feq+1);
            }
         }

         for(int i =0;i<arr.length;i++){
            if (map.containsKey(i+1)) {
            arr[i] = map.get(i+1);
            } else {
            arr[i] =0;
        }
         }   
}
public static void main(String[] args) {
    int array[]={10,10,1,1,2};
    frequencyCount(array, 5, 20);
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
}
}
