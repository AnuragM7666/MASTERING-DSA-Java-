//Given an array of integers heights representing the histogram's bar height where 
//the width of each bar is 1, return the area of the largest rectangle in the histogram.

import java.util.Stack;

public class histogramRec {
    public int largestRectangleArea(int[] ht) {
        int n = ht.length;
        Stack<Integer> s = new Stack<>();
        int[] right = new int[n];
        int[] left = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (s.size() > 0 && ht[s.peek()] >= ht[i]) {
                s.pop();
            }
            right[i] = s.empty() ? n : s.peek();
            s.push(i);
        }

        while (!s.isEmpty()) {
            s.pop();
        }
        for (int i = 0; i <= n - 1; i++) {
            while (s.size() > 0 && ht[s.peek()] >= ht[i]) {
                s.pop();
            }
            left[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int currArea = ht[i] * width;
            ans = Math.max(ans, currArea);
        }
        return ans;
    }
    public static void main(String[] args) {
        histogramRec hr = new histogramRec();
        int[] heights = {2, 1, 5, 6, 2, 3};
        int maxArea = hr.largestRectangleArea(heights);
        System.out.println("Maximum area of rectangle in histogram: " + maxArea); // Should print 10
    }
}
