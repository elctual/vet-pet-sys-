public class PetController {
    
    private PetDAO petDAO;

    public PetController() {
        this.petDAO = new PetDAO();
    }

    public void addPet(Pet pet) {
        petDAO.addPet(pet);
    }

    public Pet getPet(int petId) {
        return petDAO.getPet(petId);
    }

    public List<Pet> getAllPets() {
        return petDAO.getAllPets();
    }

    public void updatePet(Pet pet) {
        petDAO.updatePet(pet);
    }

    public void deletePet(int petId) {
        petDAO.deletePet(petId);
    }
}