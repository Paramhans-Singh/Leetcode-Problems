import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
			// Checks out for duplicate numbers from the left and skips it
			// Since the left pointer is always one position after i, it is not necessary to check for duplication
			
            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            }

            int j = i + 1 ;
            int k = nums.length - 1;
            while(k > j) {
				
				// Checks out for duplicate numbers from the right and skips it
				if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }

                int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;

        }

}
