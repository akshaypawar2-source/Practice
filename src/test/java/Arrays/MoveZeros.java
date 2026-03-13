package Arrays;
import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        moveZeroes(a);
        System.out.println(Arrays.toString(a)); // [1, 3, 12, 0, 0]
    }
        public static void moveZeroes(int[] nums) {
            if (nums == null || nums.length == 0)
            {
                return;
            }

            int write = 0;

            // Move non-zeros forward
            for (int x : nums) {
                if (x != 0) {
                    nums[write++] = x;
                }
            }

            // Fill remaining with zeros
            while (write < nums.length) {
                nums[write++] = 0;
            }
        }
    }



