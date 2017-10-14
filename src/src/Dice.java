public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() {
		
		// Roshan Basnet
		// This should modify the current DiceValue before returning it
		value = DiceValue.getRandom();
		return value;
	}		
	
	public String toString() {
		return value.toString();
	}
}
