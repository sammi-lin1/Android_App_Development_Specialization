package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
    // TODO - Put your code here.
    private boolean pool;
    private String owner;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        this(length, width, lotLength, lotWidth);
        this.owner = owner;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        this(length, width, lotLength, lotWidth, owner);
        this.pool = pool;
    }

    public String getOwner() {
        return owner;
    }

    public boolean hasPool() {
        return pool;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public String toString() {
        String result = "Owner: ";
        if (owner != null)
            result += getOwner();
        else
            result += "n/a";
        if (pool)
            result += "; has a pool";
        if(this.calcLotArea() > 2*this.calcBuildingArea())
            result += "; has a big open space";
        return result;
    }

    public boolean equals(Object obj) {
        if (obj instanceof House) {
            House otherHouse = (House) obj;
            if (otherHouse.calcBuildingArea() == this.calcBuildingArea() && otherHouse.hasPool() == this.hasPool())
                return true;
        }
        return false;
    }
    
}
