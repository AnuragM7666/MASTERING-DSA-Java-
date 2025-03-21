// Geek is learning a new programming language. As data type forms the most fundamental part of a language, Geek is learning them with focus and needs your help.
//Given a data type, help Geek in finding the size of it in byte.
//
//Data Type - Character, Integer, Long, Float and Double
public class datatype {
    static int dataTypeSize(String str) {
        if (str.equals("Integer")) {
            return 4;
        } else if (str.equals("Character")) {
            return 1;
        } else if (str.equals("Long") || str.equals("Double")) {
            return 8;
        } else if (str.equals("Float")) {
            return 4;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(dataTypeSize("Character"));
        System.out.println(dataTypeSize("Integer"));
        System.out.println(dataTypeSize("Long"));
        System.out.println(dataTypeSize("Float"));
        System.out.println(dataTypeSize("Double"));
    }
}
