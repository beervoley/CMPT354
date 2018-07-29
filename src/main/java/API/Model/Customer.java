package API.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.xml.transform.Result;
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
    private String NumberOfPurchases;

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

    public Customer(int customerID, int numberOfPurchases) {
        CustomerID = customerID;
        NumberOfPurchases = numberOfPurchases + "";
    }

    public static String buildJSON(ResultSet rset){
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

    public static String buildJSON(ResultSet rset, boolean b) {
        List<Customer> customerList = new ArrayList<>();
        try{
            while (rset.next()) {
                if(rset.getInt("CustomerID") == 0) {
                    continue;
                } else {
                    customerList.add(new Customer(rset.getInt("CustomerID"),
                            rset.getInt("Number of Purchases")
                    ));
                }

            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(customerList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }


}
