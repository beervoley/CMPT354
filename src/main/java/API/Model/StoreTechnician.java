package API.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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

    public static String buildJSON(ResultSet rset) {
        List<StoreTechnician> storeTechnicianList = new ArrayList<>();
        try {
            while (rset.next()) {
                storeTechnicianList.add(new StoreTechnician(rset.getInt("EmployeeID"),
                        rset.getString("EmployeeName").trim())
                );
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.toJson(storeTechnicianList);
        } catch (Exception ex) {
            System.out.println("During building a JSON response: " + ex.toString());
        }
        return null;
    }
}