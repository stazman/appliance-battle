public class Microwave extends Appliance {

	// appliance.name = "Microwave";
//	      appliance.weapon = "Radiation";
	// appliance.hitPoints = 8;
	// public String name = "Microwave";

	public Microwave() {
		name = "Microwave";
		weapon = "Radiation";
		hitPoints = 8;
		attackPower = 2;
	}

	@Override
	public int fight() {
		return 0;
	}
	// I'm pretty sure the constructor is always the first method in the class if
	// there is an explicit constructor
}
