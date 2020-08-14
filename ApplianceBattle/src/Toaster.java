public class Toaster extends Appliance {

	public Toaster() {
		name = "Toaster";
		weapon = "Toast of Pain";
		hitPoints = 10;
		attackPower = 4;
	}

	@Override
	public int fight() {
		return 0;
	}

}
