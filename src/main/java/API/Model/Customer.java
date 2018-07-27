package API.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class Customer {

    private int CustomerID;
    private String CustomerName;
    private int ReferalCount;

    public int getCustomerID() {

        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public int getReferalCount() {
        return ReferalCount;
    }

    public Customer(int customerID, String customerName, int referalCount) {
        CustomerID = customerID;
        CustomerName = customerName;
        ReferalCount = referalCount;
    }


    private static String buildCustomerGSON(ResultSet rset){
        List<Customer> customerList = new ArrayList<>();
        try{
            while (rset.next()) {
                customerList.add(new Customer(rset.getInt("CustomerID"),
                        rset.getString("CustomerName").trim(),
                        rset.getInt("ReferalCount"))
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(customerList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }
}
