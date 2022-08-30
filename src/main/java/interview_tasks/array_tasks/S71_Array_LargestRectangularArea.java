package interview_tasks.array_tasks;

/**
 * https://www.geeksforgeeks.org/largest-rectangular-area-in-a-histogram-set-1/?ref=rp
 * https://www.geeksforgeeks.org/largest-rectangle-under-histogram/
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
public class S71_Array_LargestRectangularArea {

    /*
        Largest Rectangular Area in a Histogram
        Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of
        a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.

        EXAMPLE:
        Input: Consider the following histogram with 7 bars of heights {6, 2, 5, 4, 5, 1, 6}.
        Output: The largest possible rectangle possible is 12
     */
    public static void main(String[] args) {
        System.out.println(defaultSolution(new int[]{6, 2, 5, 4, 5, 1, 6}));
    }

    private static int defaultSolution(int[] heights){
        int[][] temp = new int[heights.length][heights.length];
        int max = heights[0];

        for(int w = 1; w <= heights.length; w++){
            for(int l = 0; (l+w) -1 < heights.length; l++){
                int r = l + w - 1; //adjustment
                if(w == 1){ // 10 * 1 ===> 10
                    temp[l][l] = heights[l];
                    max = Math.max(max, temp[l][l]);
                } else {
                    temp[l][r] = Math.min(temp[l][r-1], heights[r]);
                    max = Math.max(max, temp[l][r] * w);
                }
            }
        }
        return max;
    }
}
