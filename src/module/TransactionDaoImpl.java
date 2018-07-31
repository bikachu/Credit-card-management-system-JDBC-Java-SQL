package module;

import BasicJava.MyQuery;
import BasicJava.connection;
import Dao.TransactionDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionDaoImpl implements TransactionDao {

    public TransactionDaoImpl() {
        super();

    }
    private Connection myConn = null;
    private ResultSet myRs = null;

    @Override
    public void getTransactionByZipcode(String Zip_code, int month, int year, int ssn) throws SQLException {

        String sql = String.format(MyQuery.getTransactionByZipCode, Zip_code, month, year, ssn);

        connection t1 = new connection();

        Connection myConn = t1.getConnection();
        ResultSet myRs = t1.executesql(sql);

        if( !myRs.next()){
            System.out.println("The database don't transaction detail for the input month and year");
        }
         System.out.println("The transaction details are: "+""+"ID"+"    "+"D"+"  "+"M"+ "   "+ "Y"+"     "+"Credit Card No"+ "  "+ "Type"+ " "+"Value" );
        while (myRs.next()) {
            System.out.println("                             " +
                    myRs.getInt("transaction_id") + " " + myRs.getInt("day") + " " + myRs.getInt("month") + " " +
                    myRs.getInt("year") + " " + myRs.getString("credit_card_no") + " " +
                    myRs.getString("Transaction_type") + " " + myRs.getBigDecimal("transaction_value"));

        }

        t1.close_connection(myConn, myRs);


    }

    @Override
    public void TransactionNumberAndValue(String transaction_type) throws SQLException {

        String sql2 = String.format(MyQuery.getTransactionType, transaction_type);
        connection t2 = new connection();

        Connection myConn = t2.getConnection();
        ResultSet myRs = t2.executesql(sql2);

        while(myRs.next()){

            System.out.println("The result is : Total_Number Total_Value");
            System.out.println("                 " + myRs.getString("Number_of_Transactions") + "           " +
                    myRs.getInt("Total_Value"));
            t2.close_connection(myConn, myRs);

        }
    }


    @Override
    public void getTransactionByState(String state) throws SQLException {

        String sql3 = String.format(MyQuery.getTransactionByState, state);

        connection t3 = new connection();

        Connection myConn3 = t3.getConnection();
        ResultSet myRs3 = t3.executesql(sql3);

        System.out.println("The result is : Number Total_Value");
        while (myRs3.next()) {
            System.out.println("                 " + myRs3.getString("Number_of_Transactions") + " " +
                    myRs3.getInt("Total_Value"));

        }
        t3.close_connection(myConn3,myRs3);
    }

    public ResultSet checkSSN(int ssn) throws SQLException{

        String sql = String.format(MyQuery.checkSSN,ssn);
        connection t4 = new connection();

        myRs = t4.getConnectionToCheckSSN(sql);
        return myRs;

    }

    public ResultSet checkType(String string) throws SQLException{

        String sql = String.format(MyQuery.checkType,string);
        connection t5 = new connection();

        myRs = t5.getConnectionToCheckSSN(sql);
        return myRs;

    }

    public ResultSet checkState(String string) throws SQLException{

        String sql = String.format(MyQuery.checkState,string);
        connection t6 = new connection();

        myRs = t6.getConnectionToCheckSSN(sql);
        return myRs;

    }
}
