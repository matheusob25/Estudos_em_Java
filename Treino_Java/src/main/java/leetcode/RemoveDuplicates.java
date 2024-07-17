package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int result = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[result] = nums[i];
                result += 1;
            }

        }



        return result;
    }



    public static void main(String[] args) {
        RemoveDuplicates rm = new RemoveDuplicates();
        int[] nums = {1,1,2,2};
        int result = rm.removeDuplicates(nums);
        System.out.println(result);




    }
}
