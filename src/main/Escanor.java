package main;

import javafx.scene.image.Image;

public class Escanor extends GameCharacter{

	public Escanor(double x, double y, String filename, Image image, int count, String name) {
		super(x,y, filename, image, count, name);
		this.flip();
	}

	protected void flip(){
		if(name == "left"){
			name = "right";
			atk1 = new Image("attackEscanor/escanor1attack.png");
			atk2 = new Image("attackEscanor/escanor1attack1.png");
			atk3 = new Image("attackEscanor/escanor1attack2.png");
			atk4 = new Image("attackEscanor/escanor1attack3.png");
			atk5 = new Image("attackEscanor/escanor1attack4.png");
			atk6 = new Image("attackEscanor/escanor1attack5.png");
			atk7 = new Image("attackEscanor/escanor1attack6.png");
			atk8 = new Image("attackEscanor/escanor1attack7.png");
			atk9 = new Image("attackEscanor/escanor1attack1.png");
			atk10 = new Image("attackEscanor/escanor1attack.png");
			idle1 = new Image("idleEscanor/escanor1idle.png");
			idle2 = new Image("idleEscanor/escanor1idle1.png");
			idle3 = new Image("idleEscanor/escanor1idle2.png");
			idle4 = new Image("idleEscanor/escanor1idle3.png");
			idle5 = new Image("idleEscanor/escanor1idle5.png");
			idle6 = new Image("idleEscanor/escanor1idle4.png");
			idle7 = new Image("idleEscanor/escanor1idle6.png");
			idle8 = new Image("idleEscanor/escanor1idle.png");
			idle9 = new Image("idleEscanor/escanor1idle2.png");
			idle10 = new Image("idleEscanor/escanor1idle1.png");
			run1 = new Image("runEscanor/escanor1run.png");
			run2 = new Image("runEscanor/escanor1run1.png");
			run3 = new Image("runEscanor/escanor1run2.png");
			run4 = new Image("runEscanor/escanor1run3.png");
			run5 = new Image("runEscanor/escanor1run4.png");
			run6 = new Image("runEscanor/escanor1run5.png");
			run7 = new Image("runEscanor/escanor1run6.png");
			run8 = new Image("runEscanor/escanor1run7.png");
			run9 = new Image("runEscanor/escanor1run1.png");
			run10 = new Image("runEscanor/escanor1run2.png");
			block1 = new Image("blockEscanor/escanor1block.png");
			block2 = new Image("blockEscanor/escanor1block1.png");
			block3 = new Image("blockEscanor/escanor1block2.png");
			spcl1 = new Image("spclEscanor/escanor1spcl.png");
			spcl2 = new Image("spclEscanor/escanor1spcl1.png");
			spcl3 = new Image("spclEscanor/escanor1spcl2.png");
			spcl4 = new Image("spclEscanor/escanor1spcl3.png");
			spcl5 = new Image("spclEscanor/escanor1spcl4.png");
			spcl6 = new Image("spclEscanor/escanor1spcl5.png");
			spcl7 = new Image("spclEscanor/escanor1spcl6.png");
			spcl8 = new Image("spclEscanor/escanor1spcl7.png");
			spcl9 = new Image("spclEscanor/escanor1spcl6.png");
			spcl10 = new Image("spclEscanor/escanor1spcl7.png");
			hurt1 = new Image("hurtEscanor/escanor1hurt.png"); // Di pa nakukunan
			hurt2 = new Image("hurtEscanor/escanor1hurt1.png");
			hurt3 = new Image("hurtEscanor/escanor1hurt2.png");
			hurt4 = new Image("hurtEscanor/escanor1hurt3.png");
			hurt5 = new Image("hurtEscanor/escanor1hurt.png");
			hurt6 = new Image("hurtEscanor/escanor1hurt1.png");
			hurt7 = new Image("hurtEscanor/escanor1hurt2.png");
			hurt8 = new Image("hurtEscanor/escanor1hurt.png");
			hurt9 = new Image("hurtEscanor/escanor1hurt.png");
			hurt10 = new Image("hurtEscanor/escanor1hurt.png");
		}else{
			name = "left";
			atk1 = new Image("revattackEscanor/escanor1attack.png");
			atk2 = new Image("revattackEscanor/escanor1attack1.png");
			atk3 = new Image("revattackEscanor/escanor1attack2.png");
			atk4 = new Image("revattackEscanor/escanor1attack3.png");
			atk5 = new Image("revattackEscanor/escanor1attack4.png");
			atk6 = new Image("revattackEscanor/escanor1attack5.png");
			atk7 = new Image("revattackEscanor/escanor1attack6.png");
			atk8 = new Image("revattackEscanor/escanor1attack7.png");
			atk9 = new Image("revattackEscanor/escanor1attack1.png");
			atk10 = new Image("revattackEscanor/escanor1attack.png");
			idle1 = new Image("revidleEscanor/escanor1idle.png");
			idle2 = new Image("revidleEscanor/escanor1idle1.png");
			idle3 = new Image("revidleEscanor/escanor1idle2.png");
			idle4 = new Image("revidleEscanor/escanor1idle3.png");
			idle5 = new Image("revidleEscanor/escanor1idle5.png");
			idle6 = new Image("revidleEscanor/escanor1idle4.png");
			idle7 = new Image("revidleEscanor/escanor1idle6.png");
			idle8 = new Image("revidleEscanor/escanor1idle.png");
			idle9 = new Image("revidleEscanor/escanor1idle2.png");
			idle10 = new Image("revidleEscanor/escanor1idle1.png");
			run1 = new Image("revrunEscanor/escanor1run.png");
			run2 = new Image("revrunEscanor/escanor1run1.png");
			run3 = new Image("revrunEscanor/escanor1run2.png");
			run4 = new Image("revrunEscanor/escanor1run3.png");
			run5 = new Image("revrunEscanor/escanor1run4.png");
			run6 = new Image("revrunEscanor/escanor1run5.png");
			run7 = new Image("revrunEscanor/escanor1run6.png");
			run8 = new Image("revrunEscanor/escanor1run7.png");
			run9 = new Image("revrunEscanor/escanor1run1.png");
			run10 = new Image("revrunEscanor/escanor1run2.png");
			block1 = new Image("revblockEscanor/escanor1block.png");
			block2 = new Image("revblockEscanor/escanor1block1.png");
			block3 = new Image("revblockEscanor/escanor1block2.png");
			spcl1 = new Image("revspclEscanor/escanor1spcl.png");
			spcl2 = new Image("revspclEscanor/escanor1spcl1.png");
			spcl3 = new Image("revspclEscanor/escanor1spcl2.png");
			spcl4 = new Image("revspclEscanor/escanor1spcl3.png");
			spcl5 = new Image("revspclEscanor/escanor1spcl4.png");
			spcl6 = new Image("revspclEscanor/escanor1spcl5.png");
			spcl7 = new Image("revspclEscanor/escanor1spcl6.png");
			spcl8 = new Image("revspclEscanor/escanor1spcl7.png");
			spcl9 = new Image("revspclEscanor/escanor1spcl6.png");
			spcl10 = new Image("revspclEscanor/escanor1spcl7.png");
			hurt1 = new Image("revhurtEscanor/escanor1hurt.png"); // Di pa nakukunan
			hurt2 = new Image("revhurtEscanor/escanor1hurt1.png");
			hurt3 = new Image("revhurtEscanor/escanor1hurt2.png");
			hurt4 = new Image("revhurtEscanor/escanor1hurt3.png");
			hurt5 = new Image("revhurtEscanor/escanor1hurt.png");
			hurt6 = new Image("revhurtEscanor/escanor1hurt1.png");
			hurt7 = new Image("revhurtEscanor/escanor1hurt2.png");
			hurt8 = new Image("revhurtEscanor/escanor1hurt.png");
			hurt9 = new Image("revhurtEscanor/escanor1hurt.png");
			hurt10 = new Image("revhurtEscanor/escanor1hurt.png");


		}
	}

}
