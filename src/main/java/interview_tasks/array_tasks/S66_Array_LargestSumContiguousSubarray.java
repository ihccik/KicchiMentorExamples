package interview_tasks.array_tasks;

/**
 * https://leetcode.com/problems/maximum-subarray
 * https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 */
public class S66_Array_LargestSumContiguousSubarray {
    /*
        Write a program to find the sum of contiguous sub-array
        within a one-dimensional array of numbers that has the largest sum.

        EXAMPLE:
        Input: [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.
     */

    public static void main(String[] args) {
        System.out.println(defaultSolution(new int[]{2,-3,-1}));
        System.out.println(getContiguousSum(new int[]{2,-3,-1}));;
    }

    //@default
    public static int defaultSolution(int[] arr) {
        int max = 0, temp = 0;

        for (int each: arr) {
            temp = temp + each;
            temp = Integer.max(temp, 0);
            max = Integer.max(max, temp);
        }

       return max;
    }

    //@kicchi not an effective and passing solution
    private static int getContiguousSum(int[] arr){
        int tempSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            tempSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                tempSum = tempSum + arr[j];
                if (tempSum > maxSum){
                    maxSum = tempSum;
                }
            }
        }
        return maxSum;
    }
}
