package API.Model;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class Customer {

    private int CustomerID;
    private String CustomerName;
    private int ReferalCount;

    public Customer(int customerID, String customerName, int referalCount) {
        CustomerID = customerID;
        CustomerName = customerName;
        ReferalCount = referalCount;
    }

    public int getCustomerID() {

        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public int getReferalCount() {
        return ReferalCount;
    }
}
