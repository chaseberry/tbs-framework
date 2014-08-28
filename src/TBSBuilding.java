import java.awt.image.BufferedImage;

/**
 * Created by Chase on 8/27/2014.
 */
public abstract class TBSBuilding {

    private TBSPlayer owner;
    private BufferedImage defaultImage;

    private int xLocation;
    private int yLocation;

    public static TBSBuilding create(){
        return null;
    }

    public abstract void onSelect(TBSPlayer selector);

}
