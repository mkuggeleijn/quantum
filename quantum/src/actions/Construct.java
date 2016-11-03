package actions;

import board.GameBoard;
import quantum.Cube;
import quantum.Planet;
import quantum.Player;

public class Construct extends GameAction {

	Player player;
	Planet planet;
	
	public Construct(Player player, Planet planet){
		this.player = player;
		this.planet = planet;
	}
	
	@Override
	public boolean isValid(GameBoard board) {
		if (player == null || planet == null){
			return false;
		}
		if (player.getCubes().size() == 0){ // This should never trigger, but just to be on the safe side
			return false;
		}
		if (!planet.canAddCube(player)){
			return false;
		}
		return true;
	}

	@Override
	public void doAction(GameBoard board) {
		planet.addCube(player.removeCube());	
	}

}
