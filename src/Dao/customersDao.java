package Dao;

import java.sql.SQLException;

public interface customersDao {

    public void checkAccount(int ssn) throws SQLException ;
    public void modifyAddress(String apt_no,String street_name, String cust_city, String cust_state, String cust_zip, int ssn )throws SQLException;
    public void modifyName(String first_name, String middle_name, String last_name,int ssn)throws SQLException;
    public void modifyPhone(int cust_phone, int ssn)throws SQLException;
    public void modifyEmail(String cust_email, int ssn)throws SQLException;
    public void getMonthlyBill(String credit_card_no, int month, int year) throws SQLException;
    public void checkTransactionBetweenDates(int year1, int month1, int day1, int year2, int month2, int day2, int ssn) throws SQLException;
}

