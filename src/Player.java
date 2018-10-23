
public abstract class Player {
	private String name;
	private Roshambo value;
	
	public Player() {}
	
	public Player(String name) {
		super();
		this.name = name;
		//this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Roshambo getValue() {
		return value;
	}
	public Roshambo setValue(Roshambo value) {
		 return this.value = value;
	}
	
	public abstract Roshambo generateRoshambo();

}
