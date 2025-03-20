package main;
/*************************************************************************************************************************
 *
 * CMSC 22 Object-Oriented Programming
 * Multithreading Example (with GUI): Kart
 *
 * (c) Institute of Computer Science, CAS, UPLB
 * @author Miyah Queliste
 *
 *************************************************************************************************************************/
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
//import example2.Sprite;
import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;

public class Sprite {
	protected Image img;
	protected ImageView imageview;
	protected double xPos, yPos;
    protected int count;
	protected double width;
	protected double height;
    protected int offsetX = 0;
    protected int offsetY = 30;
    protected int lastIndex;
    protected final int SIZE = 256;

    public Sprite(double xPos, double yPos, String filename, Image image, int count){
		this.xPos = xPos;
		this.yPos = yPos;
		this.loadImage(filename, image);
		this.count = count;
	}
//  ImageView imageView = new ImageView(IMAGE);
//  IcropImage(originalImage, cropX, cropY, cropWidth, cropHeight);
//  imageView = new croo(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));


    protected void interpolate(double k) {
        final int index = Math.min((int) Math.floor(k * count), count - 1);
        if (index != lastIndex) {
            final int x = (int) ((index) * width  + offsetX);
            System.out.println(index);
            this.imageview.setViewport(new Rectangle2D(x, offsetY, (int) width, (int) height));
            System.out.println("hihiew");
            lastIndex = index;
        }
    }

	private void setSize(){
		this.width = this.img.getWidth();
        this.height = this.img.getHeight();
	}

	protected void loadImage(String filename, Image img){
		try{
			this.img = new Image(filename);
	        this.setSize();
		} catch(Exception e)	{
			e.printStackTrace();
		}
	}

	public void render(GraphicsContext gc){
        gc.drawImage( this.img, this.xPos, this.yPos );
    }

	public Image getImage(){
		return this.img;
	}

	public double getXPos(){
		return this.xPos;
	}

	public double getYPos(){
		return this.yPos;
	}

	public void setXPos(int xPos){
		this.xPos = xPos;
	}

	public void setYPos(int yPos){
		this.yPos = yPos;
	}

	public boolean collidesWith(Sprite rect2)	{
		Rectangle2D rectangle1 = this.getBounds();
		Rectangle2D rectangle2 = rect2.getBounds();

		return rectangle1.intersects(rectangle2);
	}
	//method that will return the bounds of an image
	private Rectangle2D getBounds(){
		return new Rectangle2D(this.xPos, this.yPos, this.width, this.height);
	}


}
