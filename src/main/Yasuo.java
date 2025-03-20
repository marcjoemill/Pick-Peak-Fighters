package main;

import javafx.scene.image.Image;

public class Yasuo extends GameCharacter{

	public Yasuo(double x, double y, String filename, Image image, int count, String name) {
		super(x,y, filename, image, count, name);
		this.flip();

	}

	protected void flip(){
		if(name == "left"){
			name = "right";
			atk1 = new Image("attackYasuo/yasuo1attack.png");
			atk2 = new Image("attackYasuo/yasuo1attack1.png");
			atk3 = new Image("attackYasuo/yasuo1attack2.png");
			atk4 = new Image("attackYasuo/yasuo1attack3.png");
			atk5 = new Image("attackYasuo/yasuo1attack4.png");
			atk6 = new Image("attackYasuo/yasuo1attack5.png");
			atk7 = new Image("attackYasuo/yasuo1attack4.png");
			atk8 = new Image("attackYasuo/yasuo1attack3.png");
			atk9 = new Image("attackYasuo/yasuo1attack2.png");
			atk10 = new Image("attackYasuo/yasuo1attack1.png");
			idle1 = new Image("idleYasuo/yasuo1idle.png");
			idle2 = new Image("idleYasuo/yasuo1idle1.png");
			idle3 = new Image("idleYasuo/yasuo1idle2.png");
			idle4 = new Image("idleYasuo/yasuo1idle3.png");
			idle5 = new Image("idleYasuo/yasuo1idle4.png");
			idle6 = new Image("idleYasuo/yasuo1idle5.png");
			idle7 = new Image("idleYasuo/yasuo1idle4.png");
			idle8 = new Image("idleYasuo/yasuo1idle3.png");
			idle9 = new Image("idleYasuo/yasuo1idle2.png");
			idle10 = new Image("idleYasuo/yasuo1idle1.png");
			run1 = new Image("runYasuo/yasuo1run.png");
			run2 = new Image("runYasuo/yasuo1run1.png");
			run3 = new Image("runYasuo/yasuo1run2.png");
			run4 = new Image("runYasuo/yasuo1run3.png");
			run5 = new Image("runYasuo/yasuo1run4.png");
			run6 = new Image("runYasuo/yasuo1run5.png");
			run7 = new Image("runYasuo/yasuo1run6.png");
			run8 = new Image("runYasuo/yasuo1run7.png");
			run9 = new Image("runYasuo/yasuo1run6.png");
			run10 = new Image("runYasuo/yasuo1run5.png");
			block1 = new Image("blockYasuo/yasuo1block.png");
			block2 = new Image("blockYasuo/yasuo1block1.png");
			block3 = new Image("blockYasuo/yasuo1block.png");
			spcl1 = new Image("spclYasuo/yasuo1spcl.png");
			spcl2 = new Image("spclYasuo/yasuo1spcl1.png");
			spcl3 = new Image("spclYasuo/yasuo1spcl2.png");
			spcl4 = new Image("spclYasuo/yasuo1spcl3.png");
			spcl5 = new Image("spclYasuo/yasuo1spcl4.png");
			spcl6 = new Image("spclYasuo/yasuo1spcl5.png");
			spcl7 = new Image("spclYasuo/yasuo1spcl4.png");
			spcl8 = new Image("spclYasuo/yasuo1spcl3.png");
			spcl9 = new Image("spclYasuo/yasuo1spcl2.png");
			spcl10 = new Image("spclYasuo/yasuo1spcl1.png");
			hurt1 = new Image("hurtYasuo/yasuo1hurt.png");
			hurt2 = new Image("hurtYasuo/yasuo1hurt.png");
			hurt3 = new Image("hurtYasuo/yasuo1hurt.png");
			hurt4 = new Image("hurtYasuo/yasuo1hurt.png");
			hurt5 = new Image("hurtYasuo/yasuo1hurt1.png");
			hurt6 = new Image("hurtYasuo/yasuo1hurt1.png");
			hurt7 = new Image("hurtYasuo/yasuo1hurt1.png");
			hurt8 = new Image("hurtYasuo/yasuo1hurt.png");
			hurt9 = new Image("hurtYasuo/yasuo1hurt.png");
			hurt10 = new Image("hurtYasuo/yasuo1hurt.png");
		}else{
			name = "left";
			atk1 = new Image("revattackYasuo/yasuo1attack.png");
			atk2 = new Image("revattackYasuo/yasuo1attack1.png");
			atk3 = new Image("revattackYasuo/yasuo1attack2.png");
			atk4 = new Image("revattackYasuo/yasuo1attack3.png");
			atk5 = new Image("revattackYasuo/yasuo1attack4.png");
			atk6 = new Image("revattackYasuo/yasuo1attack5.png");
			atk7 = new Image("revattackYasuo/yasuo1attack4.png");
			atk8 = new Image("revattackYasuo/yasuo1attack3.png");
			atk9 = new Image("revattackYasuo/yasuo1attack2.png");
			atk10 = new Image("revattackYasuo/yasuo1attack1.png");
			idle1 = new Image("revidleYasuo/yasuo1idle.png");
			idle2 = new Image("revidleYasuo/yasuo1idle1.png");
			idle3 = new Image("revidleYasuo/yasuo1idle2.png");
			idle4 = new Image("revidleYasuo/yasuo1idle3.png");
			idle5 = new Image("revidleYasuo/yasuo1idle4.png");
			idle6 = new Image("revidleYasuo/yasuo1idle5.png");
			idle7 = new Image("revidleYasuo/yasuo1idle4.png");
			idle8 = new Image("revidleYasuo/yasuo1idle3.png");
			idle9 = new Image("revidleYasuo/yasuo1idle2.png");
			idle10 = new Image("revidleYasuo/yasuo1idle1.png");
			run1 = new Image("revrunYasuo/yasuo1run.png");
			run2 = new Image("revrunYasuo/yasuo1run1.png");
			run3 = new Image("revrunYasuo/yasuo1run2.png");
			run4 = new Image("revrunYasuo/yasuo1run3.png");
			run5 = new Image("revrunYasuo/yasuo1run4.png");
			run6 = new Image("revrunYasuo/yasuo1run5.png");
			run7 = new Image("revrunYasuo/yasuo1run6.png");
			run8 = new Image("revrunYasuo/yasuo1run7.png");
			run9 = new Image("revrunYasuo/yasuo1run6.png");
			run10 = new Image("revrunYasuo/yasuo1run5.png");
			block1 = new Image("revblockYasuo/yasuo1block.png");
			block2 = new Image("revblockYasuo/yasuo1block1.png");
			block3 = new Image("revblockYasuo/yasuo1block.png");
			spcl1 = new Image("revspclYasuo/yasuo1spcl.png");
			spcl2 = new Image("revspclYasuo/yasuo1spcl1.png");
			spcl3 = new Image("revspclYasuo/yasuo1spcl2.png");
			spcl4 = new Image("revspclYasuo/yasuo1spcl3.png");
			spcl5 = new Image("revspclYasuo/yasuo1spcl4.png");
			spcl6 = new Image("revspclYasuo/yasuo1spcl5.png");
			spcl7 = new Image("revspclYasuo/yasuo1spcl4.png");
			spcl8 = new Image("revspclYasuo/yasuo1spcl3.png");
			spcl9 = new Image("revspclYasuo/yasuo1spcl2.png");
			spcl10 = new Image("revspclYasuo/yasuo1spcl1.png");
//			hurt1 = new Image("revhurtYasuo/yasuo1hurt.png"); // Di pa nakukunan
//			hurt2 = new Image("revhurtYasuo/yasuo1hurt1.png");
//			hurt3 = new Image("revhurtYasuo/yasuo1hurt.png");
//			hurt4 = new Image("revhurtYasuo/yasuo1hurt1.png");
//			hurt5 = new Image("revhurtYasuo/yasuo1hurt.png");
//			hurt6 = new Image("revhurtYasuo/yasuo1hurt1.png");
//			hurt7 = new Image("revhurtYasuo/yasuo1hurt.png");
//			hurt8 = new Image("revhurtYasuo/yasuo1hurt1.png");
//			hurt9 = new Image("revhurtYasuo/yasuo1hurt.png");
//			hurt10 = new Image("revhurtYasuo/yasuo1hurt1.png");
			hurt1 = new Image("revhurtYasuo/yasuo1hurt.png");
			hurt2 = new Image("revhurtYasuo/yasuo1hurt.png");
			hurt3 = new Image("revhurtYasuo/yasuo1hurt.png");
			hurt4 = new Image("revhurtYasuo/yasuo1hurt.png");
			hurt5 = new Image("revhurtYasuo/yasuo1hurt1.png");
			hurt6 = new Image("revhurtYasuo/yasuo1hurt1.png");
			hurt7 = new Image("revhurtYasuo/yasuo1hurt1.png");
			hurt8 = new Image("revhurtYasuo/yasuo1hurt.png");
			hurt9 = new Image("revhurtYasuo/yasuo1hurt.png");
			hurt10 = new Image("revhurtYasuo/yasuo1hurt.png");



		}
	}

}
