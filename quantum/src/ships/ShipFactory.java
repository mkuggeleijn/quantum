package ships;

import quantum.DiceHandler;
import quantum.Player;

public class ShipFactory {
	

	public static Ship rollShip(Player p){
		Ship newShip;
		int roll = DiceHandler.rollD6();
		switch(roll){
		case 2:
			newShip = new Flagship();
			break;
		case 3:
			newShip = new Destroyer();
			break;
		case 4:
			newShip = new Frigate();
			break;
		case 5:
			newShip = new Interceptor();
			break;
		case 6:
			newShip = new Scout();
			break;
		default:
			newShip = new BattleStation();
			break;
		}	
		newShip.setOwner(p);
		return newShip;
	}
	
	public static void rerollShip(Ship oldShip){
		Ship newShip = rollShip(oldShip.getOwner());
		while (newShip.getClass() == oldShip.getClass()){
			newShip = rollShip(oldShip.getOwner());
		}
		oldShip = newShip;
	}
	

}
