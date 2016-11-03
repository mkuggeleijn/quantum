package quantum;

import java.awt.Point;

public enum Direction {
	N, NE, E, SE, S, SW, W;
	
	public Point toOffset(){
		int x = 0;
		int y = 0;
		switch (this){
		case N:
			y = -1;
			break;
		case NE:
			y = -1;
			x = 1;
			break;
		case E:
			x = 1;
			break;
		case SE:
			x = 1;
			y = 1;
			break;
		case S:
			y = 1;
			break;
		case SW:
			x = -1;
			y = 1;
			break;
		case W:
			x = -1;
			break;
		}
		return new Point(x,y);
	}
}
