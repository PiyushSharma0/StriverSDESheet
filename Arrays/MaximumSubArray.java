// Time Complexity: O(n) 
// Space Complexity: O(1)

class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxSum = currentSum > maxSum ? currentSum : maxSum;
            if(currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}