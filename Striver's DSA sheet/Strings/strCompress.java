//Given an array of characters chars, compress it using the following algorithm:
//Begin with an empty string s. For each group of consecutive repeating characters in chars:
//If the group's length is 1, append the character to s.
//Otherwise, append the character followed by the group's length.
//The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
// Note that group lengths that are 10 or longer will be split into multiple characters in chars.
//After you are done modifying the input array, return the new length of the array.
//You must write an algorithm that uses only constant extra space.
public class strCompress {
    public static String StringCompression(char[] chars){
        int n=chars.length;
        int idx=0;

        for(int i=0; i<n;i++){
            char ch=chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                chars[idx]=ch;
                idx++;
            }
            else{
                chars[idx]=ch;
                idx++;

                String str=Integer.toString(count);
                for(char digit:str.toCharArray()){
                    chars[idx]=digit;
                    idx++;
                }
            }
            i--;
        }
        return new String(chars,0,idx);
    }
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b','a', 'c', 'c', 'c'};
        String compressed = StringCompression(chars);
        System.out.println(compressed); 
    }
}
