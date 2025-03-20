

package main;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import application.GameStage;
//import application.Ship;
/*************************************************************************************************************************
 *
 * CMSC 22 Object-Oriented Programming
 * Multithreading Example (with GUI): Kart
 *
 * (c) Institute of Computer Science, CAS, UPLB
 * @author Miyah Queliste
 *
 *************************************************************************************************************************/
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;



public class GameTimer extends AnimationTimer {
	private GraphicsContext gc;
	private Scene theScene;
	private GameCharacter player1, player2;
	private Image paper = new Image("paper.jpg", 600, 150, false, false);
	private Image player2Sprite;
	private Image player1Sprite;
	private Image heart = new Image("heart.png", 20, 20, false, false);
	private Image gameover = new Image("gameover.png", 500, 500, false, false);
	private Image winning = new Image("winner.png", 500, 500, false, false);
	//private BackgroundImage = buttBg;
	private Image background = new Image("background.jpg", Game.WINDOW_WIDTH,Game.WINDOW_HEIGHT, false, false);
	private Image transpa = new Image("transpa.png", Game.WINDOW_WIDTH, Game.WINDOW_HEIGHT, false, false);
	private long startSpawn;
    private Font theFont = Font.font( "Courier New", FontWeight.BOLD, 15 );
    private String seconds;
    private ImageView returnButton;
    private Pane root;
    private String[] char1select, char2select;
    private Image player1Pic, player2Pic;

    // Last Working 2

    private boolean isInitialized = false;
    private final Set<KeyCode> activeKeys = new HashSet<>(); // Collection of active key controls

    public GameTimer(GraphicsContext gc, Scene theScene, ImageView button2, String[] char1select, String[]char2select, Pane root ) {
    	this.gc = gc;
    	this.theScene = theScene;
    	this.returnButton = button2;
    	this.char1select = char1select;
    	this.char2select = char2select;
    	this.root = root;

    	// These are the kart objects. We can add more in different positions.
//    	this.player1 = new Lili(1, 450, "idlelili/liliidle.png",player1Sprite, 10, "left");
//    	this.player2 = new Yasuo(1100, 450, "agatha.png", player2Sprite, 10, "right");

    	if (this.char1select[0].equals("Ichigo Kurosaki")){
    		this.player1 = new Ichigo(1, 485, "idleIchigo/ichigo1idle.png",player1Sprite, 10, "left");
    		this.player1Pic = new Image("ppfCharacters/ichigokurosakibanner.png", 513, 432, true, true);
    	} else if (this.char1select[0].equals("Mira")){
    		this.player1 = new Mira(1, 485, "mira1idle.png",player1Sprite, 10, "left");
    		this.player1Pic = new Image("ppfCharacters/mirabanner.png", 513, 432, true, true);
    	} else if (this.char1select[0].equals("Escanor")){
    		this.player1 = new Escanor(1, 485, "idleEscanor/escanor1idle.png",player1Sprite, 10, "left");
    		this.player1Pic = new Image("ppfCharacters/escanorbanner.png", 513, 432, true, true);
    	} else if (this.char1select[0].equals("Yasuo")){
    		this.player1 = new Yasuo(1, 485, "idleYasuo/yasuo1idle.png",player1Sprite, 10, "left");
    		this.player1Pic = new Image("ppfCharacters/yasuobanner.png", 513, 432, true, true);
    	} else if (this.char1select[0].equals("Zoro")){
    		this.player1 = new Zoro(1, 485, "idleZoro/zoro1idle.png",player1Sprite, 10, "left");
    		this.player1Pic = new Image("ppfCharacters/zorobanner.png", 513, 432, true, true);
    	} else if (this.char1select[0].equals("Lili")){
    		this.player1 = new Lili(1, 485, "idleLili/lili1idle.png",player1Sprite, 10, "left");
    		this.player1Pic = new Image("ppfCharacters/lilibanner.png", 513, 432, true, true);
    	}

    	if (this.char2select[0].equals("Ichigo Kurosaki")){
    		this.player2 = new Ichigo(1050, 485, "idleIchigo/ichigo1idle.png",player2Sprite, 10, "right");
    		this.player2Pic = new Image("ppfCharacters/ichigokurosakibanner.png", 513, 432, true, true);
    	} else if (this.char2select[0].equals("Mira")){
    		this.player2 = new Mira(1050, 485, "mira1idle.png",player2Sprite, 10, "right");
    		this.player2Pic = new Image("ppfCharacters/mirabanner.png", 513, 432, true, true);

    	} else if (this.char2select[0].equals("Escanor")){
    		this.player2 = new Escanor(1050, 485, "idleEscanor/escanor1idle.png",player2Sprite, 10, "right");
    		this.player2Pic = new Image("ppfCharacters/escanorbanner.png", 513, 432, true, true);

    	} else if (this.char2select[0].equals("Yasuo")){
    		this.player2 = new Yasuo(1050, 485, "idleYasuo/yasuo1idle.png",player2Sprite, 10, "right");
    		this.player2Pic = new Image("ppfCharacters/yasuobanner.png", 513, 432, true, true);

    	} else if (this.char2select[0].equals("Zoro")){
    		this.player2 = new Zoro(1050, 485, "idleZoro/zoro1idle.png",player2Sprite, 10, "right");
    		this.player2Pic = new Image("ppfCharacters/zorobanner.png", 513, 432, true, true);

    	} else if (this.char2select[0].equals("Lili")){
    		this.player2 = new Lili(1050, 485, "idleLili/lili1idle.png",player2Sprite, 10, "right");
    		this.player2Pic = new Image("ppfCharacters/lilibanner.png", 513, 432, true, true);

    	}

    	this.startSpawn = System.nanoTime();

    	// Since the karts are not threads but runnable objects, we create threads here (see Kart class - we implemented the runnable interface)
    	this.handleKeyPressEvent();
    }

    private void handleKeyPressEvent() {
        // Prevent re-registering event handlers
        if (!isInitialized) {
            theScene.setOnKeyPressed(e -> activeKeys.add(e.getCode()));
            theScene.setOnKeyReleased(e -> activeKeys.remove(e.getCode()));
            isInitialized = true;
        }
    }


	private void moveMyShip(double k) {
        //System.out.println(activeKeys);
//		if(activeKeys.contains(KeyCode.UP)) this.theWanda.setDY(-6);
//	    else if(!activeKeys.contains(KeyCode.DOWN)) this.theWanda.setDY(0); // Reset DY if DOWN is not pressed

	    if(activeKeys.contains(KeyCode.LEFT)) this.player2.setDX(-6);
	    else if(!activeKeys.contains(KeyCode.RIGHT)) this.player2.setDX(0); // Reset DX if RIGHT is not pressed

//	    if(activeKeys.contains(KeyCode.DOWN)) this.theWanda.setDY(6);
//	    else if(!activeKeys.contains(KeyCode.UP)) this.theWanda.setDY(0); // Reset DY if UP is not pressed

	    if(activeKeys.contains(KeyCode.RIGHT)) this.player2.setDX(6);
	    else if(!activeKeys.contains(KeyCode.LEFT)) this.player2.setDX(0); // Reset DX if LEFT is not pressed

	    // Same for Vision (the other car object)
//	    if(activeKeys.contains(KeyCode.W)) this.theVision.setDY(-6);
//	    else if(!activeKeys.contains(KeyCode.S)) this.theVision.setDY(0);

	    if(activeKeys.contains(KeyCode.A)) this.player1.setDX(-6);
	    else if(!activeKeys.contains(KeyCode.D)) this.player1.setDX(0);

//	    if(activeKeys.contains(KeyCode.S)) this.theVision.setDY(6);
//	    else if(!activeKeys.contains(KeyCode.W)) this.theVision.setDY(0);

	    if(activeKeys.contains(KeyCode.D)) this.player1.setDX(6);
	    else if(!activeKeys.contains(KeyCode.A)) this.player1.setDX(0);


	    if (player2.hurt){
	    	this.player2.interpolateHurt(k);
	    	player2.setHurtTime(k);
	    	if(player2.hurtTime > 15){
	    		this.player2.setHurt(false);
	    		this.player2.zeroHurtTime();
	    	}
	    }

	    else if(activeKeys.contains(KeyCode.P)) this.player2.interpolateSpcl(k);
	    else if(activeKeys.contains(KeyCode.O)) this.player2.interpolateAttack(k);
	    else if(activeKeys.contains(KeyCode.RIGHT)) this.player2.interpolateWalk(k);
	    else if(activeKeys.contains(KeyCode.LEFT)) this.player2.interpolateWalk(k);
	    else if(activeKeys.contains(KeyCode.DOWN)){
	    	this.player2.interpolateBlock(k);
	    	this.player2.setBlock(true);
	    }
	    else if(!activeKeys.contains(KeyCode.P)) this.player2.interpolateIdle(k);
	    if(!activeKeys.contains(KeyCode.DOWN)) this.player2.setBlock(false);


	    if (player1.hurt){
	    	this.player1.interpolateHurt(k);
	    	player1.setHurtTime(k);
	    	if(player1.hurtTime > 15){
	    		this.player1.setHurt(false);
	    		this.player1.zeroHurtTime();
	    	}
	    }
	    else if(activeKeys.contains(KeyCode.Y)) this.player1.interpolateSpcl(k);
	    else if(activeKeys.contains(KeyCode.T)) this.player1.interpolateAttack(k);
	    else if(activeKeys.contains(KeyCode.D)) this.player1.interpolateWalk(k);
	    else if(activeKeys.contains(KeyCode.A)) this.player1.interpolateWalk(k);
	    else if(activeKeys.contains(KeyCode.S)){
	    	this.player1.interpolateBlock(k);
	    	this.player1.setBlock(true);
	    }
	    else if(!activeKeys.contains(KeyCode.Y)) this.player1.interpolateIdle(k);
	    if(!activeKeys.contains(KeyCode.S)) this.player1.setBlock(false);


		//System.out.println(ke+" key pressed.");
   	}




    // This method is overridden from the AnimationTimer class
	public void handle(long currentNanoTime) {

		// clear the canvas
		returnButton.setVisible(false);
        long currentSec = TimeUnit.NANOSECONDS.toSeconds(currentNanoTime);
		long startSec = TimeUnit.NANOSECONDS.toSeconds(this.startSpawn);
		double mili = TimeUnit.NANOSECONDS.toMillis(currentNanoTime-startSpawn)*(0.001);
		double k = mili - (int) mili;
//		theWanda.interpolate(k);
//		theVision.interpolateIdle(k);

        gc.clearRect(0, 0, Game.WINDOW_WIDTH,Game.WINDOW_HEIGHT);
        gc.drawImage(this.background,0,0);

        gc.drawImage(paper, 10, 30);
        gc.setFill( Color.BLACK );
        gc.setStroke( Color.BLACK );
        gc.setLineWidth(1);
        gc.setFont( theFont );
        gc.fillText( "P2: "+char2select[0], 80, 90 ); //WANDA LABEL FOR LIVES
        gc.strokeText( "P2: "+char2select[0], 80, 90);

        gc.setFill( Color.BLACK );
        gc.fillText( "P1: "+char1select[0], 80, 133 ); //VISION LIVES
        gc.strokeText( "P1: "+char1select[0], 80, 133 );

        gc.setFill( Color.BLACK );
        seconds = "TIMER: "+(300-(currentSec-startSec)+" seconds left.");
        gc.fillText( seconds, 80, 64);
        gc.strokeText( seconds, 80, 64);

        //CHRACTERS LIVES
        for(int i=0; i<player2.showLives(); i++) gc.drawImage(heart, 320 + 20*i, 72);
        for(int i=0; i<player1.showLives(); i++) gc.drawImage(heart, 320 + 20*i, 117);

        //THR GAME WILL STOP HERE IS NO LIFE OR THEY WON
        if((player2.showLives() == 0 || player1.showLives() == 0)){
        	gc.drawImage(transpa, 0, 0);

        	if(player1.showLives()==0 && player2.showLives()==0){
        		gc.drawImage(gameover, 360, 10);
        	}else{
	        	if(player1.showLives()!= 0){
	        		gc.drawImage(player1Pic, 350, 310);
	        		gc.drawImage(winning, 338, 20);
	        	}
	        	if(player2.showLives()!= 0){
	        		gc.drawImage(player2Pic, 350, 310);
	        		gc.drawImage(winning, 338, 20);

	        	}
        	}


        	 if (root.getChildren().contains(returnButton)) {
        	        root.getChildren().remove(returnButton);
        	    }

        	returnButton.setVisible(true);
        	returnButton.setLayoutX(800);
//        	returnButton.setTranslateY(55);
//        	returnButton.setTranslateX(-10);
//
        	returnButton.setLayoutY(375);
//        	//returnButton.setFont(theFont);
//        	returnButton.setScaleX(1);
//        	returnButton.setStyle("-fx-background-color: #b491cB; -fx-border-color: #000000; -fx-text-fill: #000000;");
//        	if((player2.showStatus() && player2.showStatus())){
//        		returnButton.setStyle("-fx-background-color: #6aa68b; -fx-border-color: #000000; -fx-text-fill: #000000;");
//        	}
        	root.getChildren().add(returnButton);
        	player2.isLoser(); //THE WIN BOOLEAN WILL BE FALSE
        	player1.isLoser();
        	this.stop();

        	return;
        }
		//System.out.println(currentSec-startSec);

        // render() is from the Sprite class which draws the kart images on the canvas
        this.moveMyShip(k);
		this.player2.move();
		this.player1.move();

		//render the ship
		this.player2.render(gc);
		this.player1.render(gc);

		//this.player1.isWith(player2);
		this.player1.isAttacking(player2);
		this.player2.isAttacking(player1);
		this.player1.changeDirection(player2);

        if(currentSec - startSec >= 300 ){//IF THE COUNTDOWN IS 0
        	player2.endLives();
        	player1.endLives();
        }


    }
}
