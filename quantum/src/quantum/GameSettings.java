package quantum;

import java.awt.Point;



public class GameSettings {

	private static int tileSize;
	private static int maxShips;
	private static int maxCubes;
	private static int maxExpansion;
	private static Point planetCoords;
	
	public GameSettings(){
		setMaxShips(5);
		setMaxCubes(5);
		setMaxExpansion(2);
		setTileSize(3);
		setPlanetCoords(new Point(2,2));
	}
	
	
	public static int getMaxShips() {
		return maxShips;
	}
	private static void setMaxShips(int maxShips) {
		GameSettings.maxShips = maxShips;
	}
	public static int getMaxCubes() {
		return maxCubes;
	}
	private static void setMaxCubes(int maxCubes) {
		GameSettings.maxCubes = maxCubes;
	}


	public static int getMaxExpansion() {
		return maxExpansion;
	}


	private static void setMaxExpansion(int maxExpansion) {
		GameSettings.maxExpansion = maxExpansion;
	}


	public static int getTileSize() {
		return tileSize;
	}


	public static void setTileSize(int tileSize) {
		GameSettings.tileSize = tileSize;
	}


	public static Point getPlanetCoords() {
		return planetCoords;
	}


	public static void setPlanetCoords(Point planetCoords) {
		GameSettings.planetCoords = planetCoords;
	}
	

	
}
