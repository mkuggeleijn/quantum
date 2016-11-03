package quantum;

import java.util.Vector;

import ships.Ship;

public class Player {

	private String faction;
	
	private int dominance;
	private int research;
	private Vector<Ship> scrapyard;
	private Vector<Ship> ships;
	private Vector<Cube> cubes;
	
	public Player(String faction){
		this.faction = faction;
		this.dominance = 0;
		this.research = 0;
		this.scrapyard = new Vector<Ship>(GameSettings.getMaxShips());
		this.ships = new Vector<Ship>(GameSettings.getMaxShips());
		resetCubes();
	}
	
	private void resetCubes(){
		this.cubes = new Vector<Cube>(GameSettings.getMaxCubes());
		for (int x = 0; x < cubes.capacity(); x++){
			cubes.add(new Cube(this));
		}
	}
	
	public void shipDestroyed(Ship ship){
		ships.remove(ship);
		ships.add(ship);
	}

	public int getDominance() {
		return dominance;
	}

	public void setDominance(int dominance) {
		this.dominance = dominance;
	}
	
	public void addDominance(){
		this.dominance++;
	}
	
	public void removeDominance(){
		if (dominance > 0){
			this.dominance--;
		}
		
	}

	public int getResearch() {
		return research;
	}

	public void setResearch(int research) {
		this.research = research;
	}
	
	public void addResearch(){
		this.research++;
	}
	
	public void removeResearch(){
		if (this.research > 0){
			this.research--;
		}
	}
	
	
	
}
