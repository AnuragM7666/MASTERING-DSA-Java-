import java.util.*;

//write a function that takes radius as input and returns circumference of the circle

public class Function5 {
    public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double r = sc.nextDouble();

        System.out.println(getCircumference(r));
    }
}
