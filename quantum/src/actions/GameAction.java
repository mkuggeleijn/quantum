package actions;

import Board.GameBoard;

public abstract class GameAction {
	
	public abstract boolean isValid(GameBoard board);
	public abstract void doAction(GameBoard board);
	
}
