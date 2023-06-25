
//<aside>
//💡 **Question 8**
//
//        Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//        *Return the array in the form* [x1,y1,x2,y2,...,xn,yn].
//
//        **Example 1:**
//
//        **Input:** nums = [2,5,1,3,4,7], n = 3
//
//        **Output:** [2,3,5,4,1,7]
//
//        **Explanation:** Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].



package ppt_assignment4;
import java.util.*;
public class Rearrange_Array {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] output = rearrangeArray(nums, n);
        System.out.println(Arrays.toString(output));
    }

    public static int[] rearrangeArray(int[] nums, int n) {
        int[][] result = new int[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = nums[i];
            result[i][1] = nums[i + n];
        }

        int[] output = new int[2 * n];
        for (int i = 0; i < n; i++) {
            output[i * 2] = result[i][0];
            output[i * 2 + 1] = result[i][1];
        }

        return output;
    }
}
