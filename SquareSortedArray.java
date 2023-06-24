
//<aside>
//💡 **Question 6**
//        Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.
//
//        **Example 1:**
//
//        Input: nums = [-4,-1,0,3,10]
//
//        Output: [0,1,9,16,100]
//
//        **Explanation:** After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100]
//
//</aside>


package ppt_assignment4;

import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] sortedSquares = squareSortedArray(nums);
        System.out.println(Arrays.toString(sortedSquares));
    }

    public static int[] squareSortedArray(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];

        // Calculate squares of each number
        for (int i = 0; i < n; i++) {
            squares[i] = nums[i] * nums[i];
        }

        // Sort the squares array
        Arrays.sort(squares);

        return squares;
    }
}
