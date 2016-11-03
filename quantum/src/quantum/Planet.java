package quantum;

import java.util.Vector;

public class Planet extends GamePiece{
	
	private int diceTotal;
	private Vector<Cube> cubes;
	
	public Planet(int diceTotal,int maxCubes){
		this.diceTotal = diceTotal;
		this.cubes = new Vector<Cube>(maxCubes);	
	}
	
	public boolean hasCube(Player player){
		for (Cube cube : cubes){
			if (cube.getOwner() == player){
				return true;
			}
		}
		return false;
	}
	
	public boolean canAddCube(Player player){
		if (cubes.size()== cubes.capacity()){
			return false;
		}
		for (Cube c : cubes){
			if (c.getOwner() == player){
				return false;
			}
		}
		return true;
	}
	
	public void addCube(Cube cube){
		cubes.add(cube);
	}
	
	public boolean removeCube(Cube cube){
		return cubes.remove(cube);
	}
	
	
}
