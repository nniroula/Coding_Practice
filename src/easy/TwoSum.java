package easy;

import java.util.Arrays;

//Problem - 1

/*
class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		for(int i = 0; i < nums.length; i++) {
			for(int j = 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;
					return indices;
				}
			}
		}
		
		return indices;
	}
}
*/
// above solution fails for following test cases

// 1. [3, 3] and target = 6, ans = [0, 1]
// 2. [2, 5, 5, 11] and target = 10 ans = [1, 2]


class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		for(int i = 0; i < nums.length; i++) { // Note when i = 0; j = 1, 2, and 3
			for(int j = i + 1; j < nums.length; j++) { // in previous solution it was j = 1
				if(nums[i] + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;
					return indices;
				}
			}
		}
		
		return indices;
	}
}

public class TwoSum{
	public static void main(String[] args) {
		int[] arr1 = {3, 3};
		int[] arr2 = {2, 5, 5, 11};
		
		Solution solution = new Solution();
		int[] solution2 = solution.twoSum(arr2, 10);
		System.out.println(Arrays.toString(solution2));
	}
}
