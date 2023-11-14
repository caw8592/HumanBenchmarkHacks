import java.awt.*;
import java.awt.event.InputEvent;

public class ReactionTime {
    public static void main(String[] args) throws Exception{
        while (true) {
            Robot r = new Robot();
            int x = (int)MouseInfo.getPointerInfo().getLocation().getX();
            int y = (int)MouseInfo.getPointerInfo().getLocation().getY();
            
            if(r.getPixelColor(x, y).getRGB() == -11805846) {
                r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
        }
    }
}
