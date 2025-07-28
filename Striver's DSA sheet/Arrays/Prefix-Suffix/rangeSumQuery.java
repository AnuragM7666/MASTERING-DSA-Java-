public class rangeSumQuery {
    private int[] prefix;
    public void sum(int[] arr){
        int n = arr.length;
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
    }

    public int sumRange(int l, int r) {
        if (l == 0)
            return prefix[r];

        return prefix[r] - prefix[l - 1];
    }
    public static void main(String[] args) {
        rangeSumQuery rsq = new rangeSumQuery();
        int[] arr = { 1, 2, 3, 4, 5 };
        rsq.prefix = new int[arr.length];
        rsq.sum(arr);

        System.out.println(rsq.sumRange(0, 2)); 
        System.out.println(rsq.sumRange(1, 3)); 
        System.out.println(rsq.sumRange(2, 4)); 
    }
}
