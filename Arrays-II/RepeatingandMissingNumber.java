// Time Complexity: O(n)
// Space Complexity: O(1)

public class RepeatingandMissingNumber {
    public int[] findTwoElement(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;
        int actualSum = 0;
        int actualSumOfSquares = 0;
        for (int num : nums) {
            actualSum += num;
            actualSumOfSquares += num * num;
        }
        int diff = sum - actualSum;
        int diffOfSquares = sumOfSquares - actualSumOfSquares;
        int sumOfTwoNumbers = diffOfSquares / diff;
        int repeatingNumber = (sumOfTwoNumbers + diff) / 2;
        int missingNumber = sumOfTwoNumbers - repeatingNumber;
        return new int[] { repeatingNumber, missingNumber };
    }
}