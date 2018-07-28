package API.DBCommunication;

import API.Model.*;

import java.sql.*;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class DBCommun {



    // Manager Table functions
    public static String getAllManagers() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllManagersQuery(), connection)) {
            return Manager.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getManagerByFirstName(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getManagerByFirstNameQuery(name), connection)) {
            return Manager.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getManagerByFullName(String firstName, String lastName) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getManagerByFullNameQuery(firstName, lastName), connection)) {
            return Manager.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String getManagerByID(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getManagerByIDQuery(id), connection)) {
            return Manager.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String deleteManagerByID(int id) {
        try(Connection connection = getConnection()) {
            return runQueryDML(Queries.deleteManagerByIDQuery(id), connection);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested


    // StoreTechnician Talbe Functions
    public static String getAllStoreTechnicians() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllStoreTechniciansQuery(), connection)) {
            return StoreTechnician.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getStoreTechnicianByFirstName(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getStoreTechnicianByFirstNameQuery(name), connection)) {
            return StoreTechnician.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getStoreTechnicianByFullNameQuery(String firstName, String lastName) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getStoreTechnicianByFullNameQuery(firstName, lastName), connection)) {
            return StoreTechnician.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during  execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getStoreTechnicianByID(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getStoreTechnicianByIDQuery(id), connection)) {
            return StoreTechnician.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String deleteStoreTechnicianByID(int id) {
        try(Connection connection = getConnection()) {
            return runQueryDML(Queries.deleteStoreTechnicianByIDQuery(id), connection);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested


    // Customer Table Functions
    public static String getAllCustomers() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllCustomersQuery(), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getCustomerByFirstName(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getCustomerByFirstNameQuery(name), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getCustomerByFullName(String firstName, String lastName) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getCustomerByFullNameQuery(firstName, lastName), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getCustomerByID(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getCustomerByIDQuery(id), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getNumberOfPurchasesPerCustomer() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getNumberOfPurchasesPerCustomerQuery(), connection)) {
            return Customer.buildJSON(resultSet, true);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String getCustomersWhoBoughtAllTheAlbums() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getCustomersWhoBoughtAllTheAlbums(), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String deleteCustomerByIDQuery(int id) {
        try(Connection connection = getConnection()) {
            return runQueryDML(Queries.deleteCustomerByIDQuery(id), connection);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested


    // Album Table Functions
    public static String getAllAlbums() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllAlbumsQuery(), connection)) {
            return Album.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getAlbumByName(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAlbumByNameQuery(name), connection)) {
            return Album.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getAlbumByID(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAlbumByID(id), connection)) {
            return Album.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getAlbumByOneSearchStringASC(String s1) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAlbumByOneSearchStringASC(s1), connection)) {
            return Album.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String getAlbumByOneSearchStringDESC(String s1) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAlbumByOneSearchStringDESC(s1), connection)) {
            return Album.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String getAlbumByTwoSearchStringASC(String s1, String s2) {

        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAlbumByTwoSearchStringASC(s1, s2), connection)) {
            return Album.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String getAlbumByTwoSearchStringDESC(String s1, String s2) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAlbumByTwoSearchStringDESC(s1, s2), connection)) {
            return Album.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static int getNumberOfAlbums() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getNumberOfAlbums(), connection)) {
            if(resultSet.next()) {
                return resultSet.getInt("Count");
            }
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return 0;
    }
    public static String deleteAlbumByID(int id) {
        try(Connection connection = getConnection()) {
            return runQueryDML(Queries.deleteAlbumByIDQuery(id), connection);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested

    // Artist Table Functions
    public static String getAllArtists() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllArtistsQuery(), connection)) {
            return Artist.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getArtistByID(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getArtistByIDQuery(id), connection)) {
            return Artist.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getArtistByFirstName(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getArtistByFirstNameQuery(name), connection)) {
            return Artist.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getArtistByFullName(String firstName, String lastName) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getArtistByFullNameQuery(firstName, lastName), connection)) {
            return Artist.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String updateArtistNameByID(int id, String name) {
        try(Connection connection = getConnection()) {
            return runQueryDML(Queries.updateArtistNameQuery(id, name), connection);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String deleteArtistByID(int id) {
        try(Connection connection = getConnection()) {
            return runQueryDML(Queries.deleteArtistByIDQuery(id), connection);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }


    // Receipt Table Functions
    public static String getAllReceipts() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllReceiptsQuery(), connection)) {
            return Receipt.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getReceiptByID(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getReceiptByIDQuery(id), connection)) {
            return Receipt.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getReceiptsByCustomerName(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getReceiptsByCustomerNameQuery(name), connection)) {
            return Receipt.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getReceiptsByCustomerFullName(String firstName, String lastName) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getReceiptsByCustomerFullNameQuery(firstName, lastName),
                    connection)) {
            return Receipt.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getReceiptsByAlbumName(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getReceiptsByAlbumNameQuery(name), connection)) {
            return Receipt.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } //
    public static String getReceiptsByCustomerID(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getReceiptsByCustomerIDQuery(id), connection)) {
            return Receipt.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String getReceiptsByAlbumID(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getReceiptsByAlbumIDQuery(id), connection)) {
            return Receipt.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String deleteReceiptByID(int id) {
        try(Connection connection = getConnection()) {
            return runQueryDML(Queries.deleteReceiptByIDQuery(id), connection);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }


    private static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://den1.mssql3.gear.host;" +
                    "user=cmpt354;" +
                    "password=Hn9M-8K5G4~2");
        } catch (Exception ex) {
            System.out.println("Connection could not be establihed. Reason: " + ex.toString());

        }
        return null;
    }

    public static ResultSet runQuery(String query, Connection connection) {
        if(connection != null) {
            try {
                Statement stl = connection.createStatement();
                ResultSet queryResult = stl.executeQuery(query);
                System.out.println("Query executed successfully");
                return queryResult;
            } catch (Exception ex) {
                System.out.println("Query could not be executed. Reason: " + ex.toString());
            }
        }
        return null;
    }

    public static String runQueryDML(String query, Connection connection) {
        if(connection != null) {
            try {
                PreparedStatement stl = connection.prepareStatement(query);
                int result = stl.executeUpdate();
                if(result>0) {
                    System.out.println("Query executed successfully");
                    return ("Query executed successfully");
                }
                else {
                    System.out.println("Error during UPDATE/INSERT/DELETE");
                    return ("Error during UPDATE/INSERT/DELETE");
                }


            } catch (Exception ex) {
                System.out.println("Query could not be executed. Reason: " + ex.toString());
            }
        }
        return null;
    }
}
