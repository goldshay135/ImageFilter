package Filters;

public class blue {
    public void procces(Handler hand) {
        for (int i = 0; i < hand.getHeight(); i++) {
            for (int j = 0; j < hand.getWidth(); j++) {
                int pix = hand.getRGB(j, i);

                int a = (pix >> 24) & 0xff;

                if(a == 0) continue;

                int r = (pix >> 16) & 0xff;
                int g = (pix >> 8) & 0xff;
                int b = pix & 0xff;

                b += 30;

                if(b > 255) {
                    b = 255;
                }

                pix = (r << 16) | (g << 8) | (b) | a << 24;

                hand.setRGB(j, i, pix);
            }
        }
    }
}
