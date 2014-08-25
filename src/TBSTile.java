import java.awt.image.BufferedImage;

/**
 * Created by chase on 8/25/14.
 */
public class TBSTile {

    private int xLocation, yLocation;
    private BufferedImage defaultImage;

    public TBSTile(int x, int y){
        xLocation = x;
        yLocation = y;
    }

    public BufferedImage getImage(){
        return defaultImage;
    }



}
