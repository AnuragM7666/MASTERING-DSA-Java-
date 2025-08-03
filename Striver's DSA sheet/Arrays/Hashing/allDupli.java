import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//this code finds all duplicate elements in an array
public class allDupli {
    public List<Integer> allDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int num : arr) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        allDupli ad = new allDupli();
        int[] arr = { 1, 2, 3, 2, 4, 5, 3, 6 };
        List<Integer> duplicates = ad.allDuplicates(arr);
        System.out.println(duplicates); 
    }
}
