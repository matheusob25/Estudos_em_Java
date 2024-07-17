package leetcode;

import java.lang.reflect.Array;

public class SearchInsertionPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > target && nums[j - 1] < target) {
                return j;
            }
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        if(nums[0] > target){
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchInsertionPosition searchInsertionPosition = new SearchInsertionPosition();
        System.out.println(searchInsertionPosition.searchInsert(new int[]{1}, 2));
    }


}
