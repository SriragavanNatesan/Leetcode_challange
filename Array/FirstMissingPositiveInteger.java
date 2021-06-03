
/**
 * 41. First Missing Positive
 * https://leetcode.com/problems/first-missing-positive/
 * 
 * Given an unsorted integer array nums, find the smallest missing positive integer.

    You must implement an algorithm that runs in O(n) time and uses constant extra space.

    Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
 

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
 * 
 */
public class FirstMissingPositiveInteger {
    
    public static void main(String[] args) {
        int arr[] = {0, 1, -1}; 
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++) {
        // Start assigning the numbers from 1 to len with their respective positions.
        // We can ignore the numbers that doesn't lie in range of [1,len]
        // 3rd condition is used to prevent the case for infinite for loop
            if(nums[i] >0 && nums[i] <= n && nums[nums[i]-1] != nums[i]) { 
                swap(nums, nums[i]-1, i);
                i--;
            }
        }
        // Since in the above for loop we have assigned the numbers w.r.t positions
        for(int i=0; i<n; i++){
            // Once the number is not equal to its position, we can return that position
            if(nums[i]!=i+1) return i+1; 
        }
        // If we were able to get every number in that range, then we can return len+1.
        return n+1;
    }
    
    public static void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;       
    }

}
