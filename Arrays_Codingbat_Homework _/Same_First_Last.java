public boolean sameFirstLast(int[] nums) {
 int l = nums.length;
  if (l>= 1 && nums[0] == nums [l - 1])
  {
  return true;
}
return false;
}
