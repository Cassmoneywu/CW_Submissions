public boolean unlucky1(int[] nums) {
 int leng = nums.length;
  if(leng >=2 && nums[0] == 1 && nums[1] == 3)
 {
   return true;
 }
 return false;
}
