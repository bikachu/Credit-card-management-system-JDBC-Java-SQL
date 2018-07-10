package BasicJava;

import java.sql.*;

public class connection {
    private Connection myConn = null;
    private Statement myStmt = null;
    private ResultSet myRs = null;

    private String dbUrl = "jdbc:mysql://localhost:3306/jdbc?useSSL=false";
    private String user = "root";
    private String pass = "wslyp8288245";


    public Connection getConnection() throws SQLException{

        myConn = DriverManager.getConnection(dbUrl, user, pass);

        System.out.println("Connecting to the database..........\nDatabase connection successful!\n");

        return myConn;

    }

    public ResultSet getConnectionToCheckSSN(String sql) throws SQLException{

        myConn = DriverManager.getConnection(dbUrl, user, pass);
        myStmt = myConn.createStatement();
        myRs = myStmt.executeQuery(sql);
        return myRs;

    }

    public ResultSet executesql(String sql) throws SQLException{

        myStmt = myConn.createStatement();

        System.out.println("Executing your command............\nplease hold>>>>>>>>>>\n");
        myRs = myStmt.executeQuery(sql);

        return myRs;
        }

    public ResultSet updatesql(String sql1, String sql2) throws SQLException{

        myStmt = myConn.createStatement();

        System.out.println("Updating the databse........\n");
        int Rows = myStmt.executeUpdate(sql1);
        ResultSet myRs_2 = myStmt.executeQuery(sql2);

        return myRs_2;
    }

    public void close_connection(Connection myConn, ResultSet myRs)throws SQLException{

        if(myRs.next()){
                if (myConn != null) {
                    myConn.close();
                }
            }

    }
}