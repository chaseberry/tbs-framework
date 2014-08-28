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

    public void onSelect(TBSPlayer selector, TBSMap map){
        TBSBuilding building = map.buildingOnTile(this);
        TBSUnit unit = map.unitOnTile(this);
        if(unit != null){
            unit.onSelect(selector);
        }
        if(building != null){
            building.onSelect(selector);
        }
    }

    public abstract boolean canUnitMove(TBSUnit unit);

    public abstract boolean canBuild(TBSBuilding building);

    public abstract void turnStarts(TBSPlayer player);

    public void onDeselect(TBSPlayer selector){}

    public void unitEnters(TBSUnit unit){}

    public void unitExits(TBSUnit unit){}

    public double distanceToTile(TBSTile tile){
        return 0;
    }

}
