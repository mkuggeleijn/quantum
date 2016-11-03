package actions;

import board.GameBoard;
import board.Square;
import ships.Ship;

public class Move extends GameAction{
	
	Ship ship;
	Square square;
	
	public Move(Ship ship, Square square){
		this.ship = ship;
		this.square = square;
	}

	@Override
	public boolean isValid(GameBoard board) {
		if (ship == null || square == null){
			return false;
		}
		if (!board.validPath(ship, square)){
			return false;
		}
		return true;
	}

	@Override
	public void doAction(GameBoard board) {
		// TODO Auto-generated method stub
		
	}

}
