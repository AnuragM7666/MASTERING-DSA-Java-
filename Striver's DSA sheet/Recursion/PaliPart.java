//Given a string s, partition s such that every substring of the partition is a palindrome. 
//Return all possible palindrome partitioning of s.

import java.util.*;
public class PaliPart {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void getAllParts(String s, List<String> partitions, List<List<String>> ans) {
        if (s.length() == 0) {
            ans.add(new ArrayList<>(partitions));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            String parts = s.substring(0, i+1);
            if (isPalindrome(parts)) {
                partitions.add(parts);
                getAllParts(s.substring(i+1), partitions, ans);
                partitions.remove(partitions.size() - 1);
            }
        }
    }

    public List<List<String>> PalindromePartitions(String s) {
        List<String> partitions = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        getAllParts(s, partitions, ans);
        return ans;
    }
    public static void main(String[] args) {
        PaliPart pp = new PaliPart();
        String s = "aab";
        List<List<String>> result = pp.PalindromePartitions(s);
        System.out.println(result);
    }
}
