package ships;

import quantum.BoardObject;
import quantum.Player;

public abstract class Ship extends BoardObject{
	private String name;
	private Player owner;
	private int ID;
	private int attack;
	private int defense;
	private int move;
	
	public Ship(){
		name = "";
	}
	
	public Ship(String name, int value){
		this.name = name;
		this.ID = value;
		this.attack = value;
		this.defense = value;
		this.move = value;
	}
	
	public abstract boolean doSpecial();

	@Override
	public boolean equals(Object o){
		if (!(o instanceof Ship) || o == null){
			return false;
		}
		Ship s = (Ship) o;
		if (this.getClass() != s.getClass()){
			return false;
		}	
		if (this.name != s.getName()
				|| this.attack != s.getAttack()
				|| this.defense != s.getDefense()
				|| this.move != s.getMove()
				|| this.owner != s.getOwner()){
			return false;
		}
		return true;
	}
	
	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
}
