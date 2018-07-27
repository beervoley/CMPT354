package API.DBCommunication;

import API.Model.*;

import java.sql.*;

/**
 * Created by vsevolod on 2018-07-23.
 */
public class DBCommun {



    // Manager Table functions
    public static String getAllManagersQuery() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllManagersQuery(), connection)) {
            return Manager.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getManagerByFirstNameQuery(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getManagerByFirstNameQuery(name), connection)) {
            return Manager.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getManagerByFullNameQuery(String firstName, String lastName) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getManagerByFullNameQuery(firstName, lastName), connection)) {
            return Manager.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    }
    public static String getManagerByIDQuery(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getManagerByIDQuery(id), connection)) {
            return Manager.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String deleteManagerByIDQuery(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.deleteManagerByIDQuery(id), connection)) {
            return Manager.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested


    // StoreTechnician Talbe Functions
    public static String getAllStoreTechniciansQuery() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllStoreTechniciansQuery(), connection)) {
            return StoreTechnician.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getStoreTechnicianByFirstNameQuery(String name) {
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
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getStoreTechnicianByIDQuery(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getStoreTechnicianByIDQuery(id), connection)) {
            return StoreTechnician.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String deleteStoreTechnicianByIDQuery(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.deleteStoreTechnicianByIDQuery(id), connection)) {
            return StoreTechnician.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested


    // Customer Table Functions
    public static String getAllCustomersQuery() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllCustomersQuery(), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getCustomerByFirstNameQuery(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getCustomerByFirstNameQuery(name), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getCustomerByFullNameQuery(String firstName, String lastName) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getCustomerByFullNameQuery(firstName, lastName), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getCustomerByIDQuery(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getCustomerByIDQuery(id), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String deleteCustomerByIDQuery(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.deleteCustomerByIDQuery(id), connection)) {
            return Customer.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested


    // Album Table Functions
    public static String getAllAlbumsQuery() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllAlbumsQuery(), connection)) {
            return Album.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getAlbumByNameQuery(String name) {
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
    public static String deleteAlbumByIDQuery(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.deleteAlbumByIDQuery(id), connection)) {
            return Album.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested

    // Artist Table Functions
    public static String getAllArtistsQuery() {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getAllArtistsQuery(), connection)) {
            return Artist.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getArtistByIDQuery(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getArtistByIDQuery(id), connection)) {
            return Artist.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getArtistByFirstNameQuery(String name) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getArtistByFirstNameQuery(name), connection)) {
            return Artist.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String getArtistByFullNameQuery(String firstName, String lastName) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.getArtistByFullNameQuery(firstName, lastName), connection)) {
            return Artist.buildJSON(resultSet);
        } catch (Exception ex) {
            System.out.println(String.format("Error during query execution: %s", ex.toString()));
        }
        return "";
    } // tested
    public static String deleteArtistByIDQuery(int id) {
        try(Connection connection = getConnection();
            ResultSet resultSet = runQuery(Queries.deleteArtistByIDQuery(id), connection)) {
            return Artist.buildJSON(resultSet);
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
}
