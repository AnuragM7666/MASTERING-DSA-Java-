import java.util.PriorityQueue;

public class kthSmallkthLarge {
    public int kthSmallest(int[] arr, int k) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        for (int i = 0; i < k; i++) {
            ans = pq.poll();
        }
        return ans;

        //for kth largest, we can use a min-heap of size k
        // for (int num : arr) {
        //     pq.add(num);
        //     if (pq.size() > k) {
        //         pq.poll();
        //     }
        // }
        // return pq.peek(); // returns the kth largest element
    }
    public static void main(String[] args) {
        kthSmallkthLarge obj = new kthSmallkthLarge();
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int kthSmallest = obj.kthSmallest(arr, k);
        System.out.println("The " + k + "rd smallest element is: " + kthSmallest);
    }
}
