package board;

import java.awt.Point;
import java.util.Vector;

import quantum.Direction;
import quantum.GamePiece;
import quantum.GameSettings;
import quantum.Planet;
import quantum.Player;
import ships.Ship;

public class GameBoard {

	private Tile[][] tiles;
	private Square[][] squares;
	
	
	public Vector<Square> getCardinalNeighbours(Square square){
		return getSquareNeighbours(square,Direction.cardinals());
	}
	
	public Vector<Square> getDiagonalNeighbours(Square square){
		return getSquareNeighbours(square,Direction.diagonals());
	}
	
	public Vector<Square> getAllNeighbours(Square square){
		return getSquareNeighbours(square,Direction.values());
	}	
	
	public boolean validPath(Ship ship, Square target){
		Point startCoords = squareToBoardCoords(ship.getSquare());
		Point endCoords = squareToBoardCoords(target);
		GamePiece endPiece = squares[endCoords.x][endCoords.y].getPiece();
		if (endPiece != null){
			if (endPiece instanceof Planet){ // Can't drive into a planet!
				return false;
			}
			if (endPiece instanceof Ship){
				// Will this work with subtyping?
				Ship endShip = (Ship) endPiece;
				if (endShip.getOwner() == ship.getOwner()){ // Can't attack own ships
					return false;
				}
			}
		}
		// Pathfinding algorithm goes here
		return true;
	}
	
	public boolean isShipInOrbit(Planet planet, Player player){
		Direction[] directions = orbitCheck(player);
		Point planetCoords = squareToBoardCoords(planet.getSquare());
		for (Direction d : directions){
			int x = planetCoords.x + d.toOffset().x;
			int y = planetCoords.y + d.toOffset().y;
			if (x >= 0 && x < squares.length && y >=0 && y < squares[x].length && squares[x][y] != null){
				GamePiece piece = squares[x][y].getPiece();
				if (piece !=null && piece instanceof Ship){
					Ship ship = (Ship) piece;
					if (ship.getOwner() == player){
						return true;
					}
				}
			}
		}
		return false;	
	}
	
	public boolean isOrbital(Square square, Player player){
		Direction[] directions = orbitCheck(player);
		Point squareCoords = squareToBoardCoords(square);
		for (Direction d : directions){
			int x = squareCoords.x + d.toOffset().x;
			int y = squareCoords.y + d.toOffset().y;
			if (x >= 0 && x < squares.length && y >=0 && y < squares[x].length && squares[x][y] != null){
				if (squares[x][y].getPiece() instanceof Planet){
					return true;
				}
			}
		}
		return false;
	}
	
	private Direction[] orbitCheck(Player player){
		// check if that card
		// else
		return Direction.cardinals();
	}
	
	private Vector<Square> getSquareNeighbours(Square square, Direction[] directions){
		Point squareCoords = squareToBoardCoords(square);
		Vector<Square> neighbours = new Vector<Square>(directions.length);
		for (Direction d : directions){
			int x = squareCoords.x + d.toOffset().x;
			int y = squareCoords.y + d.toOffset().y;
			if (x >= 0 && x < squares.length && y >=0 && y < squares[x].length && squares[x][y] != null){
				neighbours.add(squares[x][y]);
			}
		}
		
		return neighbours;
	}
	
	private Point squareToBoardCoords(Square square){
		Tile tile = square.getTile();
		int x = tile.getX()*GameSettings.getTileSize()+square.getX();
		int y = tile.getY()*GameSettings.getTileSize()+square.getY();
		return new Point(x,y);
	}
	
	
}
