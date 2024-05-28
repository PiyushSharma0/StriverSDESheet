// Time Complexity: O(nlogn) where n is the length of intervals
// Space Complexity: O(n)

import java.util.Arrays;

public class MergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[][] result = new int[intervals.length][2];
        int idx = 0;
        
        result[0] = intervals[0];
        
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= result[idx][1]) {
                result[idx][1] = Math.max(result[idx][1], intervals[i][1]);
            } else {
                idx++;
                result[idx] = intervals[i];
            }
        }
        
        return Arrays.copyOf(result, idx + 1);
    }
}