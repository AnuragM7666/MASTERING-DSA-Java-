import java.util.PriorityQueue;

public class tywin {
    public int armyRequired(int[] arr, int k){
        int n=arr.length;
        int lucky=0;
        int req=(n+1)/2;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:arr){
            if(num%k==0){
                lucky++;
            }else{
                pq.add(k-(num%k));
            }
        }

        if(lucky>=req) return 0;

        int ans=0;

        for(int i=0;i<req-lucky;i++){
            ans+=pq.poll();
        }
        return ans;
    }
    public static void main(String[] args) {
        tywin t=new tywin();
        int[] arr={1,2,3,4,5};
        int k=3;
        System.out.println(t.armyRequired(arr, k));
    }
}
