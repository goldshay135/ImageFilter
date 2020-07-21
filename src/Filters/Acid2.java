package Filters;

public class Acid2 {
    public void procces(Handler hand) {
        for (int i = 0; i < hand.getHeight(); i++) {
            for (int j = 0; j < hand.getWidth(); j++) {
                int pix = hand.getRGB(j,i);

                int a = (pix >> 24) & 0xff;
                
                if(a == 0) continue;
                
                int r = (pix >> 16) & 0xff;
                int g = (pix >> 8) & 0xff;
                int b = pix & 0xff;

                int avg = (r + g + b) / 30;

                pix = (r << 24) | (g << 16) | (b << 8) | avg;
                System.out.println(pix);
                hand.setRGB(j, i, pix);
            }
        }
    }

}
