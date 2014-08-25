import java.awt.image.BufferedImage;

/**
 * Created by chase on 8/25/14.
 */
public abstract class TBSTile {

    private int xLocation, yLocation;
    private BufferedImage defaultImage;

    public TBSTile(int x, int y, BufferedImage tileImage){
        xLocation = x;
        yLocation = y;
        defaultImage = tileImage;
    }

    public BufferedImage getImage(){
        return defaultImage;
    }

    public abstract void onSelect();//will have params once those classes are defineds

    public abstract void onDeselect();

    

}
