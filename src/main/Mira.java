package main;

import javafx.scene.image.Image;

public class Mira extends GameCharacter{

	public Mira(double x, double y, String filename, Image image, int count, String name) {
		super(x,y, filename, image, count, name);
		this.flip();
	}


}
