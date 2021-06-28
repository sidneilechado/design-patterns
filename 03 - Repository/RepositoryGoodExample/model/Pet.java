public class Pet {
	protected int id;
	protected String name;
	protected String race;
	protected User owner;
	
	public Pet(String name, String race, User owner) {
		super();
		this.name = name;
		this.race = race;
		this.owner = owner;
	}

  // getters and setters
}