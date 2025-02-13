public int[] reverse3(int[] nums) {
  int nums0 = nums[0];
  nums[0] = nums[2];
  nums[2] = nums0;
  return nums;
}
