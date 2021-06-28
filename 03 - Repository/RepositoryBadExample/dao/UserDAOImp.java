public class UserDaoImpl implements UserDao {
	private final EntityManager entityManager;
	
	@Override
	public User createUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public User listUser(Long id) {
		return entityManager.find(id);
	}

	// ...
}