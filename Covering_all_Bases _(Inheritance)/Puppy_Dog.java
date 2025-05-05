public class Puppy_Dog extends Dog{
	
	// initializes the parent Dog class and the isFed status
	public Puppy_Dog(int a, String n, boolean ad, boolean f) {
		super(a, n, ad);
		isFed = f;
		// TODO Auto-generated constructor stub
	}
	
	//tracks if the puppy has been fed
	protected boolean isFed;
	
	// Overrides stateAge() to display the puppy's name and age
	public void stateAge()
	{
		System.out.print(name + " is " + age + " months old. ");
	}
	
	// Marks the puppy as fed
	public void feedPup()
	{
		isFed = true;
	}
	
	// Increases the puppy's age and marks it as hungry again
	public void increaseAge()
	{
		super.increaseAge();
		isFed = false;
	}
	
	// Returns a string including the base dog's toString plus feeding status
	public String puppyToString() 
	{
		if(isFed)
		{
			return super.toString() +  " YAY you fed me ";
		}
		return super.toString() + " Bruh im starving feed me already ";
	}
	
	// Checks equality of two Puppy_Dog objects, including feeding status
	public boolean equals(Puppy_Dog littleDawg)
	{
		if(super.equals(littleDawg) && this.isFed == littleDawg.isFed)
		{
			return true;
		}
	return false;
	}
	
}
