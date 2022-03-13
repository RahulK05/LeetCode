import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];

    Map<Integer, Integer> visited = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (visited.containsKey(target - nums[i])) {
        result[0] = visited.get(target - nums[i]);
        result[1] = i;
        return result;
      }
      visited.put(nums[i], i);
    }

    return result;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {3,4,2};
        int[] result = ts.twoSum(nums, 6);
        System.out.println(result[0]+" "+result[1]);
    }
}