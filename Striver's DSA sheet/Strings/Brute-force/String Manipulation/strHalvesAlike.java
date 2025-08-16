//this is a java program to check if the halves of a string are alike
//it checks if the number of vowels in the first half is equal to the number of vowels in the second half
//if length of string is odd, then the middle character is not considered as a vowel
class strHalvesAlike {
    public boolean halvesAreAlike(String S) {
        String s=S.toLowerCase();

        int mid=s.length()/2;

        String s1=s.substring(0,mid);
        String s2=s.substring(s.length()-mid);

        int c1=0;
        int c2=0;

        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                c1++;
            }
        }
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                c2++;
            }
        }
        return c1==c2;
    }
    public static void main(String[] args) {
        strHalvesAlike obj=new strHalvesAlike();
        System.out.println(obj.halvesAreAlike("book"));

        System.out.println(obj.halvesAreAlike("eclipse"));
    }
}