package quantum;

import java.util.Vector;

public class Planet extends GamePiece{
	
	private int diceTotal;
	private Vector<Cube> cubes;
	
	public Planet(int diceTotal,int maxCubes){
		this.diceTotal = diceTotal;
		this.cubes = new Vector<Cube>(maxCubes);	
	}
	
	public boolean addCube(Cube cube){
		if (cubes.size()== cubes.capacity()){
			return false;
		}
		for (Cube c : cubes){
			if (c.getOwner() == cube.getOwner()){
				return false;
			}
		}
		cubes.add(cube);
		return true;
	}
	
	public boolean removeCube(Cube cube){
		return cubes.remove(cube);
	}
	
	
}
