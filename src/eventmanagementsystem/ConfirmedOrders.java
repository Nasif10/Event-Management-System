/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanagementsystem;

/**
 *
 * @author zahid
 */
public class ConfirmedOrders {
    String orderDate,orderTime,EventAddress,Res_name;
    int bill_no,Res_id,orderID,customerID,totalAmount;

    public ConfirmedOrders(String orderDate, String orderTime, String EventAddress, String Res_name, int bill_no, int Res_id, int orderID, int customerID, int totalAmount) {
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.EventAddress = EventAddress;
        this.Res_name = Res_name;
        this.bill_no = bill_no;
        this.Res_id = Res_id;
        this.orderID = orderID;
        this.customerID = customerID;
        this.totalAmount = totalAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getEventAddress() {
        return EventAddress;
    }

    public void setEventAddress(String EventAddress) {
        this.EventAddress = EventAddress;
    }

    public String getRes_name() {
        return Res_name;
    }

    public void setRes_name(String Res_name) {
        this.Res_name = Res_name;
    }

    public int getBill_no() {
        return bill_no;
    }

    public void setBill_no(int bill_no) {
        this.bill_no = bill_no;
    }

    public int getRes_id() {
        return Res_id;
    }

    public void setRes_id(int Res_id) {
        this.Res_id = Res_id;
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

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    
}
