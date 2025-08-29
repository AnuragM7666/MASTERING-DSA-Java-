//You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.

//Permute the characters of s so that they match the order that order was sorted.
// More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.

//Return any permutation of s that satisfies this property.
import java.util.HashSet;

public class customSortingString {
    public String CSS(String order, String s){
        HashSet<Character> set=new HashSet<>();

        StringBuilder ans=new StringBuilder();

        for(char c:order.toCharArray()){
            set.add(c);
        }

        for(char och:order.toCharArray()){
            for(char sch:s.toCharArray()){
                if(och==sch){
                    ans.append(sch);
                }
            }
        }
        for(char ch:s.toCharArray()){
            if(!set.contains(ch)){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        customSortingString solver = new customSortingString();
        if (args.length >= 2) {
            System.out.println(solver.CSS(args[0], args[1]));
            return;
        }

        String[][] tests = new String[][]{
            {"cba", "abcd"},      
            {"kqep", "pekeq"}     
        };

        for (String[] test : tests) {
            String order = test[0];
            String s = test[1];
            String result = solver.CSS(order, s);
            System.out.println(result);
        }
    }
}
