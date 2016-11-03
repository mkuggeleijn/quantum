package quantum;

import java.util.Vector;

import ships.Ship;
import ships.ShipFactory;

public class Player {

	private String faction;
	
	private int dominance;
	private int research;
	private Vector<Ship> ships;
	private Vector<Ship> expansion;
	private Vector<Ship> scrapyard;
	
	private Vector<Cube> cubes;
	
	public Player(String faction){
		this.setFaction(faction);
		this.dominance = 0;
		this.research = 0;
		this.scrapyard = new Vector<Ship>(GameSettings.getMaxShips());
		this.ships = new Vector<Ship>(GameSettings.getMaxShips());
		this.setExpansion(new Vector<Ship>(GameSettings.getMaxExpansion())); 
		resetCubes();
	}
	
	private void resetCubes(){
		this.cubes = new Vector<Cube>(GameSettings.getMaxCubes());
		for (int x = 0; x < cubes.capacity(); x++){
			cubes.add(new Cube(this));
		}
	}
	
	
	public void addCube(Cube cube){
		if (cubes.size() != cubes.capacity()){
			cubes.add(cube);
		}
	}
	public void addCube(){
		addCube(new Cube(this));
	}
	
	public Cube removeCube(){
		Cube cube = cubes.lastElement();
		cubes.remove(cube);
		return cube;
	}
	
	public void deployShip(Ship ship){
		scrapyard.remove(ship);
		ships.add(ship);
	}
	
	public void shipDestroyed(Ship ship){
		ships.remove(ship);
		ShipFactory.rerollShip(ship);  // potential memory leak?
		scrapyard.add(ship);
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

	public Vector<Ship> getExpansion() {
		return expansion;
	}

	public void setExpansion(Vector<Ship> expansion) {
		this.expansion = expansion;
	}

	public String getFaction() {
		return faction;
	}

	public void setFaction(String faction) {
		this.faction = faction;
	}

	public Vector<Cube> getCubes() {
		return cubes;
	}
	
	
	
}
