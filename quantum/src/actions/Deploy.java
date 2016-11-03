package actions;

import board.GameBoard;
import board.Square;
import quantum.Planet;
import quantum.Player;
import ships.Ship;

public class Deploy extends GameAction {

	private Player player;
	private Ship ship;
	private Square square;

	
	public Deploy(Player player, Ship ship, Square square) {
		this.player = player;
		this.ship = ship;
		this.square = square;
	}

	@Override
	public boolean isValid(GameBoard board) {
		
		if (player == null || ship == null || square == null){
			return false;
		}
		
		Planet planet = square.getTile().getPlanet();
		if (!planet.hasCube(player)){
			return false;
		}
		if (square.getPiece() != null){
			return false;
		}
		
		if (!board.isOrbital(square, player)){
			return false;
		}
		
		return true;
		
	}

	@Override
	public void doAction(GameBoard board) {
		player.deployShip(ship);
		square.setPiece(ship);
	}

}
