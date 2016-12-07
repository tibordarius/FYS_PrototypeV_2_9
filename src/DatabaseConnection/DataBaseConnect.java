/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;

/**
 *
 * @author T. v Duykeren
 */

import java.sql.*;


public class DataBaseConnect {
    
    private PreparedStatement preparedStatement = null;
    private Connection connect;
    private Statement statement;
    private ResultSet resultSet;
    public static DataBaseConnect db;
    private Statement st;
    ResultSet rs;
    
    private final String user = "root";
    private final String url = "localhost:3306";
    private final String password = "root";
    
    public DataBaseConnect() {
        try {
            //connectie =maken
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection(url, user, password);
            
            System.out.println("There is a connection to the database");
        
            
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            e.printStackTrace();
            System.out.println("There is a connection error.");
            }
        
    }
    
   public static synchronized DataBaseConnect getDatabaseConnect() {
   
       //perform a check to see if there is a connection to the database.
       if (db == null) {
       db = new DataBaseConnect();
       }
       
       return db;
   }
    
    // INSERT query
    public int insert(String insertQuery) throws SQLException {
        st = connect.createStatement();
        int result = statement.executeUpdate(insertQuery);

        return result;
    }

    // SELECT query
    public ResultSet selectquery(String selectquery) throws SQLException {
        st = connect.createStatement();
        rs = st.executeQuery(selectquery);

        return rs;
    }

    // UPDATE query
    public void update(String updateQuery) throws SQLException {
        preparedStatement = connect.prepareStatement(updateQuery);
        preparedStatement.executeUpdate();
    }

    // DELETE query
    public void delete(String deleteQuery) throws SQLException {
        preparedStatement = connect.prepareStatement(deleteQuery);
        //preparedStatement.setInt(1, id);

        preparedStatement.executeUpdate();
    }

    // close the database connection
    public void closeCon() throws SQLException {
        connect.close();
    }
    /* 
    *moet nog een inlog maken.
    *kan nog custom preparedstatements maken voor acties zoals bagage invoeren users aanmaken en verwijderen, etc.
    *moet nog een log maken.
    */
    
}
