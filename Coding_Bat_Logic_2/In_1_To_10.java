public boolean in1To10(int n, boolean outsideMode) {
 if(outsideMode == false)
 {
   if(n<=10 && n>=1)
   {
     return true;
   }
 }
  else if(outsideMode == true)
  {
    if(n<=1 || n>=10)
    {
      return true;
    }
  }
  return false;
}
