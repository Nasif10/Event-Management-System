package eventmanagementsystem;

/**
 *
 * @author zahid
 */
public class OrderDetailsHolder {

    
    String eventType;
    int orderID,customerID,waiters,chef,photographers,chairs,tables,glasses,plates;
    String date,time;
    int lights,flowers,foodItem1,foodItem2,foodItem3,foodItem4,foodItem5,totalamount;
    String address,Res_name;
    int Res_id;

    public OrderDetailsHolder(String eventType, int orderID, int customerID, int waiters, int chef, int photographers, int chairs, int tables, int glasses, int plates, String date, String time, int lights, int flowers, int foodItem1, int foodItem2, int foodItem3, int foodItem4, int foodItem5, int totalamount, String address, String Res_name, int Res_id) {
        this.eventType = eventType;
        this.orderID = orderID;
        this.customerID = customerID;
        this.waiters = waiters;
        this.chef = chef;
        this.photographers = photographers;
        this.chairs = chairs;
        this.tables = tables;
        this.glasses = glasses;
        this.plates = plates;
        this.date = date;
        this.time = time;
        this.lights = lights;
        this.flowers = flowers;
        this.foodItem1 = foodItem1;
        this.foodItem2 = foodItem2;
        this.foodItem3 = foodItem3;
        this.foodItem4 = foodItem4;
        this.foodItem5 = foodItem5;
        this.totalamount = totalamount;
        this.address = address;
        this.Res_name = Res_name;
        this.Res_id = Res_id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getWaiters() {
        return waiters;
    }

    public void setWaiters(int waiters) {
        this.waiters = waiters;
    }

    public int getChef() {
        return chef;
    }

    public void setChef(int chef) {
        this.chef = chef;
    }

    public int getPhotographers() {
        return photographers;
    }

    public void setPhotographers(int photographers) {
        this.photographers = photographers;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public int getTables() {
        return tables;
    }

    public void setTables(int tables) {
        this.tables = tables;
    }

    public int getGlasses() {
        return glasses;
    }

    public void setGlasses(int glasses) {
        this.glasses = glasses;
    }

    public int getPlates() {
        return plates;
    }

    public void setPlates(int plates) {
        this.plates = plates;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public int getFlowers() {
        return flowers;
    }

    public void setFlowers(int flowers) {
        this.flowers = flowers;
    }

    public int getFoodItem1() {
        return foodItem1;
    }

    public void setFoodItem1(int foodItem1) {
        this.foodItem1 = foodItem1;
    }

    public int getFoodItem2() {
        return foodItem2;
    }

    public void setFoodItem2(int foodItem2) {
        this.foodItem2 = foodItem2;
    }

    public int getFoodItem3() {
        return foodItem3;
    }

    public void setFoodItem3(int foodItem3) {
        this.foodItem3 = foodItem3;
    }

    public int getFoodItem4() {
        return foodItem4;
    }

    public void setFoodItem4(int foodItem4) {
        this.foodItem4 = foodItem4;
    }

    public int getFoodItem5() {
        return foodItem5;
    }

    public void setFoodItem5(int foodItem5) {
        this.foodItem5 = foodItem5;
    }

    public int getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(int totalamount) {
        this.totalamount = totalamount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRes_name() {
        return Res_name;
    }

    public void setRes_name(String Res_name) {
        this.Res_name = Res_name;
    }

    public int getRes_id() {
        return Res_id;
    }

    public void setRes_id(int Res_id) {
        this.Res_id = Res_id;
    }
    
    
    
}
