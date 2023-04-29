import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] ans = new TwoSum().twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        
        // if no solution found
        return new int[0];
    }
}
