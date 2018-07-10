package module;
//author: Peter Li
import BasicJava.MyQuery;
import BasicJava.connection;
import Dao.customersDao;
import java.sql.*;

public class customersDaoImpl implements customersDao
{
    public customersDaoImpl() {
        super();}

//author: Peter Li

    private Connection myConn = null;
    private ResultSet myRs = null;


    @Override
    public void checkAccount(int ssn) throws SQLException{

        String sql = String.format(MyQuery.getAccountDetail,ssn);
        connection c1 = new connection();

        myConn = c1.getConnection();
        myRs = c1.executesql(sql);

        System.out.println("the result is: ");

        if( !myRs.next()){
                System.out.println("The database don't records for you Social Security Number\nPlease check your SSN");
        }
        while( myRs.next()){
                    System.out.println("             " + myRs.getString("first_name") + " " +
                    myRs.getString("middle_name")+ " " +  myRs.getString("last_name")+ " "+
                    myRs.getInt("ssn")+ " " + myRs.getString("credit_card_no") + " " +
                    myRs.getString("apt_no")+ " " + myRs.getString("street_name")+ " " +
                    myRs.getString("cust_city")+  " " + myRs.getString("cust_state") + " " +
                    myRs.getString("cust_country")+ " " + myRs.getString("cust_zip")+ " " + myRs.getInt("cust_phone")+ " " +
                    myRs.getString("cust_email")+  " " + myRs.getTimestamp("last_updated") + " " +
                    myRs.getInt("transaction_id")+ " " + myRs.getInt("day") + " " + myRs.getInt("month") + " " +
                    myRs.getInt("year")+ " " + myRs.getString("credit_card_no")+ " " +myRs.getInt("branch_code")+ " "+
                    myRs.getString("Transaction_type")+ " " + myRs.getBigDecimal("transaction_value"));

                   }
        c1.close_connection(myConn, myRs);

        }


    @Override
    public void modifyAccount(String apt_no,String street_name, String cust_city, String cust_state, String cust_zip, int ssn) throws SQLException{

        String sql = String.format(MyQuery.modifyAccountDetail,apt_no,street_name,cust_city,cust_state,cust_zip,ssn);
        String sql2 = String.format(MyQuery.modifyAccountDetail2,ssn);

        connection c2 = new connection();

        Connection myConn = c2.getConnection();
        ResultSet myRs  = c2.updatesql(sql,sql2);


        myRs.next();
        System.out.println("Your updated information is:  " + myRs.getString("first_name") + " " +
                    myRs.getString("middle_name") + " " + myRs.getString("last_name") + " " +
                    myRs.getInt("ssn") + " " + myRs.getString("credit_card_no") + " " +
                    myRs.getString("apt_no") + " " + myRs.getString("street_name") + " " +
                    myRs.getString("cust_city") + " " + myRs.getString("cust_state") + " " +
                    myRs.getString("cust_country") + " " + myRs.getString("cust_zip") + " " + myRs.getInt("cust_phone") + " " +
                    myRs.getString("cust_email") + " " + myRs.getTimestamp("last_updated"));

        c2.close_connection(myConn,myRs);


    }

    @Override
    public void getMonthlyBill(String credit_card_no, int month, int year) throws SQLException {

        String sql_3 = String.format(MyQuery.getMonthlyBill,credit_card_no,month,year);
        connection c3 = new connection();

        Connection myConn = c3.getConnection();
        ResultSet myRs = c3.executesql(sql_3);

        if(!myRs.next()){
            System.out.println("The database don't have the information you required\n Please check your data first");
            c3.close_connection(myConn, myRs);
        }
        else{
            System.out.println("The monthly bill you slected is :  " + "Month" + " " + "Year" +" " + "Credit_card_no"+ "    "+"Total_bill");
            System.out.println("                                   " + " " +
                    myRs.getInt("month") + "    " +
                    myRs.getInt("year")+ "  "+ myRs.getString("credit_card_no")+ "  "+
                    myRs.getBigDecimal("Total_bill"));
            c3.close_connection(myConn, myRs);
        }
    }



    @Override
    public void  checkTransactionBetweenDates(int year1, int month1, int day1, int year2, int month2, int day2, int ssn) throws SQLException{

        String sql_4 = String.format(MyQuery.getTransactionBetweenTwoDates,year1, month1,day1,year2, month2,day2,ssn);
        connection c4 = new connection();

        Connection myConn = c4.getConnection();
        ResultSet myRs = c4.executesql(sql_4);

        if(myRs.next() ==false){
            System.out.println("The database don't have the information you required\nPlease check your input dates");
            c4.close_connection(myConn, myRs);
        }


        else{
            System.out.println("the transaction detail is: ");
            while(myRs.next()){
                System.out.println("                           " + myRs.getString("first_name") + " " +
                        myRs.getString("last_name")+ " "+ myRs.getInt("transaction_id")+ " "+
                        myRs.getString("Transaction_type")+ " " + myRs.getBigDecimal("transaction_value") + " " +
                        myRs.getDate("dates"));
            }
            c4.close_connection(myConn, myRs);

        }
    }

    public ResultSet checkSSN(int ssn) throws SQLException{

        String sql = String.format(MyQuery.checkSSN,ssn);
        connection c5 = new connection();

        myRs = c5.getConnectionToCheckSSN(sql);
        return myRs;

    }
}
//author: Peter Li
