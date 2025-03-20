package main;

import javafx.scene.image.Image;

public class Lili extends GameCharacter{

	public Lili(double x, double y, String filename, Image image, int count, String name) {
		super(x,y, filename, image, count, name);
		this.flip();
	}

	protected void flip(){
		if(name == "left"){
			name = "right";
			atk1 = new Image("attackLili/lili1attack.png");
			atk2 = new Image("attackLili/lili1attack1.png");
			atk3 = new Image("attackLili/lili1attack2.png");
			atk4 = new Image("attackLili/lili1attack3.png");
			atk5 = new Image("attackLili/lili1attack4.png");
			atk6 = new Image("attackLili/lili1attack5.png");
			atk7 = new Image("attackLili/lili1attack4.png");
			atk8 = new Image("attackLili/lili1attack3.png");
			atk9 = new Image("attackLili/lili1attack2.png");
			atk10 = new Image("attackLili/lili1attack1.png");
			idle1 = new Image("idleLili/lili1idle.png");
			idle2 = new Image("idleLili/lili1idle1.png");
			idle3 = new Image("idleLili/lili1idle2.png");
			idle4 = new Image("idleLili/lili1idle3.png");
			idle5 = new Image("idleLili/lili1idle4.png");
			idle6 = new Image("idleLili/lili1idle3.png");
			idle7 = new Image("idleLili/lili1idle2.png");
			idle8 = new Image("idleLili/lili1idle1.png");
			idle9 = new Image("idleLili/lili1idle2.png");
			idle10 = new Image("idleLili/lili1idle.png");
			run1 = new Image("runLili/lili1run.png");
			run2 = new Image("runLili/lili1run1.png");
			run3 = new Image("runLili/lili1run2.png");
			run4 = new Image("runLili/lili1run3.png");
			run5 = new Image("runLili/lili1run4.png");
			run6 = new Image("runLili/lili1run5.png");
			run7 = new Image("runLili/lili1run4.png");
			run8 = new Image("runLili/lili1run3.png");
			run9 = new Image("runLili/lili1run2.png");
			run10 = new Image("runLili/lili1run.png");
			block1 = new Image("blockLili/Lili1block.png");
			block2 = new Image("blockLili/Lili1block1.png");
			block3 = new Image("blockLili/Lili1block.png");
			spcl1 = new Image("spclLili/lili1spcl.png");
			spcl2 = new Image("spclLili/lili1spcl1.png");
			spcl3 = new Image("spclLili/lili1spcl2.png");
			spcl4 = new Image("spclLili/lili1spcl3.png");
			spcl5 = new Image("spclLili/lili1spcl4.png");
			spcl6 = new Image("spclLili/lili1spcl5.png");
			spcl7 = new Image("spclLili/lili1spcl4.png");
			spcl8 = new Image("spclLili/lili1spcl3.png");
			spcl9 = new Image("spclLili/lili1spcl2.png");
			spcl10 = new Image("spclLili/lili1spcl1.png");
			hurt1 = new Image("hurtLili/lili1hurt1.png");
			hurt2 = new Image("hurtLili/lili1hurt2.png");
			hurt3 = new Image("hurtLili/lili1hurt2.png");
			hurt4 = new Image("hurtLili/lili1hurt3.png");
			hurt5 = new Image("hurtLili/lili1hurt3.png");
			hurt6 = new Image("hurtLili/lili1hurt4.png");
			hurt7 = new Image("hurtLili/lili1hurt4.png");
			hurt8 = new Image("hurtLili/lili1hurt5.png");
			hurt9 = new Image("hurtLili/lili1hurt3.png");
			hurt10 = new Image("hurtLili/lili1hurt2.png");
		}else{
			name = "left";
			atk1 = new Image("revattackLili/lili1attack.png");
			atk2 = new Image("revattackLili/lili1attack1.png");
			atk3 = new Image("revattackLili/lili1attack2.png");
			atk4 = new Image("revattackLili/lili1attack3.png");
			atk5 = new Image("revattackLili/lili1attack4.png");
			atk6 = new Image("revattackLili/lili1attack5.png");
			atk7 = new Image("revattackLili/lili1attack4.png");
			atk8 = new Image("revattackLili/lili1attack3.png");
			atk9 = new Image("revattackLili/lili1attack2.png");
			atk10 = new Image("revattackLili/lili1attack1.png");
			idle1 = new Image("revidleLili/lili1idle.png");
			idle2 = new Image("revidleLili/lili1idle1.png");
			idle3 = new Image("revidleLili/lili1idle2.png");
			idle4 = new Image("revidleLili/lili1idle3.png");
			idle5 = new Image("revidleLili/lili1idle4.png");
			idle6 = new Image("revidleLili/lili1idle3.png");
			idle7 = new Image("revidleLili/lili1idle2.png");
			idle8 = new Image("revidleLili/lili1idle1.png");
			idle9 = new Image("revidleLili/lili1idle2.png");
			idle10 = new Image("revidleLili/lili1idle.png");
			run1 = new Image("revrunLili/lili1run.png");
			run2 = new Image("revrunLili/lili1run1.png");
			run3 = new Image("revrunLili/lili1run2.png");
			run4 = new Image("revrunLili/lili1run3.png");
			run5 = new Image("revrunLili/lili1run4.png");
			run6 = new Image("revrunLili/lili1run5.png");
			run7 = new Image("revrunLili/lili1run4.png");
			run8 = new Image("revrunLili/lili1run3.png");
			run9 = new Image("revrunLili/lili1run2.png");
			run10 = new Image("revrunLili/lili1run.png");
			block1 = new Image("revblockLili/Lili1block.png");
			block2 = new Image("revblockLili/Lili1block1.png");
			block3 = new Image("revblockLili/Lili1block.png");
			spcl1 = new Image("revspclLili/lili1spcl.png");
			spcl2 = new Image("revspclLili/lili1spcl1.png");
			spcl3 = new Image("revspclLili/lili1spcl2.png");
			spcl4 = new Image("revspclLili/lili1spcl3.png");
			spcl5 = new Image("revspclLili/lili1spcl4.png");
			spcl6 = new Image("revspclLili/lili1spcl5.png");
			spcl7 = new Image("revspclLili/lili1spcl4.png");
			spcl8 = new Image("revspclLili/lili1spcl3.png");
			spcl9 = new Image("revspclLili/lili1spcl2.png");
			spcl10 = new Image("revspclLili/lili1spcl1.png");
//			hurt1 = new Image("revhurtLili/lili1hurt.png");
//			hurt2 = new Image("revhurtLili/lili1hurt1.png");
//			hurt3 = new Image("revhurtLili/lili1hurt2.png");
//			hurt4 = new Image("revhurtLili/lili1hurt3.png");
//			hurt5 = new Image("revhurtLili/lili1hurt4.png");
//			hurt6 = new Image("revhurtLili/lili1hurt5.png");
//			hurt7 = new Image("revhurtLili/lili1hurt5.png");
//			hurt8 = new Image("revhurtLili/lili1hurt6.png");
//			hurt9 = new Image("revhurtLili/lili1hurt7.png");
//			hurt10 = new Image("revhurtLili/lili1hurt7.png");
			hurt1 = new Image("revhurtLili/lili1hurt1.png");
			hurt2 = new Image("revhurtLili/lili1hurt2.png");
			hurt3 = new Image("revhurtLili/lili1hurt2.png");
			hurt4 = new Image("revhurtLili/lili1hurt3.png");
			hurt5 = new Image("revhurtLili/lili1hurt3.png");
			hurt6 = new Image("revhurtLili/lili1hurt4.png");
			hurt7 = new Image("revhurtLili/lili1hurt4.png");
			hurt8 = new Image("revhurtLili/lili1hurt5.png");
			hurt9 = new Image("revhurtLili/lili1hurt3.png");
			hurt10 = new Image("revhurtLili/lili1hurt2.png");

		}
	}

}
