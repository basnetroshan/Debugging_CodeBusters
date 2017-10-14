import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum DiceValue {
	CROWN, ANCHOR, HEART, DIAMOND, CLUB, SPADE;
	
	private static Random RANDOM = new Random();
	
	private static final Map<DiceValue, String> VALUE_REPR_MAP= new HashMap<DiceValue, String>();
	static {
		VALUE_REPR_MAP.put(DiceValue.CROWN, "Crown");
		VALUE_REPR_MAP.put(DiceValue.ANCHOR, "Anchor");
		VALUE_REPR_MAP.put(DiceValue.HEART, "Heart");
		VALUE_REPR_MAP.put(DiceValue.DIAMOND, "Diamond");
		VALUE_REPR_MAP.put(DiceValue.CLUB, "Club");
		VALUE_REPR_MAP.put(DiceValue.SPADE, "Spade");
	}
	
	public String toString(DiceValue value) {
		return VALUE_REPR_MAP.get(value);
	}
	
	public static DiceValue getRandom() {
		// Roshan Basnet. Adding code to test if the Spade ever appears
+		System.out.println("---Bug 4 detector: SPADE dice index: " + DiceValue.SPADE.ordinal());
+		// The random method will only generate a random value starts from 0 to the pass-in value minus 1.
+		// So if we want to randomly generate a number from 0 to 5 (index of SPADE). We should pass 6 (or DiceValue.SPADE.ordinal() + 1) as parameter
		int random = RANDOM.nextInt(DiceValue.SPADE.ordinal() + 1);
		//System.out.println("---- Random value generated for dice value: " + random + ". Corresponding value: " + values()[random]);
		return values()[random];
	}
	
}
