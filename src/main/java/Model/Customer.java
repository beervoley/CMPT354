package Model;

public class Customer {
    private int customerID;
    private String customerName;
    private int referralCount;
    private int[] referrals = new int[5];

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getReferalCount() {
        return referralCount;
    }

    public void setReferalCount(int referalCount) {
        this.referralCount = referalCount;
    }

    public Customer(int customerID, String customerName, int referralCount,int r1,int r2,int r3,int r4,int r5) {

        this.customerID = customerID;
        this.customerName = customerName;
        this.referralCount = referralCount;
        referrals[0]=r1;
        referrals[1]=r2;
        referrals[2]=r3;
        referrals[3]=r4;
        referrals[4]=r5;
    }

    public Customer(){
        this.customerID = -1;
    }
}
