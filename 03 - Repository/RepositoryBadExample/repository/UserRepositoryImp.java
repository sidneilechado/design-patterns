public class UserRepositoryImpl implements UserRepository {
		private UserDaoImp userDaoImp;
		
		@Override
		public User get(Long id) {
				User user = userDaoImpl.listUser(id);
				return user;
		}

		@Override
		public void add(User user) {
				userDaoImpl.createUsers(user);
		}

		// ...
}