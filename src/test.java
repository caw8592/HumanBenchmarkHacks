import java.awt.*;

import javax.swing.JFrame;

public class test {
    public static void main(String[] args) throws Exception {
        while (true) {
            Robot r = new Robot();
            int x = (int)MouseInfo.getPointerInfo().getLocation().getX();
            int y = (int)MouseInfo.getPointerInfo().getLocation().getY();
            System.out.println(r.getPixelColor(x, y).getRGB());
        }
    }
}
