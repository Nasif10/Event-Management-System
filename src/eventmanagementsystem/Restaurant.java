package eventmanagementsystem;

/**
 *
 * @author zahid
 */
public class Restaurant {
    private int Res_ID;
    private String Res_Name,Location;
    private int Capacity,Booking_Cost;

    public Restaurant(int Res_ID, String Res_Name, String Location, int Capacity, int Booking_Cost) {
        this.Res_ID = Res_ID;
        this.Res_Name = Res_Name;
        this.Location = Location;
        this.Capacity = Capacity;
        this.Booking_Cost = Booking_Cost;
    }

    public int getRes_ID() {
        return Res_ID;
    }

    public void setRes_ID(int Res_ID) {
        this.Res_ID = Res_ID;
    }

    public String getRes_Name() {
        return Res_Name;
    }

    public void setRes_Name(String Res_Name) {
        this.Res_Name = Res_Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public int getBooking_Cost() {
        return Booking_Cost;
    }

    public void setBooking_Cost(int Booking_Cost) {
        this.Booking_Cost = Booking_Cost;
    }
    
    
    
    
}
