
import java.util.*;

/**
 * 
 */
public class Square extends Shape
{
    double _x1, _y1, _x2, _y2;
    Square(Drawing dp, double x1, double y1, double x2, double y2)
    {
        super(dp);
        _x1 = x1;
        _y1 = y1;
        _x2 = x2;
        _y2 = y2;
        
    }
    
    public void draw()
    {
        System.out.println("\n I am a Square \n");
        drawing.drawLine(_x1, _y1, _x2, _y1);
        drawing.drawLine(_x2, _y1, _x2, _y2);
        drawing.drawLine(_x2, _y2, _x1, _y2);
        drawing.drawLine(_x1, _y2, _x1, _y1);
    }
}
