public boolean cigarParty(int cigars, boolean isWeekend) {
  if (cigars >= 40 && isWeekend )
    {
      return true;
    }
    else
    {
      return false;
    }
  if(cigars >= 40 && cigars <= 60 && !isWeekend)
    {
      return true;
    }
    else 
    {
      return false;
    }
        
  }
