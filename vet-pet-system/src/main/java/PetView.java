public class PetView {
    
    public void displayPetMenu() {
        System.out.println("=== Pet Management ===");
        System.out.println("1. Add Pet");
        System.out.println("2. View Pets");
        System.out.println("3. Update Pet");
        System.out.println("4. Delete Pet");
        System.out.println("5. Back to Main Menu");
        System.out.print("Select an option: ");
    }

    public void showPets(List<Pet> pets) {
        System.out.println("=== List of Pets ===");
        for (Pet pet : pets) {
            System.out.println("ID: " + pet.getId() + ", Name: " + pet.getName() + ", Type: " + pet.getType());
        }
    }

    public Pet getPetDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Pet Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Pet Type: ");
        String type = scanner.nextLine();
        return new Pet(name, type);
    }

    public int getPetId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Pet ID: ");
        return scanner.nextInt();
    }
}