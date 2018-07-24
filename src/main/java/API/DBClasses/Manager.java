package API.DBClasses;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class Manager {

    private int EmployeeID;
    private String EmployeeName;

    public int getEmployeeID() {
        return EmployeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public Manager(int employeeID, String employeeName) {
        EmployeeID = employeeID;
        EmployeeName = employeeName;
    }
}
