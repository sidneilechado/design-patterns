public interface UserDao {
	void createUser(User user);
	User listUser(Long id);
}