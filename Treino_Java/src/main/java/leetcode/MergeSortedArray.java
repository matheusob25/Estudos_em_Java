package leetcode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }

        }

    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0,0};
        int[] nums2 = {2,3, 5, 6};
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1,3, nums2,4);
       for (Integer i : nums1) {
           System.out.print(i + " ");
       }


    }
}
