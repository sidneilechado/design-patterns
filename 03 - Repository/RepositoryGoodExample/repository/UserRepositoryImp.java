public class UserRepositoryImpl implements UserRepository {
		private UserDaoImp userDaoImp;
		private PetDaoImp petDaoImp;
		
		@Override
		public User get(Long id) {
				User user = userDaoImpl.listUser(id);
				User.setPets(PetDaoImp.getPets(id));
				return user;
		}

		@Override
		public void add(User user) {
				userDaoImpl.createUsers(user);
		}

		// ...
}