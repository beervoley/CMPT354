package Model;

public class StoreTechnician {
    private int employeeID;
    private String employeeName;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public StoreTechnician(int employeeID, String employeeName) {

        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public StoreTechnician() {
        this.employeeID = -1;
    }
}
