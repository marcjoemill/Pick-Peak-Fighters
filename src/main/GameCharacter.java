package main;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;

public class GameCharacter extends Sprite{
	protected String name;
	protected boolean block = false;
	protected double hurtTime = 0;
	protected int dx, dy, lives;
	protected static boolean keepPlaying = true;
	protected boolean win = false;
	protected boolean hurt = false;
	protected Image atk1 = new Image("1.png");
	protected Image atk2 = new Image("2.png");
	protected Image atk3 = new Image("3.png");
	protected Image atk4 = new Image("4.png");
	protected Image atk5 = new Image("5.png");
	protected Image atk6 = new Image("6.png");
	protected Image atk7 = new Image("7.png");
	protected Image atk8 = new Image("8.png");
	protected Image atk9 = new Image("9.png");
	protected Image atk10 = new Image("10.png");
	protected Image idle1 = new Image("mira1idle.png");
	protected Image idle2 = new Image("mira1idle1.png");
	protected Image idle3 = new Image("mira1idle2.png");
	protected Image idle4 = new Image("mira1idle3.png");
	protected Image idle5 = new Image("mira1idle4.png");
	protected Image idle6 = new Image("mira1idle5.png");
	protected Image idle7 = new Image("mira1idle6.png");
	protected Image idle8 = new Image("mira1idle7.png");
	protected Image idle9 = new Image("mira1idle8.png");
	protected Image idle10 = new Image("mira1idle9.png");
	protected Image run1 = new Image("mira1run.png");
	protected Image run2 = new Image("mira1run1.png");
	protected Image run3 = new Image("mira1run2.png");
	protected Image run4 = new Image("mira1run3.png");
	protected Image run5 = new Image("mira1run4.png");
	protected Image run6 = new Image("mira1run5.png");
	protected Image run7 = new Image("mira1run6.png");
	protected Image run8 = new Image("mira1run7.png");
	protected Image run9 = new Image("mira1run8.png");
	protected Image run10 = new Image("mira1run9.png");
	protected Image block1 = new Image("mira1block.png");
	protected Image block2 = new Image("mira1block1.png");
	protected Image block3 = new Image("mira1block2.png");
	protected Image spcl1 = new Image("mira1spcl.png");
	protected Image spcl2 = new Image("mira1spcl1.png");
	protected Image spcl3 = new Image("mira1spcl2.png");
	protected Image spcl4 = new Image("mira1spcl3.png");
	protected Image spcl5 = new Image("mira1spcl4.png");
	protected Image spcl6 = new Image("mira1spcl5.png");
	protected Image spcl7 = new Image("mira1spcl6.png");
	protected Image spcl8 = new Image("mira1spcl7.png");
	protected Image spcl9 = new Image("mira1spcl8.png");
	protected Image spcl10 = new Image("mira1spcl9.png");
	protected Image hurt1 = new Image("mira1spcl.png");
	protected Image hurt2 = new Image("mira1spcl1.png");
	protected Image hurt3 = new Image("mira1spcl2.png");
	protected Image hurt4 = new Image("mira1spcl1.png");
	protected Image hurt5 = new Image("mira1spcl.png");
	protected Image hurt6 = new Image("mira1spcl2.png");
	protected Image hurt7 = new Image("mira1spcl.png");
	protected Image hurt8 = new Image("mira1spcl1.png");
	protected Image hurt9 = new Image("mira1spcl2.png");
	protected Image hurt10 = new Image("mira1spcl1.png");




	private final static int TOTAL_YDISTANCE = 1080;
	private final static int TOTAL_XDISTANCE = 1980;
	// you can use new Image("path",width,height,false,false); if you want to scale your image

	public GameCharacter(double x, double y, String filename, Image image, int count, String name){
		super(x,y, filename, image, count);
		this.name=name;
		this.lives = 10;
	}

	protected void flip(){
		if(name == "left"){
			name = "right";
			atk1 = new Image("1.png");
			atk2 = new Image("2.png");
			atk3 = new Image("3.png");
			atk4 = new Image("4.png");
			atk5 = new Image("5.png");
			atk6 = new Image("6.png");
			atk7 = new Image("7.png");
			atk8 = new Image("8.png");
			atk9 = new Image("9.png");
			atk10 = new Image("10.png");
			idle1 = new Image("mira1idle.png");
			idle2 = new Image("mira1idle1.png");
			idle3 = new Image("mira1idle2.png");
			idle4 = new Image("mira1idle3.png");
			idle5 = new Image("mira1idle4.png");
			idle6 = new Image("mira1idle5.png");
			idle7 = new Image("mira1idle6.png");
			idle8 = new Image("mira1idle7.png");
			idle9 = new Image("mira1idle8.png");
			idle10 = new Image("mira1idle9.png");
			run1 = new Image("mira1run.png");
			run2 = new Image("mira1run1.png");
			run3 = new Image("mira1run2.png");
			run4 = new Image("mira1run3.png");
			run5 = new Image("mira1run4.png");
			run6 = new Image("mira1run5.png");
			run7 = new Image("mira1run6.png");
			run8 = new Image("mira1run7.png");
			run9 = new Image("mira1run8.png");
			run10 = new Image("mira1run9.png");
			block1 = new Image("mira1block.png");
			block2 = new Image("mira1block1.png");
			block3 = new Image("mira1block2.png");
			spcl1 = new Image("mira1spcl.png");
			spcl2 = new Image("mira1spcl1.png");
			spcl3 = new Image("mira1spcl2.png");
			spcl4 = new Image("mira1spcl3.png");
			spcl5 = new Image("mira1spcl4.png");
			spcl6 = new Image("mira1spcl5.png");
			spcl7 = new Image("mira1spcl6.png");
			spcl8 = new Image("mira1spcl7.png");
			spcl9 = new Image("mira1spcl8.png");
			spcl10 = new Image("mira1spcl9.png");
			hurt1 = new Image("mira1spcl.png");
			hurt2 = new Image("mira1spcl1.png");
			hurt3 = new Image("mira1spcl2.png");
			hurt4 = new Image("mira1spcl1.png");
			hurt5 = new Image("mira1spcl.png");
			hurt6 = new Image("mira1spcl2.png");
			hurt7 = new Image("mira1spcl.png");
			hurt8 = new Image("mira1spcl1.png");
			hurt9 = new Image("mira1spcl2.png");
			hurt10 = new Image("mira1spcl1.png");




		}else{
			name = "left";
			atk1 = new Image("revattackMira/mira1attack.png");
			atk2 = new Image("revattackMira/mira1attack1.png");
			atk3 = new Image("revattackMira/mira1attack2.png");
			atk4 = new Image("revattackMira/mira1attack3.png");
			atk5 = new Image("revattackMira/mira1attack4.png");
			atk6 = new Image("revattackMira/mira1attack5.png");
			atk7 = new Image("revattackMira/mira1attack6.png");
			atk8 = new Image("revattackMira/mira1attack7.png");
			atk9 = new Image("revattackMira/mira1attack8.png");
			atk10 = new Image("revattackMira/mira1attack9.png");
			idle1 = new Image("revidleMira/mira1idle.png");
			idle2 = new Image("revidleMira/mira1idle1.png");
			idle3 = new Image("revidleMira/mira1idle2.png");
			idle4 = new Image("revidleMira/mira1idle3.png");
			idle5 = new Image("revidleMira/mira1idle4.png");
			idle6 = new Image("revidleMira/mira1idle5.png");
			idle7 = new Image("revidleMira/mira1idle6.png");
			idle8 = new Image("revidleMira/mira1idle7.png");
			idle9 = new Image("revidleMira/mira1idle8.png");
			idle10 = new Image("revidleMira/mira1idle9.png");
			run1 = new Image("revrunMira/mira1run.png");
			run2 = new Image("revrunMira/mira1run1.png");
			run3 = new Image("revrunMira/mira1run2.png");
			run4 = new Image("revrunMira/mira1run3.png");
			run5 = new Image("revrunMira/mira1run4.png");
			run6 = new Image("revrunMira/mira1run5.png");
			run7 = new Image("revrunMira/mira1run6.png");
			run8 = new Image("revrunMira/mira1run7.png");
			run9 = new Image("revrunMira/mira1run8.png");
			run10 = new Image("revrunMira/mira1run9.png");
			block1 = new Image("revblockMira/mira1block.png");
			block2 = new Image("revblockMira/mira1block1.png");
			block3 = new Image("revblockMira/mira1block2.png");
			spcl1 = new Image("revspclMira/mira1spcl.png");
			spcl2 = new Image("revspclMira/mira1spcl1.png");
			spcl3 = new Image("revspclMira/mira1spcl2.png");
			spcl4 = new Image("revspclMira/mira1spcl3.png");
			spcl5 = new Image("revspclMira/mira1spcl4.png");
			spcl6 = new Image("revspclMira/mira1spcl5.png");
			spcl7 = new Image("revspclMira/mira1spcl6.png");
			spcl8 = new Image("revspclMira/mira1spcl7.png");
			spcl9 = new Image("revspclMira/mira1spcl8.png");
			spcl10 = new Image("revspclMira/mira1spcl9.png");
			hurt1 = new Image("revspclMira/mira1spcl.png");
			hurt2 = new Image("revspclMira/mira1spcl1.png");
			hurt3 = new Image("revspclMira/mira1spcl2.png");
			hurt4 = new Image("revspclMira/mira1spcl1.png");
			hurt5 = new Image("revspclMira/mira1spcl.png");
			hurt6 = new Image("revspclMira/mira1spcl2.png");
			hurt7 = new Image("revspclMira/mira1spcl.png");
			hurt8 = new Image("revspclMira/mira1spcl1.png");
			hurt9 = new Image("revspclMira/mira1spcl2.png");
			hurt10 = new Image("revspclMira/mira1spcl1.png");






		}
	}

	public void move() {
    	this.xPos += this.dx;
    	this.yPos += this.dy;
    	if(xPos < -100) xPos = -90;
    	if(xPos > Game.WINDOW_WIDTH-190) xPos = Game.WINDOW_WIDTH-200;
	}
	public void setDX(int dx){
		this.dx = dx;
	}

	public void setDY(int dy){
		this.dy = dy;
	}

	public void collide(){
		this.lives -= 1;
	}

	public int showLives(){
		return this.lives;
	}

	public boolean checkBlock(){
		if( block1 == img || block2 == img || block3 == img){
			return true;
		}
		return false;
	}
    protected void interpolateIdle(double k) {
        final int index = Math.min((int) Math.floor(k * count), count - 1);
        if (index != lastIndex) {
            final int x = (int) ((index) * width  + offsetX);
            if(index == 0){
            	this.img = idle1;
            }else if(index == 1){
            	this.img = idle2;
            }else if(index == 2){
            	this.img = idle3;
            }else if(index == 3){
            	this.img = idle4;
            }else if(index == 4){
            	this.img = idle5;
            }else if(index == 5){
            	this.img = idle6;
            }else if(index == 6){
            	this.img = idle7;
            }else if(index == 7){
            	this.img = idle8;
            }else if(index == 8){
            	this.img = idle9;
            }else if(index == 9){
            	this.img = idle10;
            }
            lastIndex = index;
        }
    }

    protected void interpolateWalk(double k) {
        final int index = Math.min((int) Math.floor(k * count), count - 1);
        if (index != lastIndex) {
            final int x = (int) ((index) * width  + offsetX);
            if(index == 0){
            	this.img = run1;
            }else if(index == 1){
            	this.img = run2;
            }else if(index == 2){
            	this.img = run3;
            }else if(index == 3){
            	this.img = run4;
            }else if(index == 4){
            	this.img = run5;
            }else if(index == 5){
            	this.img = run6;
            }else if(index == 6){
            	this.img = run7;
            }else if(index == 7){
            	this.img = run8;
            }else if(index == 8){
            	this.img = run9;
            }else if(index == 9){
            	this.img = run10;
            }
            lastIndex = index;
        }
    }

    protected void interpolateAttack(double k) {
        final int index = Math.min((int) Math.floor(k * count), count - 1);
        if (index != lastIndex) {
            final int x = (int) ((index) * width  + offsetX);
            if(index == 0){
            	this.img = atk1;
            }else if(index == 1){
            	this.img = atk2;
            }else if(index == 2){
            	this.img = atk3;
            }else if(index == 3){
            	this.img = atk4;
            }else if(index == 4){
            	this.img = atk5;
            }else if(index == 5){
            	this.img = atk6;
            }else if(index == 6){
            	this.img = atk7;
            }else if(index == 7){
            	this.img = atk8;
            }else if(index == 8){
            	this.img = atk9;
            }else if(index == 9){
            	this.img = atk10;
            }
            lastIndex = index;
        }
    }

    protected void interpolateBlock(double k) {
        final int index = Math.min((int) Math.floor(k * count), count - 1);
        if (index != lastIndex) {
            final int x = (int) ((index) * width  + offsetX);
            if(index == 0){
            	this.img = block1;
            }else if(index == 1){
            	this.img = block2;
            }else if(index == 2){
            	this.img = block3;
            }else if(index == 3){
            	this.img = block1;
            }else if(index == 4){
            	this.img = block2;
            }else if(index == 5){
            	this.img = block3;
            }else if(index == 6){
            	this.img = block1;
            }else if(index == 7){
            	this.img = block3;
            }else if(index == 8){
            	this.img = block2;
            }else if(index == 9){
            	this.img = block3;
            }
            lastIndex = index;
        }
    }

    protected void interpolateSpcl(double k) {
        final int index = Math.min((int) Math.floor(k * count), count - 1);
        if (index != lastIndex) {
            final int x = (int) ((index) * width  + offsetX);
            if(index == 0){
            	this.img = spcl1;
            }else if(index == 1){
            	this.img = spcl2;
            }else if(index == 2){
            	this.img = spcl3;
            }else if(index == 3){
            	this.img = spcl4;
            }else if(index == 4){
            	this.img = spcl5;
            }else if(index == 5){
            	this.img = spcl6;
            }else if(index == 6){
            	this.img = spcl7;
            }else if(index == 7){
            	this.img = spcl8;
            }else if(index == 8){
            	this.img = spcl9;
            }else if(index == 9){
            	this.img = spcl10;
            }
            lastIndex = index;
        }
    }

    protected void interpolateHurt(double k) {
        final int index = Math.min((int) Math.floor(k * count), count - 1);
        if (index != lastIndex) {
            final int x = (int) ((index) * width + offsetX);
            if (index == 0) {
                this.img = hurt1;
            } else if (index == 1) {
                this.img = hurt2;
            } else if (index == 2) {
                this.img = hurt3;
            } else if (index == 3) {
                this.img = hurt4;
            } else if (index == 4) {
                this.img = hurt5;
            } else if (index == 5) {
                this.img = hurt6;
            } else if (index == 6) {
                this.img = hurt7;
            } else if (index == 7) {
                this.img = hurt8;
            } else if (index == 8) {
                this.img = hurt9;
            } else if (index == 9) {
                this.img = hurt10;
            }
            lastIndex = index;
        }
    }


    public String getName(){
    	return this.name;
    }

    public void changeDirection(GameCharacter otherPlayer){
    	if( this.name == "right" && this.xPos > otherPlayer.getXPos()){
    		flip();
    		otherPlayer.flip();
    	}
    	if( this.name == "left" && this.xPos < otherPlayer.getXPos()){
    		flip();
    		otherPlayer.flip();
    	}
    }
	public void endLives(){
		this.lives = 0;
	}

	public boolean showStatus(){
		return win;
	}


	public void isWinner(){
		win = true;
	}

	public void isLoser(){
		win = false;
	}

	public void isWith(GameCharacter rect2)	{
		Rectangle2D rectangle1 = this.getHitbox();
		Rectangle2D rectangle2 = rect2.getHitbox();

		if(rectangle1.intersects(rectangle2)){
			this.xPos -= 10;
			rect2.xPos += 10;
		};
	}
	//method that will return the bounds of an image
	private Rectangle2D getHitbox(){
		return new Rectangle2D(this.xPos, this.yPos, 30, 128);
	}


	public boolean attackBoxExist(){
		if(atk6 == img || atk7 == img || atk8 == img || spcl2 == img || spcl7 == img ) return true;
		return false;
	}
	public Rectangle2D getAttackbox(){
		if(name == "left"){
			if(atk6 == img) return new Rectangle2D(this.xPos-100, this.yPos, 60, 128);
			if(atk7 == img) return new Rectangle2D(this.xPos-100, this.yPos-20, 60, 128);
			if(atk8 == img) return new Rectangle2D(this.xPos-100, this.yPos, 60, 128);
			if(spcl2 == img) return new Rectangle2D(this.xPos-90, this.yPos-60, 60, 128);
			return new Rectangle2D(this.xPos-90, this.yPos-50, 30, 80);
		} else{
			if(atk6 == img) return new Rectangle2D(this.xPos+100, this.yPos, 60, 128);
			if(atk7 == img) return new Rectangle2D(this.xPos+100, this.yPos-20, 60, 128);
			if(atk8 == img) return new Rectangle2D(this.xPos+100, this.yPos, 60, 128);
			if(spcl2 == img) return new Rectangle2D(this.xPos+90, this.yPos-60, 60, 128);
			return new Rectangle2D(this.xPos-90, this.yPos+50, 60, 80);
		}
	}

	public void setBlock(boolean state){
		block = state;
	}


	public void setHurt(boolean state){
		this.hurt = state;
	}

	public void setHurtTime(double k){
		this.hurtTime += k;
	}
	public void zeroHurtTime(){
		this.hurtTime = 0;
	}
	public void isAttacking(GameCharacter rect2)	{
		if(!attackBoxExist()) return;
		if(rect2.block) return;
		Rectangle2D rectangle1 = this.getAttackbox();
		Rectangle2D rectangle2 = rect2.getHitbox();

		if(rectangle1.intersects(rectangle2)){
			rect2.setHurt(true);
			for(int i = 0; i<20; i++) System.out.println("tumama");

			if(this.xPos < rect2.xPos){
				this.xPos -= 20;
				rect2.xPos += 100;
				rect2.collide();
			} else {
				this.xPos += 20;
				rect2.xPos -= 100;
				rect2.collide();
			}
		};
	}


}
