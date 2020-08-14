public class Oven extends Appliance {

	public Oven() {
		name = "Oven";
		weapon = "Fire";
		hitPoints = 10;
		attackPower = 3;
	}

	@Override
	public int fight() {
		return 0;
	}

}
