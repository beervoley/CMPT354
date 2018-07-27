package API.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    private static String buildManagerGSON(ResultSet rset) {
        List<Manager> managerList = new ArrayList<>();
        try {
            while (rset.next()) {
                managerList.add(new Manager(rset.getInt("ManagerID"),
                        rset.getString("ManagerName").trim())
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(managerList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }
}
