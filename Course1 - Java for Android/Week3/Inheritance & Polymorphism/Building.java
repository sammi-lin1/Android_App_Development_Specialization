package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // TODO - Put your code here.
    private int mLotLength;
    private int mLotWidth;
    private int l;
    private int w;

    public Building(int length, int width, int lotLength, int lotWidth) {
        l = length;
        w = width;
        mLotLength = lotLength;
        mLotWidth = lotWidth;
    }

    public int getLength() {
        return l;
    }

    public int getWidth() {
        return w;
    }

    public int getLotLength() {
        return mLotLength;
    }

    public int getLotWidth() {
        return mLotWidth;
    }

    public void setLength(int length) {
        l = length;
    }

    public void setWidth(int width) {
        w = width;
    }

    public void setLotLength(int lotLength) {
        mLotLength = lotLength;
    }

    public void setLotWidth(int lotWidth) {
        mLotWidth = lotWidth;
    }

    public int calcBuildingArea() {
        return l *  w;
    }

    public int calcLotArea() {
        return mLotLength * mLotWidth;
    }

    public String toString() {
        return "Building";
    }
}
