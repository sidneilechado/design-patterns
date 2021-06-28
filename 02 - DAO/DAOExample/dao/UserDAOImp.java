public class UserDaoImpl implements UserDao {
	private final EntityManager entityManager;
	
	@Override
	public User create(User user) {
		entityManager.persist(user);
	}

	@Override
	public List<User> list() {
		return entityManager.find();
	}

	// ...
}