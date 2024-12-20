package Database;
import java.sql;
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
                System.out.println("\n"+dbname+ " Database connected");
                statement = connection.createStatement();
            } else{
                System.out.println("Error connecting on database");
            }
        } catch (Exception e) {
            System.out.println("Error connecting on databse");
            e.printStackTree();
        }
    }

    
}
