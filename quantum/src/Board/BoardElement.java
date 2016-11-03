package Board;

import java.util.HashMap;

import quantum.Direction;

public abstract class BoardElement {
	private BoardElement[][] neighbours;
	
	public abstract void addNeighbour(Direction d, BoardElement e);
	public abstract void addNeighbour(int x, int y, BoardElement e);
	
	public BoardElement getNeighbour(Direction d){
		return neighbours[d.toOffset().x][d.toOffset().y];
	}
	
	public BoardElement getNeighbour(int x, int y){
		return neighbours[x][y];
	}	
	
}
