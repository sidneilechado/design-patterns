public interface PetDao {
	void createPet(Pet pet);
	List<Pet> getPets(Long id);
}