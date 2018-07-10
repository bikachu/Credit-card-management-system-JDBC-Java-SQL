package Dao;

import java.sql.SQLException;

public interface TransactionDao {

    public void getTransactionByZipcode(String Zip_code, int month, int year, int ssn) throws SQLException;
    public void TransactionNumberAndValue(String transaction_type) throws SQLException;
    public void getTransactionByState( String state) throws SQLException;

}
