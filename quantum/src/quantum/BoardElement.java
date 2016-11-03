package quantum;

import java.util.HashMap;

public abstract class BoardElement {
	private HashMap<Direction,BoardElement> neighbours;
	
	public BoardElement getNeighbour(Direction d){
		return(neighbours.get(d));
	}
	
	public abstract void addNeighbour(Direction d, BoardElement e);
	
}
