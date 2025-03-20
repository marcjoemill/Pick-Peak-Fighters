package main;

import javafx.scene.image.Image;

public class Zoro extends GameCharacter{

	public Zoro(double x, double y, String filename, Image image, int count, String name) {
		super(x,y, filename, image, count, name);
		this.flip();
	}

	protected void flip(){
		if(name == "left"){
			name = "right";
			atk1 = new Image("attackZoro/zoro1attack.png");
			atk2 = new Image("attackZoro/zoro1attack1.png");
			atk3 = new Image("attackZoro/zoro1attack2.png");
			atk4 = new Image("attackZoro/zoro1attack3.png");
			atk5 = new Image("attackZoro/zoro1attack2.png");
			atk6 = new Image("attackZoro/zoro1attack1.png");
			atk7 = new Image("attackZoro/zoro1attack.png");
			atk8 = new Image("attackZoro/zoro1attack1.png");
			atk9 = new Image("attackZoro/zoro1attack2.png");
			atk10 = new Image("attackZoro/zoro1attack3.png");
			idle1 = new Image("idleZoro/zoro1idle.png");
			idle2 = new Image("idleZoro/zoro1idle1.png");
			idle3 = new Image("idleZoro/zoro1idle2.png");
			idle4 = new Image("idleZoro/zoro1idle3.png");
			idle5 = new Image("idleZoro/zoro1idle4.png");
			idle6 = new Image("idleZoro/zoro1idle5.png");
			idle7 = new Image("idleZoro/zoro1idle4.png");
			idle8 = new Image("idleZoro/zoro1idle3.png");
			idle9 = new Image("idleZoro/zoro1idle2.png");
			idle10 = new Image("idleZoro/zoro1idle1.png");
			run1 = new Image("runZoro/zoro1run.png");
			run2 = new Image("runZoro/zoro1run1.png");
			run3 = new Image("runZoro/zoro1run2.png");
			run4 = new Image("runZoro/zoro1run3.png");
			run5 = new Image("runZoro/zoro1run4.png");
			run6 = new Image("runZoro/zoro1run5.png");
			run7 = new Image("runZoro/zoro1run6.png");
			run8 = new Image("runZoro/zoro1run7.png");
			run9 = new Image("runZoro/zoro1run6.png");
			run10 = new Image("runZoro/zoro1run5.png");
			block1 = new Image("blockZoro/zoro1block.png");
			block2 = new Image("blockZoro/zoro1block1.png");
			block3 = new Image("blockZoro/zoro1block.png");
			spcl1 = new Image("spclZoro/zoro1spcl.png");
			spcl2 = new Image("spclZoro/zoro1spcl1.png");
			spcl3 = new Image("spclZoro/zoro1spcl2.png");
			spcl4 = new Image("spclZoro/zoro1spcl3.png");
			spcl5 = new Image("spclZoro/zoro1spcl4.png");
			spcl6 = new Image("spclZoro/zoro1spcl3.png");
			spcl7 = new Image("spclZoro/zoro1spcl2.png");
			spcl8 = new Image("spclZoro/zoro1spcl1.png");
			spcl9 = new Image("spclZoro/zoro1spcl.png");
			spcl10 = new Image("spclZoro/zoro1spcl1.png");

			hurt1 = new Image("hurtZoro/zoro1hurt.png");
			hurt2 = new Image("hurtZoro/zoro1hurt.png");
			hurt3 = new Image("hurtZoro/zoro1hurt1.png");
			hurt4 = new Image("hurtZoro/zoro1hurt1.png");
			hurt5 = new Image("hurtZoro/zoro1hurt.png");
			hurt6 = new Image("hurtZoro/zoro1hurt.png");
			hurt7 = new Image("hurtZoro/zoro1hurt1.png");
			hurt8 = new Image("hurtZoro/zoro1hurt1.png");
			hurt9 = new Image("hurtZoro/zoro1hurt.png");
			hurt10 = new Image("hurtZoro/zoro1hurt.png");

		}else{
			name = "left";
			atk1 = new Image("revattackZoro/zoro1attack.png");
			atk2 = new Image("revattackZoro/zoro1attack1.png");
			atk3 = new Image("revattackZoro/zoro1attack2.png");
			atk4 = new Image("revattackZoro/zoro1attack3.png");
			atk5 = new Image("revattackZoro/zoro1attack2.png");
			atk6 = new Image("revattackZoro/zoro1attack1.png");
			atk7 = new Image("revattackZoro/zoro1attack.png");
			atk8 = new Image("revattackZoro/zoro1attack1.png");
			atk9 = new Image("revattackZoro/zoro1attack2.png");
			atk10 = new Image("revattackZoro/zoro1attack3.png");
			idle1 = new Image("revidleZoro/zoro1idle.png");
			idle2 = new Image("revidleZoro/zoro1idle1.png");
			idle3 = new Image("revidleZoro/zoro1idle2.png");
			idle4 = new Image("revidleZoro/zoro1idle3.png");
			idle5 = new Image("revidleZoro/zoro1idle4.png");
			idle6 = new Image("revidleZoro/zoro1idle5.png");
			idle7 = new Image("revidleZoro/zoro1idle4.png");
			idle8 = new Image("revidleZoro/zoro1idle3.png");
			idle9 = new Image("revidleZoro/zoro1idle2.png");
			idle10 = new Image("revidleZoro/zoro1idle1.png");
			run1 = new Image("revrunZoro/zoro1run.png");
			run2 = new Image("revrunZoro/zoro1run1.png");
			run3 = new Image("revrunZoro/zoro1run2.png");
			run4 = new Image("revrunZoro/zoro1run3.png");
			run5 = new Image("revrunZoro/zoro1run4.png");
			run6 = new Image("revrunZoro/zoro1run5.png");
			run7 = new Image("revrunZoro/zoro1run6.png");
			run8 = new Image("revrunZoro/zoro1run7.png");
			run9 = new Image("revrunZoro/zoro1run6.png");
			run10 = new Image("revrunZoro/zoro1run5.png");
			block1 = new Image("revblockZoro/zoro1block.png");
			block2 = new Image("revblockZoro/zoro1block1.png");
			block3 = new Image("revblockZoro/zoro1block.png");
//			spcl1 = new Image("revspclZoro/zoro1spcl.png");
//			spcl2 = new Image("revspclZoro/zoro1spcl1.png");
//			spcl3 = new Image("revspclZoro/zoro1spcl2.png");
//			spcl4 = new Image("revspclZoro/zoro1spcl3.png");
//			spcl5 = new Image("revspclZoro/zoro1spcl4.png");
//			spcl6 = new Image("revspclZoro/zoro1spcl3.png");
//			spcl7 = new Image("revspclZoro/zoro1spcl2.png");
//			spcl8 = new Image("revspclZoro/zoro1spcl1.png");
//			spcl9 = new Image("revspclZoro/zoro1spcl.png");
//			spcl10 = new Image("revspclZoro/zoro1spcl1.png");
			spcl1 = new Image("revspclZoro/zoro1spcl.png");
			spcl2 = new Image("revspclZoro/zoro1spcl.png");
			spcl3 = new Image("revspclZoro/zoro1spcl1.png");
			spcl4 = new Image("revspclZoro/zoro1spcl1.png");
			spcl5 = new Image("revspclZoro/zoro1spcl2.png");
			spcl6 = new Image("revspclZoro/zoro1spcl3.png");
			spcl7 = new Image("revspclZoro/zoro1spcl4.png");
			spcl8 = new Image("revspclZoro/zoro1spcl4.png");
			spcl9 = new Image("revspclZoro/zoro1spcl2.png");
			spcl10 = new Image("revspclZoro/zoro1spcl1.png");

			hurt1 = new Image("revhurtZoro/zoro1hurt.png");
			hurt2 = new Image("revhurtZoro/zoro1hurt.png");
			hurt3 = new Image("revhurtZoro/zoro1hurt1.png");
			hurt4 = new Image("revhurtZoro/zoro1hurt1.png");
			hurt5 = new Image("revhurtZoro/zoro1hurt.png");
			hurt6 = new Image("revhurtZoro/zoro1hurt.png");
			hurt7 = new Image("revhurtZoro/zoro1hurt1.png");
			hurt8 = new Image("revhurtZoro/zoro1hurt1.png");
			hurt9 = new Image("revhurtZoro/zoro1hurt.png");
			hurt10 = new Image("revhurtZoro/zoro1hurt.png");

		}
	}

}
