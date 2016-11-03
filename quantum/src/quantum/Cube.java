package quantum;

public class Cube {
	private Player owner;
	
	public Cube(Player owner){
		this.owner = owner;
	}

	public Player getOwner() {
		return owner;
	}
}
