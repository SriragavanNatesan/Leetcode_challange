
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
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr){
        int n = arr.length;

        for(int i=0; i<n;i++){

            if(arr[i] > 0 && arr[i] <= n && arr[arr[i] -1] != arr[i] ){
                // Swap arr[arr[i] -1]  and arr[i]
                int tmp = arr[i];
                arr[i] = arr[tmp -1];
                arr[tmp -1] = tmp;
                i--;
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i] != i+1) return i+1;
        }

        return n+1;
    }

}
