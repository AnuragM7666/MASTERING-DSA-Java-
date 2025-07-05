public class minJumps {
    public int js(int[] arr) {
        int n = arr.length;
        int jumps = 0, currRange = 0, maxRange = 0;
        for (int i = 0; i < n - 1; i++) {
            maxRange = Math.max(maxRange, i + arr[i]);

            if (maxRange <= i)
                return -1;

            if (i == currRange) {
                jumps++;
                currRange = maxRange;

                if (currRange >= n - 1) {
                    break;
                }
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        minJumps mj = new minJumps();
        int[] arr = { 1, 4, 3, 2, 6, 7 };
        int result = mj.js(arr);
        System.out.println("Minimum jumps needed: " + result);
    }
}
