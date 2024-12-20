
public class Loops_Ibtro_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		char q = 0;
		System.out.println(countLetters("abqcdqefghqqijk" , q));
		System.out.println(getFactorial( 5 * 4 * 3 * 2 * 1));
		System.out.println(getIfRepeats("slow"));

		
	//Question 1 is counting how many times a letter appears in a certain word
	}
	public static int countLetters( String str, char let)
{
	int count = 0;
	for(int i = 0; i<str.length();i++)
	{
		if(let == str.charAt(i))
{
	count++;
}
	}
	return count;
}	

// Question 2. Method to calculate the factorial of a number
	
	public static int getFactorial(int num) 
	{
   
		int factor = 1;
		
		for (int i = 1; i <= num; i++) {
       
		factor = i;
    }
    return factor;
}
	
	//Question 3 this method would return true if there are are letters repeating BUT only if they are repeating consecutively.
	public static boolean getIfRepeats(String str) 
	{
    
		for (int i = 0; i < str.length() - 1; i++) 
		{
			if (str.charAt(i) == str.charAt(i + 1))
			{
            return true;
        }
    }
    return false;
	}

}
	
