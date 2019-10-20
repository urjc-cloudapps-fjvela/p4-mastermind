package mastermind.models;

import java.util.ArrayList;
import java.util.List;

import mastermind.types.Color;

public abstract class Combination {
	
	public static final int WIDTH = 4;

	protected List<Color> colors;
	
	protected Combination (){
		this.colors = new ArrayList<Color>();
	}
	
	public int getWidth() {
		return Combination.WIDTH;
	}
	
}
