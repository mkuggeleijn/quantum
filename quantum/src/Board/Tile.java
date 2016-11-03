package Board;

import java.awt.Point;

import quantum.Direction;
import quantum.Planet;

public class Tile extends BoardElement{

	private Planet planet;
	private Square[][] squares;
	
	public Tile(int diceTotal, int cubeSpaces){
		setupTile(3,3,new Planet(diceTotal,cubeSpaces),2,2);
	}
	
	public void setupTile(int dx, int dy, Planet planet, int planetX, int planetY){
		squares = new Square[dx][dy];
		for (int x = 0; x < dx; x++){
			for (int y = 0; y < dy; y++){
				squares[x][y] = new Square();
			}
		}
		if (planet != null){
			this.planet = planet;
			squares[planetX][planetY].setPiece(planet);
		}
		
	}
	
	
	
	@Override
	public void addNeighbour(Direction d, BoardElement e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNeighbour(int x, int y, BoardElement e) {
		// TODO Auto-generated method stub
		
	}

}
