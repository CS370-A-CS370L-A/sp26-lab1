public class Pet {
    // Instance variables
    private String name;
    private String species;

    // Constructor
    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for species
    public String getSpecies() {
        return species;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Pet object
        Pet pet1= new Pet("Buddy", "Dog");
        Pet maxPet = new Pet("Gary", "Snail");
        Pet devonPet = new Pet("Thomas", "Cat");

        System.out.println("my pets name is + " + maxPet.getName());
   
        // Print the name of the pet
        System.out.println("Pet's name is: " + pet1.getName());
        System.out.println("Devon's pet's name is: " + devonPet.getName() + ", and her pet is a: " + devonPet.getSpecies());
    }
}
