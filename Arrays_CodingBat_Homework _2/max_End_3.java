public int[] maxEnd3(int[] nums) {
  int max = nums[0];
    
    if(nums[2]> max)
    max = nums[2];
  
  for(int i= 0; i<nums.length; ++i)
    nums[i] = max;
  
  return nums;
}

