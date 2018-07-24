package Model;

import java.util.Date;

public class Receipt {
    private int receiptID;
    private int albumID;
    private int customerID;
    private Date date;

    public Receipt(int receiptID, int albumID, int customerID, Date date) {
        this.receiptID = receiptID;
        this.albumID = albumID;
        this.customerID = customerID;
        this.date = date;
    }

    public Receipt(){
        this.receiptID = -1;
    }

    public int getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
