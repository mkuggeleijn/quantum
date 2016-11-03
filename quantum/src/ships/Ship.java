package ships;

import board.Square;
import quantum.GamePiece;
import quantum.Player;

public abstract class Ship extends GamePiece{
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
	
	public void moveTo(Square square){
		this.getSquare().setPiece(null);
		this.setSquare(square);
	}
	
	public void destroy(){
		this.getSquare().setPiece(null);
		this.setSquare(null); // Might change this 
		this.getOwner().shipDestroyed(this);
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
