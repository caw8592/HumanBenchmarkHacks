import java.awt.*;
import java.awt.event.InputEvent;

public class Aim {

    public static void main(String[] args) throws Exception {
        Robot r = new Robot();

        int contFound = 0;

        for(int i = 0; i<20; i++) {
            for(int x = 510; x < 1400; x += 100) {
                for(int y = 60; y < 588; y += 50) {
                    r.mouseMove(x, y);
                    if(r.getPixelColor(x, y).getRGB() != -13924399) {
                        System.out.println("FOUND!");
                        //r.mouseMove(x, y);
                        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        contFound++;
                        if (contFound >= 10)
                            break;
                        
                    } else {
                        contFound = 0;
                    }
                }
                if (contFound >= 10)
                    break;
            }
            if (contFound >= 10)
                break;
        }
        
    }
}
