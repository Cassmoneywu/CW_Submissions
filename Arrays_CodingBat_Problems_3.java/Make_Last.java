public int[] makeLast(int[] nums) {
  int[] array = new int[nums.length*2];
  array[array.length-1] = nums[nums.length-1];
  return array;
}
