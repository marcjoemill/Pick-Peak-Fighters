package main;

import javafx.scene.image.Image;

public class Ichigo extends GameCharacter{

	public Ichigo(double x, double y, String filename, Image image, int count, String name) {
		super(x,y, filename, image, count, name);
		this.flip();
	}

	protected void flip(){
		if(name == "left"){
			name = "right";
			atk1 = new Image("attackIchigo/ichigo1attack.png");
			atk2 = new Image("attackIchigo/ichigo1attack1.png");
			atk3 = new Image("attackIchigo/ichigo1attack2.png");
			atk4 = new Image("attackIchigo/ichigo1attack3.png");
			atk5 = new Image("attackIchigo/ichigo1attack2.png");
			atk6 = new Image("attackIchigo/ichigo1attack1.png");
			atk7 = new Image("attackIchigo/ichigo1attack.png");
			atk8 = new Image("attackIchigo/ichigo1attack1.png");
			atk9 = new Image("attackIchigo/ichigo1attack2.png");
			atk10 = new Image("attackIchigo/ichigo1attack3.png");
			idle1 = new Image("idleIchigo/ichigo1idle.png");
			idle2 = new Image("idleIchigo/ichigo1idle1.png");
			idle3 = new Image("idleIchigo/ichigo1idle2.png");
			idle4 = new Image("idleIchigo/ichigo1idle3.png");
			idle5 = new Image("idleIchigo/ichigo1idle4.png");
			idle6 = new Image("idleIchigo/ichigo1idle5.png");
			idle7 = new Image("idleIchigo/ichigo1idle4.png");
			idle8 = new Image("idleIchigo/ichigo1idle3.png");
			idle9 = new Image("idleIchigo/ichigo1idle2.png");
			idle10 = new Image("idleIchigo/ichigo1idle1.png");
			run1 = new Image("runIchigo/ichigo1run.png");
			run2 = new Image("runIchigo/ichigo1run1.png");
			run3 = new Image("runIchigo/ichigo1run2.png");
			run4 = new Image("runIchigo/ichigo1run3.png");
			run5 = new Image("runIchigo/ichigo1run4.png");
			run6 = new Image("runIchigo/ichigo1run5.png");
			run7 = new Image("runIchigo/ichigo1run6.png");
			run8 = new Image("runIchigo/ichigo1run7.png");
			run9 = new Image("runIchigo/ichigo1run6.png");
			run10 = new Image("runIchigo/ichigo1run5.png");
			block1 = new Image("blockIchigo/ichigo1block.png");
			block2 = new Image("blockIchigo/ichigo1block1.png");
			block3 = new Image("blockIchigo/ichigo1block.png");
			spcl1 = new Image("spclIchigo/ichigo1spcl.png");
			spcl2 = new Image("spclIchigo/ichigo1spcl1.png");
			spcl3 = new Image("spclIchigo/ichigo1spcl2.png");
			spcl4 = new Image("spclIchigo/ichigo1spcl3.png");
			spcl5 = new Image("spclIchigo/ichigo1spcl2.png");
			spcl6 = new Image("spclIchigo/ichigo1spcl1.png");
			spcl7 = new Image("spclIchigo/ichigo1spcl.png");
			spcl8 = new Image("spclIchigo/ichigo1spcl1.png");
			spcl9 = new Image("spclIchigo/ichigo1spcl2.png");
			spcl10 = new Image("spclIchigo/ichigo1spcl3.png");
			hurt1 = new Image("idleIchigo/ichigo1idle.png");
			hurt2 = new Image("hurtIchigo/ichigo1hurt.png");
			hurt3 = new Image("hurtIchigo/ichigo1hurt.png");
			hurt4 = new Image("hurtIchigo/ichigo1hurt.png");
			hurt5 = new Image("hurtIchigo/ichigo1hurt.png");
			hurt6 = new Image("hurtIchigo/ichigo1hurt.png");
			hurt7 = new Image("hurtIchigo/ichigo1hurt.png");
			hurt8 = new Image("hurtIchigo/ichigo1hurt.png");
			hurt9 = new Image("hurtIchigo/ichigo1hurt.png");
			hurt10 = new Image("idleIchigo/ichigo1idle.png");

		}else{
			name = "left";
			atk1 = new Image("revattackIchigo/ichigo1attack.png");
			atk2 = new Image("revattackIchigo/ichigo1attack1.png");
			atk3 = new Image("revattackIchigo/ichigo1attack2.png");
			atk4 = new Image("revattackIchigo/ichigo1attack3.png");
			atk5 = new Image("revattackIchigo/ichigo1attack2.png");
			atk6 = new Image("revattackIchigo/ichigo1attack1.png");
			atk7 = new Image("revattackIchigo/ichigo1attack.png");
			atk8 = new Image("revattackIchigo/ichigo1attack1.png");
			atk9 = new Image("revattackIchigo/ichigo1attack2.png");
			atk10 = new Image("revattackIchigo/ichigo1attack3.png");
			idle1 = new Image("revidleIchigo/ichigo1idle.png");
			idle2 = new Image("revidleIchigo/ichigo1idle1.png");
			idle3 = new Image("revidleIchigo/ichigo1idle2.png");
			idle4 = new Image("revidleIchigo/ichigo1idle3.png");
			idle5 = new Image("revidleIchigo/ichigo1idle4.png");
			idle6 = new Image("revidleIchigo/ichigo1idle5.png");
			idle7 = new Image("revidleIchigo/ichigo1idle4.png");
			idle8 = new Image("revidleIchigo/ichigo1idle3.png");
			idle9 = new Image("revidleIchigo/ichigo1idle2.png");
			idle10 = new Image("revidleIchigo/ichigo1idle1.png");
			run1 = new Image("revrunIchigo/ichigo1run.png");
			run2 = new Image("revrunIchigo/ichigo1run1.png");
			run3 = new Image("revrunIchigo/ichigo1run2.png");
			run4 = new Image("revrunIchigo/ichigo1run3.png");
			run5 = new Image("revrunIchigo/ichigo1run4.png");
			run6 = new Image("revrunIchigo/ichigo1run5.png");
			run7 = new Image("revrunIchigo/ichigo1run6.png");
			run8 = new Image("revrunIchigo/ichigo1run7.png");
			run9 = new Image("revrunIchigo/ichigo1run6.png");
			run10 = new Image("revrunIchigo/ichigo1run5.png");
			block1 = new Image("revblockIchigo/ichigo1block.png");
			block2 = new Image("revblockIchigo/ichigo1block1.png");
			block3 = new Image("revblockIchigo/ichigo1block.png");
			spcl1 = new Image("revspclIchigo/ichigo1spcl.png");
			spcl2 = new Image("revspclIchigo/ichigo1spcl1.png");
			spcl3 = new Image("revspclIchigo/ichigo1spcl2.png");
			spcl4 = new Image("revspclIchigo/ichigo1spcl3.png");
			spcl5 = new Image("revspclIchigo/ichigo1spcl2.png");
			spcl6 = new Image("revspclIchigo/ichigo1spcl1.png");
			spcl7 = new Image("revspclIchigo/ichigo1spcl.png");
			spcl8 = new Image("revspclIchigo/ichigo1spcl1.png");
			spcl9 = new Image("revspclIchigo/ichigo1spcl2.png");
			spcl10 = new Image("revspclIchigo/ichigo1spcl3.png");
			hurt1 = new Image("revidleIchigo/ichigo1idle.png");
			hurt2 = new Image("revhurtIchigo/ichigo1hurt.png");
			hurt3 = new Image("revhurtIchigo/ichigo1hurt.png");
			hurt4 = new Image("revhurtIchigo/ichigo1hurt.png");
			hurt5 = new Image("revhurtIchigo/ichigo1hurt.png");
			hurt6 = new Image("revhurtIchigo/ichigo1hurt.png");
			hurt7 = new Image("revhurtIchigo/ichigo1hurt.png");
			hurt8 = new Image("revhurtIchigo/ichigo1hurt.png");
			hurt9 = new Image("revhurtIchigo/ichigo1hurt.png");
			hurt10 = new Image("revidleIchigo/ichigo1idle.png");

		}
	}

}
