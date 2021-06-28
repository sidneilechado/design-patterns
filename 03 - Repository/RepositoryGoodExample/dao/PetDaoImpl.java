public class PetDaoImpl implements PetDao {
	private final EntityManager entityManager;
	
	@Override
	public Pet createPet(Pet user) {
		entityManager.persist(user);
	}

	@Override
	public List<Pet> getPets(Long id) {
		return entityManager.find(id);
	}

	// ...
}