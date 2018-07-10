package BasicJava;

public class MyQuery {

    //1.Transaction requirenments:
    public static final String getTransactionByZipCode =" select * from cdw_sapp_creditcard "+
            " inner join cdw_sapp_customer on cdw_sapp_customer.ssn = cdw_sapp_creditcard.cust_ssn " +
            " where cust_zip= '%s' and month= %d and year = %d and cdw_sapp_customer.ssn = %d "+
            " order by day desc ";

    public static final String getTransactionType  = " select count(*) as Number_of_Transactions, sum(transaction_value) as Total_Value "+
            " from cdw_sapp_creditcard "+
            " where transaction_type = '%s' ";

    public static final String getTransactionByState = " select count(*) as Number_of_Transactions, sum(transaction_value) as Total_value "+
            " from cdw_sapp_creditcard inner join cdw_sapp_branch "+
            " on cdw_sapp_creditcard.branch_code = cdw_sapp_branch.branch_code "+
            " where branch_state = '%s' ";


    //Customer requirements:
    public static final String getAccountDetail = " select * from cdw_sapp_customer " +
            "inner join cdw_sapp_creditcard on cdw_sapp_creditcard.credit_card_no = cdw_sapp_customer.credit_card_no" +
            " where SSN = %d ";


    public static final String modifyAccountDetail = " update cdw_sapp_customer "+
            " set apt_no = '%s', street_name = '%s', cust_city = '%s',cust_state = '%s',cust_zip = '%s' where ssn = %d ";

    public static final String modifyAccountDetail2 = " select * from cdw_sapp_customer "+
            " where ssn = %d ";

    public static final String getMonthlyBill = " select month, year, sum(transaction_value) as Total_bill, credit_card_no  from cdw_sapp_creditcard "+
            " where credit_card_no = '%s' and month = %d and year = %d " + " group by year, month " + " order by month ";

    public static final String getTransactionBetweenTwoDates = " SELECT TRANSACTION_ID ,transaction_type, TRANSACTION_VALUE, FIRST_NAME, LAST_NAME, concat(year, \"-\", LPAD(month,2,'0'), \"-\", LPAD(day,2,'0')) as Dates from cdw_sapp_creditcard inner join cdw_sapp_customer " +
            " on cdw_sapp_customer.SSN = cdw_sapp_creditcard.CUST_SSN " +
            " where ( concat(year, \"-\", LPAD(month,2,'0'), \"-\", LPAD(day,2,'0')) BETWEEN concat(%d, \"-\", LPAD(%d,2,'0'), \"-\", LPAD(%d,2,'0'))  AND concat(%d, \"-\", LPAD(%d,2,'0'), \"-\", LPAD(%d,2,'0')) ) AND cdw_sapp_customer.SSN = %d "+
            " ORDER BY 6 DESC ";

    //check if the ssn in the database:
    public static final String checkSSN = " select * from cdw_sapp_customer " +
            "inner join cdw_sapp_creditcard on cdw_sapp_creditcard.credit_card_no = cdw_sapp_customer.credit_card_no" +
            " where SSN = %d ";

    //check if the input transaction in the database
    public static final String checkType = " select * from cdw_sapp_creditcard "+
            " where transaction_type = '%s' ";

    //check if the input state in the database
    public static final String checkState = " select * from cdw_sapp_branch "+
            " where branch_state = '%s' ";
}
