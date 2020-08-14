public class Vacuum extends Appliance {

	public Vacuum() {
		name = "Vacuum";
		weapon = " a Vortex of Suction";
		hitPoints = 10;
		attackPower = 5;
	}

	@Override
	public int fight() {
		return 0;
	}

}