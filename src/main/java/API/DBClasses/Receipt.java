package API.DBClasses;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class Receipt {

    private int ReceiptID;
    private int AlbumID;
    private int CustomerID;
    private String Date;

    public Receipt(int receiptID, int albumID, int customerID, String date) {
        ReceiptID = receiptID;
        AlbumID = albumID;
        CustomerID = customerID;
        Date = date;
    }

    public int getReceiptID() {
        return ReceiptID;
    }

    public int getAlbumID() {
        return AlbumID;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public String getDate() {
        return Date;
    }
}
