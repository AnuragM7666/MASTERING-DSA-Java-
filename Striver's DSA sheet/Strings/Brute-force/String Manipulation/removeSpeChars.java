// This Java program removes special characters from each string in an array.
// It retains only alphanumeric characters and returns a new array with the cleaned strings.
import java.util.Arrays;

public class removeSpeChars {
    public String[] rem(String[] str) {
        String[] result = new String[str.length];

        for (int i = 0; i < str.length; i++) {
            StringBuilder s = new StringBuilder(); 
            for (char c : str[i].toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    s.append(c);
                }
            }
            result[i] = s.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        removeSpeChars remover = new removeSpeChars();
        String[] input = { "Hello, World!", "Java@2023", "Remove#Special$Characters" };
        String[] output = remover.rem(input);

        System.out.println(Arrays.toString(output));
    }
}
