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
        Pet pet1= new Pet("Buddy", "Rhino");
        Pet maxPet = new Pet("Gary", "Buffalo");
        Pet pet1= new Pet("Buddy", "Dog");
        Pet pet3 = new Pet("Slinky", "Gecko");
        Pet maxPet = new Pet("Gary", "Snail");
        Pet pet2= new Pet("Bruno", "Dog");
        Pet emiPet = new Pet("Hoshino", "Stoat");
        Pet devonPet = new Pet("Thomas", "Cat");
        Pet myPet = new Pet("Rufus","Dog");
        Pet yukiPet= new Pet("Pum", "Iguana");
        Pet simonPet = new Pet("Opus", "Penguin");

        Pet audreyPet = new Pet("Stylo", "Dog");
        
        Pet camPet = new Pet("Quinten", "Quokka");
        System.out.println("my pets name is + " + maxPet.getName());
        System.out.println("my pets name is + " + emiPet.getName());
        System.out.println("my pets name is + " + audreyPet.getName());
   
        // Print the name of the pet
        System.out.println("Simon's pet's name is: " + simonPet.getName());
        System.out.println("Pet's name is: " + pet1.getName());
        System.out.println("Devon's pet's name is: " + devonPet.getName() + ", and her pet is a: " + devonPet.getSpecies());
        System.out.println("Pet's name is: " + yukiPet.getName());
        System.out.println("Pet's name is: " + pet3.getName());
    }
}
