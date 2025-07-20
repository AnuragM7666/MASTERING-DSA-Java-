public class sortedRotated {
    public static boolean search(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1 ? true : false;
    }
    public static void main(String[] args) {
        int[] arr1 = { 3, 4, 5, 1, 2 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println("Is arr1 sorted and rotated? : " + search(arr1)); 
        System.out.println("Is arr2 sorted and rotated? : " + search(arr2)); 
    }
}
