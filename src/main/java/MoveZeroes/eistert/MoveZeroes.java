package MoveZeroes.eistert;

/**
 * Created by eistert on 2019/06/01.
 */
public class MoveZeroes {
	/**
	 * Example:
	 * 
	 * Input: [0,1,0,3,12] Output: [1,3,12,0,0]
	 * 
	 * @param nums
	 */
	public static int[] moveZeroes(int nums[]) {
		for (int i = 0, curr = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int swap = nums[i];
				nums[i] = nums[curr];
				nums[curr++] = swap;
			}

		}
		return nums;
	}

	/**
	 * 解题思路：当元素值等于0时，依次遍历和next元素交换值，把0交换到最后。
	 * @param nums
	 * @return
	 */
	public static int[] moveZeroes2(int nums[]) {

		for (int curr = 0; curr < nums.length; curr++) {
			int next = curr + 1;
			if (nums[curr] == 0) {

				for (int i = curr; i < nums.length - 1; i++, next++) {
					int swap1 = nums[next];
					int swap2 = nums[i];

					nums[i] = swap1;
					nums[next] = swap2;
				}
			}
			next = 0;
		}
		int time = 0;
		boolean flag = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				time++;
			}
		}
		for (int i = 0; i < nums.length - time; i++) {
			if (nums[i] == 0) {
				flag = true;
			}
		}

		if (nums.length > 2 && nums[nums.length - 1] == 0 && flag) {
			moveZeroes2(nums);
		}
		return nums;

	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
//		moveZeroes(nums);
		moveZeroes2(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
