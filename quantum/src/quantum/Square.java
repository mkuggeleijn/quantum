package quantum;

import java.util.HashMap;

public class Square {

	private BoardObject occupant;
	private HashMap<Direction,Square> neighbours;
	
	public BoardObject getOccupant() {
		return occupant;
	}

	public void setOccupant(BoardObject occupant) {
		this.occupant = occupant;
	}

	public HashMap<Direction,Square> getNeighbours() {
		return neighbours;
	}
	
	public void addNeighbour(Direction,Square)

	public void setNeighbours(HashMap<Direction,Square> neighbours) {
		this.neighbours = neighbours;
	}


	
}
