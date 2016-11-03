package quantum;

public class GameSettings {

	private static int maxShips;
	private static int maxCubes;
	
	public GameSettings(){
		setMaxShips(5);
		setMaxCubes(5);
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
	

	
}
