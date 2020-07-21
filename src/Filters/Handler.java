package Filters;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Handler {
	
    BufferedImage bi = null;
    File file = null;
    private int width, height;
    
    public boolean loadFile(String filename, String ext) {
        try {
            file = new File(filename + "." + ext);
            bi = ImageIO.read(file);
            
            width = bi.getWidth();
            height = bi.getHeight();
            
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
	
    public boolean writeFile(String filename, String ext) {
        try {
            file = new File(filename + "." +ext);
            ImageIO.write(bi, ext, file);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean setRGB(int x, int y, int pix) {
        try {
            bi.setRGB(x,y,pix);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public int getRGB(int x, int y) {
        try {
            return bi.getRGB(x, y);
        } catch (Exception e) {
            System.out.println(e);
            return 404;
        }
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
