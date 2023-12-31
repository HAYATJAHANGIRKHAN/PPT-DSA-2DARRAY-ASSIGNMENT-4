
//        💡 **Question 2**
//
//        Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*
//
//        - answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
//        - answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.
//
//        **Note** that the integers in the lists may be returned in **any** order.
//
//        **Example 1:**
//
//        **Input:** nums1 = [1,2,3], nums2 = [2,4,6]
//
//        **Output:** [[1,3],[4,6]]
//
//        **Explanation:**
//
//        For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
//
//        For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
//
//

package ppt_assignment4;
import java.util.*;


public class DistinctIntegerArrays {
    public static ArrayList<Integer>[] findDisjointArrays(int[] nums1, int[] nums2) {
        // Create sets to store unique elements from nums1 and nums2
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Add elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add elements from nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Create the ArrayLists to store the distinct elements
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Find distinct elements in nums1 that are not present in nums2
        for (int num : nums1) {
            if (!set2.contains(num)) {
                list1.add(num);
            }
        }

        // Find distinct elements in nums2 that are not present in nums1
        for (int num : nums2) {
            if (!set1.contains(num)) {
                list2.add(num);
            }
        }

        // Create the 2D array to hold the results
        ArrayList<Integer>[] answer = new ArrayList[2];
        answer[0] = list1;
        answer[1] = list2;

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        ArrayList<Integer>[] answer = findDisjointArrays(nums1, nums2);

        // Print the result
        for (ArrayList<Integer> list : answer) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

