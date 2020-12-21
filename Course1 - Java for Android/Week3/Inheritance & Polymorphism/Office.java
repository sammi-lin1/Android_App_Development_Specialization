package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
    // TODO - Put your code here.
    private int parking;
    private String busName;
    private static int offices = 0;

    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        busName = null;
        parking = 0;
        offices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        this(length, width, lotLength, lotWidth);
        busName = businessName;
        parking = 0;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        this(length, width, lotLength, lotWidth, businessName);
        busName = null;
        parking = parkingSpaces;
    }

    public String getBusinessName() {
        return busName;
    }

    public int getParkingSpaces() {
        return parking;
    }

    public static int getTotalOffices() {
        return offices;
    }

    public void setBusinessName(String businessName) {
        busName = businessName;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parking = parkingSpaces;
    }

    public String toString() {
        String result = "Business: ";
        if(this.getBusinessName()!= null) {
            result += busName;
        }else{
            result += "unoccupied";
        }
        if(this.getParkingSpaces()>0){
            result += "; has "+ parking + " parking spaces";
        }
        return result+" (total offices: " + offices + ")";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Office) {
            Office otherOffice = (Office) obj;
            if (otherOffice.calcBuildingArea() == this.calcBuildingArea() && otherOffice.getParkingSpaces() == this.getParkingSpaces())
                return true;
        }
        return false;
    }
    
}
