public class User {
	protected int id;
	protected String name;
	protected String email;
	protected String country;
	protected List<Pet> pets;
	
	public User(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
	}

  // getters and setters
}