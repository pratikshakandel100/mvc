package Database;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;

public class DbConnection {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    int value;
    public DbConnection(){
        try{
            String username = "root";
            String password = "root";
            String dbName = "book";
            String db_url = String.format("jdbc:mysql://localhost:3306/%s", dbName);
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(db_url, username, password);
            if (connection != null){
                System.out.println("\n"+dbName+ " Database connected");
                statement = connection.createStatement();
            } else{
                System.out.println("Error connecting on database");
            }
        } catch (Exception e) {
            System.out.println("Error connecting on databse");
            e.printStackTrace();
        }
        
  
  }

// insert, update, delete
  public int executeOnly(String query){
    try{
        value = statement.executeUpdate(query);
        connection.close();

    } catch(SQLException exception){

    }
    return value;
  }
  //selecy command
  public ResultSet executeWithSet(String query){
    try{
        resultSet = statement.executeQuery(query);
    } catch(Exception e){
        System.out.println(e);
    }
    return resultSet;
  }

}
