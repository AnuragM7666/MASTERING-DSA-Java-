import java.util.ArrayList;
//this code alternates the positive and negative nums one by one 
public class alternate {
    void alternateArr(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < pos.size() && j < neg.size()) {
            temp.add(pos.get(i));
            temp.add(neg.get(j));
            i++;
            j++;
        }
        while (i < pos.size()) {
            temp.add(pos.get(i));
            i++;
        }
        while (j < neg.size()) {
            temp.add(neg.get(j));
            j++;
        }

        arr.clear();
        arr.addAll(temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-2);
        arr.add(-3);
        arr.add(-4);
        arr.add(5);
        arr.add(6);

        alternate obj = new alternate();
        obj.alternateArr(arr);

        System.out.println(arr);
    }
}
