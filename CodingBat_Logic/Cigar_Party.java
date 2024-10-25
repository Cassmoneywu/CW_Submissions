public boolean cigarParty(int cigars, boolean isWeekend) {
  if(cigars>=40 && isWeekend)
  {
    return true;
  }
  
  else if(cigars<40 && isWeekend)
  {
    return false;
  }
  
  else if(cigars<40)
  {
    return false;
  }
  
  else if(cigars<=60)
  {
    return true;
  }
  
  else if(cigars>60)
  {
   return false;
  }
  return false;
}
