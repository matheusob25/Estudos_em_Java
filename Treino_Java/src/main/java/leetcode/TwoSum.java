package leetcode;

public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
                for(int i = 0; i < (nums.length - 1); i++){
                    for(int j = i + 1; j < nums.length; j++){
                        if((nums[i] + nums[j]) == target){
                            return new int[] {i,j};
                        }
                    }
                }
                return new int[] {};
        }
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        Solution j = ts.new Solution();
        int[] nums = {4,3,7,8,6,1};
        int target = 10;
        int [] result = j.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("Nenhum par encontrado.");
        }


    }

}
