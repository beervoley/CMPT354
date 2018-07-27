package API.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class Receipt {

    private int ReceiptID;
    private int AlbumID;
    private int CustomerID;
    private String Date;

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

    public Receipt(int receiptID, int albumID, int customerID, String date) {
        ReceiptID = receiptID;
        AlbumID = albumID;
        CustomerID = customerID;
        Date = date;
    }

    private static String buildReceiptGSON(ResultSet rset) {
        List<Receipt> receiptList = new ArrayList<>();
        try {
            while (rset.next()) {
                receiptList.add(new Receipt(rset.getInt("ReceiptID"),
                        rset.getInt("AlbumID"),
                        rset.getInt("CustomerID"),
                        rset.getString("Date").trim())
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(receiptList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }
}
