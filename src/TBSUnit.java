import java.awt.image.BufferedImage;

/**
 * Created by chase on 8/25/14.
 */
public abstract class TBSUnit {


    private BufferedImage defaultImage;
    private TBSPlayer owner;

    private int xLocation;
    private int yLocation;

    private int unitHealth;
    private int maxMoveCount;

    public static TBSUnit create(){

        return null;
    }

    public BufferedImage getImage(){
        return defaultImage;
    }

    public abstract void onSelect(TBSPlayer selector);

    public boolean move(int nexX, int newY){
        //todo implement this
         return false;
    }

    public void onDeselect(TBSPlayer selector){}

    public void onTurnStart(TBSPlayer player){}

    public int getUnitHealth() {
        return unitHealth;
    }

    public void setUnitHealth(int unitHealth) {
        this.unitHealth = unitHealth;
    }

    public int getMaxMoveCount() {
        return maxMoveCount;
    }

    public void setMaxMoveCount(int maxMoveCount) {
        this.maxMoveCount = maxMoveCount;
    }

    public int getxLocation() {
        return xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public TBSPlayer getOwner() {
        return owner;
    }
}
