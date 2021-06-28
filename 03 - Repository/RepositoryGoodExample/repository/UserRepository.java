public interface UserDao {
	void create(User user);
	User get(Long id);
}