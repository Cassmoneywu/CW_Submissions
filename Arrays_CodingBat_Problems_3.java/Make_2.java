public int[] make2(int[] a, int[] b) {
  int[] arr = new int[2];
  int lengA = a.length;
  int lengB = b.length;
  
  if(lengA == 0)
  {
    arr[0] = b[0];
    arr[1] = b[1];
    return arr;
  }
  else if (lengA == 1)
  {
    arr[0] = a[0];
    arr[1] = b[0];
    return arr;
  }
  else
  {
    arr[0] = a[0];
    arr[1] = a[1];
  }
  return arr;
}
