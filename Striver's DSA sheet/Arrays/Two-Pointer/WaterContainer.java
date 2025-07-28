//You are given an integer array height of length n. 
//There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Notice that you may not slant the container.
public class WaterContainer {
    public static int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        // Brute force approach
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         int width = j - i;
        //         int ht = Math.min(height[i], height[j]);
        //         int area = width * ht;
        //         maxWater = Math.max(maxWater, area);
        //     }
        // }
        // return maxWater;

        int start = 0;
        int end = n - 1;
        
        // Two pointer approach
        while (start < end) {
            int wdh = end - start;
            int ht = Math.min(height[start], height[end]);
            int area = wdh * ht;
            maxWater = Math.max(maxWater, area);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = maxArea(height);

        System.out.println(result);
    }
}
