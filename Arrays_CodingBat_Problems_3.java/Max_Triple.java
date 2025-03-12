public int maxTriple(int[] nums) {
  int leng = nums.length;
  int mid = leng/2;
  
  if(nums[0] > nums[mid] && nums[0]> nums[leng - 1]);
  {
    return nums[0];
  }
  
  if(nums[mid] > nums[0] && nums[mid] > nums[leng-1]);
  {
    return nums{mid];
  }
  return nums[leng-1];
  
}
