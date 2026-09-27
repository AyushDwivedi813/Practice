import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] arg) {

        int[] nums = { 1, 3, 4, 5, 7, 8, 0, 9 };
        int target = 5;
        TwoSum ts = new TwoSum();
        System.out.print(Arrays.toString(ts.twoSum(nums, target)));
    }
}