//<aside>
//        💡 **Question 1**
//        Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.
//
//        **Example 1:**
//
//        Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
//
//        Output: [1,5]
//
//        **Explanation:** Only 1 and 5 appeared in the three arrays.


package ppt_assignment4;

import java.util.*;


public class CommonElementsInArrays {
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<>();

        int p1 = 0; // Pointer for arr1
        int p2 = 0; // Pointer for arr2
        int p3 = 0; // Pointer for arr3

        while (p1 < arr1.length && p2 < arr2.length && p3 < arr3.length) {
            if (arr1[p1] == arr2[p2] && arr2[p2] == arr3[p3]) {
                result.add(arr1[p1]);
                p1++;
                p2++;
                p3++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else if (arr2[p2] < arr3[p3]) {
                p2++;
            } else {
                p3++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};

        List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);
        System.out.println(commonElements);
    }
}

