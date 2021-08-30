package a_petShop;

/*
 * Runner_PetShop 
 * 
 * There will be errors in this until your Pet class is finished.
 * 
 * Make sure your method names match the ones in this class.
 * 
 * 
 */


public class Runner_PetShop {

	public static void main(String[] args) {
		
		//create Pet instance using default constructor
		Pet pet1 = new Pet();
		
		//create Pet instance using parameterized constructor
		Pet pet2 = new Pet("Calico", "cat", "Mittens", 4);
		Pet pet3 = new Pet("German Shepherd", "dog", "Butch", 10);
		Pet pet4 = new Pet("Chihuhua", "dog", "Tiger", 6);
		
		//print all 4 pets toString() method
		System.out.println(pet1);
		System.out.println(pet2);
		System.out.println(pet3);
		System.out.println(pet4);
		
		//add values to the first pet
		pet1.setName("Oscar");
		pet1.setAge(5);
		pet1.setBreed("Tabby");
		pet1.setType("cat");
		
		//reprint pet1's toString() method
		System.out.println(pet1);
		
		//print the 4 parameters of pet3 on separate lines
		System.out.println(pet3.getName());
		System.out.println(pet3.getAge());
		System.out.println(pet3.getType());
		System.out.println(pet3.getBreed());
		
		
		/* 
		 * Below this, add code that illustrates anything
		 * you added to the Pet class
		 */
		
		
		
		
	}
	
	
}
