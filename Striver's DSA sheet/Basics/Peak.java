//Given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist). If there are multiple peak elements, return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
//
//Note: Consider the element before the first element and the element after the last element to be negative infinity.
public class Peak {
    public int peakElement(int[] arr){
        int n=arr.length;

        if(n==1 || arr[0]>arr[1]){
            return 0;
        }

        if(arr[n-1]>arr[n-2]){
            return n-1;
        }

        for(int i=1; i< arr.length-1; i++){
            if(arr[n]>arr[n-1] || arr[n]>arr[n+1]){
                return i;
            }
        }
        return -1;
    }
}
