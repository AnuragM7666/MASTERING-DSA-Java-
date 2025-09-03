public class countInversion {
    public int merge(int[] arr, int st, int mid, int end){
        int n1=mid-st+1;
        int n2=end-mid;

        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[st+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=st;
        int count=0;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
                count+=n1-i;
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
        return count;
    }
    public int mergeSort(int[] arr, int st,int end){
        int mid=st+(end-st)/2;

        int count=0;
        if(st<end){
            count+=mergeSort(arr, st, mid);
            count+=mergeSort(arr, mid+1, end);
            count+=merge(arr, st, mid, end);
        }
        return count;
    }
    public int inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length-1);
        //brute force
        // int n = arr.length;
        // int count = 0;
        // for (int i = 0; i < n-1; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         if (arr[i] > arr[j]) {
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 5 };
        countInversion obj = new countInversion();
        int result = obj.inversionCount(arr);
        System.out.println(result);
    }
}
