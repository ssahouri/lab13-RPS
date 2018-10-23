
public class RockPlayer extends Player{
	
	public RockPlayer() {}
	
	public RockPlayer( String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		setValue(Roshambo.ROCK);
		return getValue();
	}

}
