public abstract class Appliance {

	public int hitPoints;
	public String name;
	public String weapon;
	public int attackPower;

	// will return an int for how much damage to give to player
	public abstract int fight();

}