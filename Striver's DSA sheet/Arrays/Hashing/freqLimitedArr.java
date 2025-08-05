import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// this code counts the frequency of elements in an array limited to the range 1-5
// and returns a list of their frequencies
public class freqLimitedArr {
    public List<Integer> freqLimited(int[] arr) {
        HashMap<Integer, Integer> fMap = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : arr) {
            if (num >= 1 && num <= 5) {
                fMap.put(num, fMap.getOrDefault(num, 0) + 1);
            }
        }

        for (int i = 1; i <= 5; i++) {
            ans.add(fMap.getOrDefault(i, 0));
        }
        return ans;
    }
    public static void main(String[] args) {
        freqLimitedArr fla = new freqLimitedArr();
        int[] arr = { 1, 2, 3, 2, 4, 5, 3 };
        List<Integer> frequencies = fla.freqLimited(arr);
        System.out.println(frequencies);
    }
}
