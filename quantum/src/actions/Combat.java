package actions;

import board.GameBoard;
import quantum.DiceHandler;
import ships.Ship;

public class Combat extends GameAction{

	private Ship attacker;
	private Ship defender;
	
	public Combat(Ship attacker, Ship defender){
		this.attacker = attacker;
		this.defender = defender;
	}

	@Override
	public boolean isValid(GameBoard board) {
		// TODO Auto-generated method stub
		if (attacker == null || defender == null){
			return false;
		}
		if (attacker.getOwner() == defender.getOwner()){
			return false;
		}
		return true;
	}

	@Override
	public void doAction(GameBoard board) {
		// This needs extending to deal with boosts
		
		int attackRoll = DiceHandler.rollD6() + attacker.getAttack();
		int defenceRoll = DiceHandler.rollD6() + defender.getDefense();
		if (attackRoll <= defenceRoll){
			// Attacker wins
		} else {
			// Defender wins
		}
		
		
		
	}
	
}
