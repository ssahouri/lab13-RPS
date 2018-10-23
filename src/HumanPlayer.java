
public class HumanPlayer extends Player{
	
	public HumanPlayer() {}
	
	public HumanPlayer( String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		setValue(Roshambo.PAPER);
		return getValue();
	}

}
