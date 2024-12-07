package easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



// remove duplicates from the array
class SolutionTwo {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(!set.contains(nums[i])) {
        	  	set.add(nums[i]);
        	  	nums[count] = nums[i];
        	  	count++;
        	}
        }
           
        return count;
    }
}

// case 1 nums = [1, 1, 2] expected output = [1, 2]

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] arr1 = {1, 1, 2};
		
		SolutionTwo s1 = new SolutionTwo();
		int result1 = s1.removeDuplicates(arr1);
		System.out.println("result1 = " + result1);
		
	}
}

