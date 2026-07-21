
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = new int[]{7, 2, 11, 15};

        TwoSum twoSum = new TwoSum();

        int target = 17;

        int[] results = twoSum.twoSum(arr, target);
        System.out.println("Result is ");
        System.out.println(Arrays.toString(results));

    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];

            if (res.containsKey(remainder)) {
                return new int[]{res.get(remainder), i};
            }

            res.put(nums[i], i);
        }
        return new int[]{};
    }
}
