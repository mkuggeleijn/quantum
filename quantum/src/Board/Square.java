package Board;

import java.util.HashMap;

import quantum.GamePiece;
import quantum.Direction;

public class Square extends BoardElement{

	private GamePiece piece;
	private Tile tile;
	
	@Override
	public void addNeighbour(Direction d, BoardElement e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNeighbour(int x, int y, BoardElement e) {
		// TODO Auto-generated method stub
		
	}

	public GamePiece getPiece() {
		return piece;
	}

	public void setPiece(GamePiece piece) {
		this.piece = piece;
	}

	public Tile getTile() {
		return tile;
	}

	public void setTile(Tile tile) {
		this.tile = tile;
	}

	
}
