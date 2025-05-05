// Class representing a dog with basic adoption info
public class Dog {
	
	// Age in months
	protected int age;
	
	// Name of the dog
	protected String name;
	
	// Adoption status
	protected boolean isAdopted;
	
	// Constructor initializes dog attributes
	public Dog(int a, String n, boolean ad)
	{
		age = a;
		
		name = n;
		isAdopted = ad;
	}
	
	public boolean getAdoptionStatus()
	{
		// Returns if the dog is adopted
		return isAdopted;
	}
	public void stateAge()
	{
		// Prints the dog's age
		System.out.print(name + " is " + age + " months old. ");
	}
	
	public void increaseAge()
	{
		// Increases dog's age by 1 month
		age++;
	}
	
	public String toString()
	{
		// Returns a message based on adoption status
		stateAge();
		if(isAdopted)
		{
			return " Yay Congrats you saved my life :) ";
		}
		return " Awhh man next tine ";
	}
	
	public boolean equals(Dog dawggg)
	{
		// Compares dog attributes to check for status
		if(this.age == dawggg.age && this.name.equals (dawggg.name) && this.isAdopted == dawggg.isAdopted)
		{
			return true;
		}
		return false;
	}
	
	
	
}
