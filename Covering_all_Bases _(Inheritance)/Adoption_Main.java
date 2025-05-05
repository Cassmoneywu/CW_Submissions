public class Adoption_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Create a Dog object named Peanut
Dog Peanut = new Dog(9, "Peanut", false);

//Create a Puppy_Dog object named Kashi
Puppy_Dog Kashi = new Puppy_Dog(5, "kashi", false, false);

// Display adoption status and age for Peanut and Kashi
System.out.println(Peanut.getAdoptionStatus());
Peanut.stateAge();
System.out.println(Kashi.getAdoptionStatus());

// Increase the age of both animals
Peanut.increaseAge();
Kashi.increaseAge();

// Display updated age
Peanut.stateAge();
Kashi.stateAge();

// Print their string representations
System.out.println(Peanut);
System.out.println(Kashi);

//Tests the two Dog objects with the same values
Dog peanut2 = new Dog(9, "Peanut", false);
Dog peanut3  = new Dog(9, "Peanut", false);
System.out.println(peanut2.equals(peanut3));

//Tests the two Puppy_Dog objects with the same values
Puppy_Dog Kashi2 = new Puppy_Dog(5, "kashi", false, false);
Puppy_Dog Kashi3 = new Puppy_Dog(5, "kashi", false, false);
System.out.println(Kashi2.equals(Kashi3));



	}
}



