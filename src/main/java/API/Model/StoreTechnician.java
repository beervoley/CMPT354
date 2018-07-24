package API.Model;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class StoreTechnician {

    private int EmployeeID;
    private String EmployeeName;

    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public StoreTechnician(int employeeID, String employeeName) {
        EmployeeID = employeeID;
        EmployeeName = employeeName;
    }
}