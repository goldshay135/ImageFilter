package ImageFilter;

import Filters.*;

public class Exemain {

    public static void main(String[] args) {
    	Handler hand = new Handler();
    	Acid1 acid1 = new Acid1();
    	Acid2 acid2 = new Acid2();
    	BlackAndWhite blackandwhite = new BlackAndWhite();
        blue blue = new blue();
        
        hand.loadFile("Flowers", "jpg");
        acid2.procces(hand);
        hand.writeFile("FlowersAcid2", "png");
    }
    
}
