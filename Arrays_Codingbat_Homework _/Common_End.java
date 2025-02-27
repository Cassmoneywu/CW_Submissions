public boolean commonEnd(int[] a, int[] b) {
 int a1= a.length;
 int b1= b.length;
  
  if (a[0] == b[0]|| a[a1 -1] == b[b1 -1])
  {
    return true ;
  }
  return false;
}
