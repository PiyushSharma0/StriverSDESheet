// Time Complexity: O(n)
// Space Complexity: O(n)

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        boolean[] taken = new boolean[nums.length];
        for (int num : nums) {
            if (taken[num]) {
                return num;
            }
            taken[num] = true;
        }
        return 0;
    }
}