package eventmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlConnect {
          
    public Connection connection;
    public Statement statement;  
    public ResultSet resultSet;
    
    
    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection( "jdbc:sqlserver://localhost:1433;databaseName=EMSDB;selectMethod=cursor", "sa", "123456");

            //System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            statement = connection.createStatement();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       // sqlConnect cnObj = new sqlConnect();
        //cnObj.connectDB();
    }
    
}
    

