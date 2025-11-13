import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        long sum = 0L;

        Set<Integer> seen = new HashSet<>();
        for (int x : nums) {
            if (!seen.add(x)) {
                duplicate = x;        // found duplicate value
            }
            sum += x;
        }

        long expected = (long) n * (n + 1) / 2;
        int missing = (int) (expected - (sum - duplicate));

        return new int[]{duplicate, missing};
    }
}
