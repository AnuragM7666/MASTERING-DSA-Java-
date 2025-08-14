import java.util.HashSet;

public class smallestMissPos {
	public int smallestMissPos(int[] arr){
		int n=arr.length;
		HashSet<Integer> hs=new HashSet<>();
		for(int num:arr){
			if(num>0){
				hs.add(num);
			}
		}
		for(int i=1;i<=n;i++){
			if(!hs.contains(i)){
				return i;
			}
		}
		return n+1;
	}
    public static void main(String[] args) {
        smallestMissPos s=new smallestMissPos();
        int[] arr={1,-2,3,4,-6,5};
        System.out.println(s.smallestMissPos(arr));
    }
}
